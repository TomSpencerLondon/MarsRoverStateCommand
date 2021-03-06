package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class RoverTest {

  @Test
  void not_moving_when_receiving_an_empty_commands_sequence() {
    Rover rover = new Rover(1, 3, "N");
    rover.receive("");

    assertThat(rover, is(new Rover(1, 3, "N")));
  }

  @Test
  void moving_forward_when_facing_north() {
    Rover rover = new Rover(3, 6, "N");
    rover.receive("f");

    assertThat(rover, is(new Rover(3, 7, "N")));
  }

  @Test
  void moving_forward_when_facing_east() {
    Rover rover = new Rover(1, 3, "E");
    rover.receive("f");

    assertThat(rover, is(new Rover(2, 3, "E")));
  }

  @Test
  void moving_forward_when_facing_south() {
    Rover rover = new Rover(5, 3, "S");
    rover.receive("f");

    assertThat(rover, is(new Rover(5, 2, "S")));
  }

  @Test
  void moving_forward_when_facing_west() {
    Rover rover = new Rover(5, 3, "W");
    rover.receive("f");

    assertThat(rover, is(new Rover(4, 3, "W")));
  }
}
