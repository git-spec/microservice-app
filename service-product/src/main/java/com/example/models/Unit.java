package com.example.models;

import lombok.Getter;


@Getter
public enum Unit {
    MM("mm"),
    CM("cm"),
    M("m"),
    G("g"),
    KG("kg"),
    ML("ml"),
    L("l");

    private final String value;

    Unit(String value) {
        this.value = value;
    }
}
