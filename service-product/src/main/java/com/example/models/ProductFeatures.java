package com.example.models;

import java.util.List;


public record ProductFeatures(   
    Dimension dimension,
    Measure weight,
    List<String> materials,
    List<String> colors
) {}