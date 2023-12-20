package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000") // Reemplaza con la URL de tu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true); // Habilita el intercambio de cookies (si es necesario)
    }
}


