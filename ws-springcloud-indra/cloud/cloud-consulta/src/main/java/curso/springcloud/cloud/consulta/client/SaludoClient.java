package curso.springcloud.cloud.consulta.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="cloud-saludo", fallback = SaludoFallback.class)
public interface SaludoClient {

	@GetMapping("/api/saludo")
	String obtenerSaludo();
	
	@GetMapping("/api/saludo/demora")
	String obtenerSaludoDemora();
}
