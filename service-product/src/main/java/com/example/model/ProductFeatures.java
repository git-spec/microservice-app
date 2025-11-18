package com.example.model;

import java.util.List;


public record ProductFeatures(   
    Dimension dimension,
    Measure weight,
    List<String> materials,
    List<String> colors
) {}