package com.producers.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ObjectDataDto {
    
    private int sequence;
    private String messageDesc;
    private BigDecimal price;
}
