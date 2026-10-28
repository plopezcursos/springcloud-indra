package curso.springcloud.cloud.saludo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
	
	@Value("${demo.instancia:instancia-sin-etiqueta}")
	private String instancia;
	
	@GetMapping("/api/saludo")
	public String saludar() {
		return "Respuesta de: " + instancia;
	}
	
	@GetMapping("/api/saludo/demora")
	public String saludarDemora() throws InterruptedException {
		Thread.sleep(2500);
		return "Respuesta con Demora de: " + instancia;
	}
}
