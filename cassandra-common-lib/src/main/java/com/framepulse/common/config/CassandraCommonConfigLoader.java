package com.framepulse.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;

@Configuration
public class CassandraCommonConfigLoader extends AbstractYamlPropertyLoader {

    @Override
    public String getResource() {
        return "cassandra-common-lib.yaml";
    }
}
