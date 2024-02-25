package org.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class WgApiService {

    private final RestClient restClient;

    //    private ObjectMapper objectMapper() {
//        return Jackson2ObjectMapperBuilder.json()
//                .modules(new JavaTimeModule(), new Jdk8Module())
//                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
//                .failOnUnknownProperties(false)
//                .serializationInclusion(JsonInclude.Include.NON_DEFAULT)
//                .build()
//                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
//                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//    }
    public RestClient.ResponseSpec getStats() {

        return restClient.get()
                .uri("/wot/stronghold/clanreserves/",
                        uriBuilder -> uriBuilder
                                .queryParam("application_id", "376e999e5151c56279cb4b95e5df6555")
                                .queryParam("access_token", "acb552887a413e63898b159e6840068e4ae9dabf")
                                .build()
                ).retrieve();
//        Map.of("application_id", "376e999e5151c56279cb4b95e5df6555", "access_token", "acb552887a413e63898b159e6840068e4ae9dabf")
//       return restClient.get().uri("/wot/stronghold/clanreserves/{vlad}/?application_id=376e999e5151c56279cb4b95e5df6555&access_token=acb552887a413e63898b159e6840068e4ae9dabf",
//                Map.of("vlad", 1, "application_id", "376e999e5151c56279cb4b95e5df6555", "access_token", "acb552887a413e63898b159e6840068e4ae9dabf")).retrieve();
    }
}
