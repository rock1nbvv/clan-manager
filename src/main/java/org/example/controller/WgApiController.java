package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.service.WgApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class WgApiController {
    private final WgApiService wgApiService;

    @GetMapping(value = "/reserves")
    public String getReserves(){
        return wgApiService.getStats()
                .body(String.class);
    }
}
