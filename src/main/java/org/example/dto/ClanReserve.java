package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonInclude
public class ClanReserve {
    String name;
    @JsonProperty("bonus_type")
    String bonusType;
    Boolean disposable;
    String type;
    @JsonProperty("in_stock")
    ArrayList<StockItem> inStock;
}
