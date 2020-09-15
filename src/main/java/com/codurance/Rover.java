package com.codurance;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class Rover {

  private final int x;
  private final int y;
  private final String direction;

  public Rover(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public void receive(String input) {
  }

  @Override
  public boolean equals(Object other) {
    return reflectionEquals(this, other);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
}
