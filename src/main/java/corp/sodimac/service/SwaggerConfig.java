package corp.sodimac.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    
    @Bean
    public Docket api() {                
        return new Docket(DocumentationType.SWAGGER_2)          
        .select()
        .apis(RequestHandlerSelectors.basePackage("corp.sodimac"))
        .paths(regex("/*.*"))
        .build()
        .apiInfo(apiInfo());
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
        "RESERVA REST API", 
        "Dominio de negocio: RESERVAS del DAD. Corresponden a las ordenes de venta de los canales", 
        "", 
        "Terms of service", 
        new Contact("Oliver Fierro", "www.sodimac.cl", "ofierro@sodimac.cl"),
        "Apache License Version 2.0",
        "https://www.apache.org/licenses/LICENSE-2.0");
    }

}