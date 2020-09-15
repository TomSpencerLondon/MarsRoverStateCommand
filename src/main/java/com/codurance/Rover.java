package com.codurance;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class Rover {

  private int x;
  private int y;
  private final String direction;

  public Rover(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public void receive(String commandSequence) {
    if (commandSequence.equals("")){
      return;
    }
    if (direction.equals("N"))
      y  += 1;
    else if (direction.equals("E"))
      x += 1;
    else
      y -= 1;
  }

  @Override
  public String toString() {
    return "x: " + x + ", y: " + y + ", direction: " + direction;
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
