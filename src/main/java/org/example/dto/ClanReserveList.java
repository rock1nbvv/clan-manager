package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonInclude
public class ClanReserveList {
    Meta meta;
    ArrayList<ClanReserve> data;

    @Data
    @JsonInclude
    private static class Meta {
        Integer count;
    }
}
