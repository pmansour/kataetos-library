package org.kataetos.calendar;

import java.util.List;

import org.kataetos.calendar.theme.DisplayFormat;
import org.kataetos.event.EventType;

public interface Theme {

  public DisplayFormat getDisplayFormat(EventType type);

  public List<EventType> getEventPrecedence();

  public DisplayFormat getTitleDisplayFormat();

}
