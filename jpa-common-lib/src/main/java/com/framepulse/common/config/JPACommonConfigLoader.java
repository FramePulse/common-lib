package com.framepulse.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;

@Configuration
public class JPACommonConfigLoader extends AbstractYamlPropertyLoader {

    @Override
    public String getResource() {
        return "jpa-common-lib.yaml";
    }
}
