package es.formacion.cursoindra.cliente.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.formacion.cursoindra.cliente.dto.ClienteResp;
import es.formacion.cursoindra.cliente.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	private final ClienteService cliScio;
	
	public ClienteController(ClienteService cliScio) {
		this.cliScio = cliScio;
	}

	@GetMapping
	public List<ClienteResp> listar() {
		return cliScio.findAll();
	}
	
	@GetMapping("/{id}")
	public ClienteResp findById(@PathVariable Integer id) {
		return cliScio.findById(id);
	}
}
