package curso.springcloud.cloud.consulta.client;

import org.springframework.stereotype.Component;

@Component
public class SaludoFallback implements SaludoClient {

	@Override
	public String obtenerSaludo() {
		return "Respuesta alternativa: Saludo no responde";
	}

	@Override
	public String obtenerSaludoDemora() {
		return "Respuesta alternativa: Saludo con Demora no responde";
	}

}
