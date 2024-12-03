package com.framepulse.common.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;

public abstract class AbstractYamlPropertyLoader implements EnvironmentPostProcessor {

    public abstract String getResource();

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try {
            // Load YAML resource
            YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
            List<PropertySource<?>> yamlSources = loader.load("custom-config-" + getResource(),
                    new ClassPathResource(getResource()));
            yamlSources.forEach(environment.getPropertySources()::addLast);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load YAML configuration " + getResource(), e);
        }
    }
}
