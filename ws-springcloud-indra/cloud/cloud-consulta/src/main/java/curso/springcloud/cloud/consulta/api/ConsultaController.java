package curso.springcloud.cloud.consulta.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.springcloud.cloud.consulta.client.SaludoClient;

@RestController
public class ConsultaController {

	private final SaludoClient saludoCli;

	public ConsultaController(SaludoClient saludoCli) {
		this.saludoCli = saludoCli;
	}
	
	@GetMapping("/api/consulta")
	public String consultar() {
		return "consulta recibio: " + saludoCli.obtenerSaludo();
	}
	
	@GetMapping("api/consulta/demora")
	public String consultarDemora() {
		return "consulta con demora recibio " + saludoCli.obtenerSaludoDemora();
	}
}
