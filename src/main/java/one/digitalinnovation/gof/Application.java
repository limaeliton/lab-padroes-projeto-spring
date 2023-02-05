package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 */
@EnableSwagger2
@SpringBootApplication
@EnableFeignClients // habilita o Feign no projeto
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
