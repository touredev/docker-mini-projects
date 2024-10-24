package dev.tourem.tasks;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.springframework.boot.autoconfigure.JteViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemplateConfiguration {

    @Bean
    public JteViewResolver jteViewResolver() {
        TemplateEngine templateEngine = TemplateEngine.createPrecompiled(ContentType.Html);
        return new JteViewResolver(templateEngine, ".jte");
    }
}
