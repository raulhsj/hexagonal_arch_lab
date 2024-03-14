package com.labs.hexagonalarch.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Builder;
import org.springframework.data.annotation.Id;

@Entity
@Builder
class Chain {
    @Id
    @GeneratedValue
    private Integer brandId;
    private String name;
}
