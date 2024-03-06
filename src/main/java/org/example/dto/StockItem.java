package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude
public class StockItem {
    String status;
    @JsonProperty("action_time")
    Long actionTime;
    @JsonProperty("active_till")
    Long activeTill;
    Integer level;
    @JsonProperty("activated_at")
    Long activatedAt;
    Integer amount;
}
