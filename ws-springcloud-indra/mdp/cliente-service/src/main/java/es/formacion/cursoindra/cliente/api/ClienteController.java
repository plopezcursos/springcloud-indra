package es.formacion.cursoindra.cliente.api;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@GetMapping
	public List<Map<String, Object>> listar() {
		return List.of(Map.of("id", 1, "nombre", "Cliente de prueba"));
	}
}
