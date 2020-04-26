package com.bellacore.buyconnect.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // do not use EnaleMVC as it will cause problems loading static files
@EnableAspectJAutoProxy
public class WebConfig implements WebMvcConfigurer  {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
