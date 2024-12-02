package com.framepulse.common.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfigLoader extends AbstractYamlPropertyLoader {

    @Override
    public String getResource() {
        return "common-lib.yaml";
    }
}
