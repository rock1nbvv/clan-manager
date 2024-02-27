package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.WgApiConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class WgApiService {

    private final RestClient restClient;
    private final WgApiConfigurationProperties wgApiConfigurationProperties;

    public RestClient.ResponseSpec getStats() {

        return restClient.get()
                .uri("/wot/stronghold/clanreserves/",
                        uriBuilder -> uriBuilder
                                .queryParam("application_id", wgApiConfigurationProperties.getApplicationId())
                                .queryParam("access_token", "acb552887a413e63898b159e6840068e4ae9dabf")
                                .build()
                )
                .retrieve();
    }
}
