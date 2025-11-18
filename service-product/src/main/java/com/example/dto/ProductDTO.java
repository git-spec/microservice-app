package com.example.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.models.Category;
import com.example.models.Group;
import com.example.models.Family;
import com.example.models.ProductFeatures;
import com.example.models.Images;
import com.example.models.Currency;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class ProductDTO {
    private final String number;
    private final String name;
    private final String manufacturer;
    private final Category category;
    private final Group group;
    private final Family family;
    private final ProductFeatures features;
    private final String info;
    private final String description;
    private final Images images;
    private final BigDecimal price;
    private final Currency currency;
}
