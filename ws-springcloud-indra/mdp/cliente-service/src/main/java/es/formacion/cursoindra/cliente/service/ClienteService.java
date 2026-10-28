package es.formacion.cursoindra.cliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.formacion.cursoindra.cliente.domain.Cliente;
import es.formacion.cursoindra.cliente.dto.ClienteResp;
import es.formacion.cursoindra.cliente.repo.ClienteRepo;

@Service
public class ClienteService {

	private final ClienteRepo cliRepo;

	public ClienteService(ClienteRepo cliRepo) {
		super();
		this.cliRepo = cliRepo;
	}
	
	public List<ClienteResp> findAll(){
		return cliRepo.findAll().stream().map(this::toResponse).toList();
	}
	
	public ClienteResp findById(Integer id) {
		return toResponse(cliRepo.findById(id)
			.orElseThrow(()->new RuntimeException("no existe")));
	}

	
	private ClienteResp toResponse(Cliente c) {
		return new ClienteResp(
			c.getIdPersona(), c.getApellidosYNombre(), c.getNif(), c.getMunicipio(), c.getNroCliente());
	}
}
