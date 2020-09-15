package com.codurance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class RoverTest {

  @Test
  void not_moving_when_receiving_an_empty_commands_sequence() {
    Rover rover = new Rover(1, 3, "N");
    rover = rover.receive("");

    assertThat(rover, is(new Rover(1, 3, "N")));
  }
}
