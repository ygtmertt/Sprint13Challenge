package org.example.enums;

public enum Plan {
  BASIC("Basic Plan", 99),
  PREMIUM("Premium Plan", 199),
  ENTERPRISE("Enterprise Plan", 499);

  private String name;
  private int price;

  Plan(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
