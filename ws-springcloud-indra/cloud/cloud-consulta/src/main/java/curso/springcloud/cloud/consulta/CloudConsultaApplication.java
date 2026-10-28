package curso.springcloud.cloud.consulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsultaApplication.class, args);
	}

}
