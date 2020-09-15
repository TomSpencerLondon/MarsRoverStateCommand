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
}
