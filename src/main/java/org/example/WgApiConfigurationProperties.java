package org.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "clan-manager.wg-api")
@Configuration
@Data
public class WgApiConfigurationProperties {
    private String applicationId;
    private String url;
}
