package com.labs.hexagonalarch.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;

import java.time.LocalDateTime;

@Entity
@Builder
class Price {
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Chain brand;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priceList;
    private Integer priority;
    private Double price;
    private Currency currency;
}
