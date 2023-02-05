package one.digitalinnovation.gof.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Docket é um objeto que configura tudo que é necessário no Swagger
// pegue todas a minhas Apis em todos os caminhos que tiver e gera um swagger.
@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket Swagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }
}
