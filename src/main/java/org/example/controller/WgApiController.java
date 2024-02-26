package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.ClanReserveList;
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
    public ClanReserveList getReserves(){
        return wgApiService.getStats()
                .body(ClanReserveList.class);
    }
}
