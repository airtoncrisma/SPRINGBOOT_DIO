package dio.web.api.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ai.houyi.dorado.swagger.EnableSwagger;
import ai.houyi.dorado.swagger.ext.ApiInfoBuilder;
import io.swagger.oas.annotations.info.Contact;



@Configuration
@EnableSwagger
public class SwaggerConfig<Docket> {
    private Contact contato() {
		return new Contact(
				"Seu nome",
				"http://www.seusite.com.br", 
				"voce@seusite.com.br");
	}
    private ApiInfoBuilder informacoesApi() {
		 
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
 
		apiInfoBuilder.title("Title - Rest API");
		apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
		apiInfoBuilder.license("Licença - Sua Empresa");
		apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
		apiInfoBuilder.contact(this.contato());
 
		return apiInfoBuilder;
 
	}
    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
    
        docket
        .select()
        .apis(RequestHandlerSelectors.basePackage("pacote.comseus.controllers"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(this.informacoesApi().build())
        .consumes(new HashSet<String>(Arrays.asList("application/json")))
        .produces(new HashSet<String>(Arrays.asList("application/json")));
        
        return docket;
    }
}
