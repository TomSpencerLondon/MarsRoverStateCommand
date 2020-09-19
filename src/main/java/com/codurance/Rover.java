package com.codurance;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

public class Rover {

  private int x;
  private int y;
  private final String direction;
  private Coordinates coordinates;

  public Rover(int x, int y, String direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.coordinates = new Coordinates(x, y);
  }

  public void setCoordinates(int x, int y){
    this.x = x;
    this.y = y;
    this.coordinates = new Coordinates(x, y);
  }

  public void receive(String commandSequence) {
    if (commandSequence.equals("")){
      return;
    }
    if (direction.equals("N"))
      setCoordinates(x,y + 1);
    else if (direction.equals("E"))
      setCoordinates(x + 1, y);
    else if (direction.equals("S"))
      setCoordinates(x, y - 1);
    else
      setCoordinates(x - 1, y);
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
