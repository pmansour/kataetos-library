package org.kataetos.event;

import java.util.Set;

import org.kataetos.date.YearlessDate;

import lombok.Getter;

/**
 * Immutable abstract class to represent a (yearless) event.
 *
 * @author peter
 */
public abstract class Event {

  @Getter
  private String name;
  @Getter
  private String description;
  @Getter
  private Object image;
  @Getter
  private EventType type;

  public abstract Set<YearlessDate> getDates();

  Event(String name, String description, Object image, EventType type) {
    this.name = name;
    this.description = description;
    this.image = image;
    this.type = type;
  }

}
