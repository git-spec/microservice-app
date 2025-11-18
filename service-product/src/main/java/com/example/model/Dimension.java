package com.example.model;


public record Dimension(
    Measure width,
    Measure length,
    Measure height
) {
    public Dimension (Measure width, Measure length) {
        this(width, length, new Measure(0.0, Unit.MM));
    }
}
