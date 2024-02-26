package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class StockItem {
    String status;
    Long action_time;
    Long active_till;
    Integer level;
    Long activated_at;
    Integer amount;
}
