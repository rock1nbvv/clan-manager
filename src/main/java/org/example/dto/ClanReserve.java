package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonInclude
public class ClanReserve {
    String name;
    String bonus_type;
    Boolean disposable;
    String type;
    ArrayList<StockItem> in_stock;
}
