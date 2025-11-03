package com.example.models;


public enum Category {
  COSMETIC("Cosmetic"),
  FURNITURE("Furniture"),
  SHOES("Shoes"),
  CLOTHES("Clothes");

  private final String value;

  Category(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
