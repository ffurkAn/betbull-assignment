package com.betbull.assignment.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * OpenAPI Swagger Implementation
 * @author atanriverdi
 */
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public OpenAPI customOpenAPI() {

        Contact c = new Contact();
        c.setEmail("ffurkan.tanriverdi@gmail.com");
        c.setName("A. Furkan Tanrıverdi");
        c.setUrl("https://github.com/ffurkAn");

        return new OpenAPI()
                .info(new Info()
                        .title("BetBull REST API")
                        .description("Sosyal Yazılım Case Study")
                        .contact(c)
                        .version(getClass().getPackage().getImplementationVersion() != null ? getClass().getPackage().getImplementationVersion() : "-"));
    }


    /**
     * @return swagger da kaynak bulunamadı hatası aldığı için, bu kaynaklar manuel olarak eklenmiştir.
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}


