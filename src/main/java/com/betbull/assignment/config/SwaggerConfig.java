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

    public static final String API_KEY = "api_key";

    @Bean
    public OpenAPI customOpenAPI() {

        Contact c = new Contact();
        c.setEmail("kd_kfs@mkk.com.tr");
        c.setName("Merkezi Kayıt Kuruluşu A.Ş.");
        c.setUrl("https://mkk.com.tr");

        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes(API_KEY, new SecurityScheme()
                                .type(SecurityScheme.Type.APIKEY)
                                .description("API Key Authentication via JWT")
                                .in(SecurityScheme.In.HEADER)
                                .name("asdad")))
                .security(Arrays.asList(new SecurityRequirement().addList(API_KEY)))
                .info(new Info()
                        .title("Kitle Fonlama Sistemi REST API")
                        .description("Bir projenin veya girişim şirketinin ihtiyaç duyduğu fonun toplanması için kullanılacak sistemdir.")
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


