package org.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class WgApiService {

    private final RestClient restClient;

    public RestClient.ResponseSpec getStats() {

        return restClient.get()
                .uri("/wot/stronghold/clanreserves/",
                        uriBuilder -> uriBuilder
                                .queryParam("application_id", "376e999e5151c56279cb4b95e5df6555")
                                .queryParam("access_token", "acb552887a413e63898b159e6840068e4ae9dabf")
                                .build()
                )
                .retrieve();
    }
}
