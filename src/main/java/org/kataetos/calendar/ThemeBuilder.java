package org.kataetos.calendar;

import java.util.List;

import org.kataetos.calendar.theme.DisplayFormat;
import org.kataetos.event.EventType;

public interface ThemeBuilder {

  public ThemeBuilder withEventDisplayFormat(EventType type, DisplayFormat format);

  public ThemeBuilder withPrecedence(List<EventType> precedence);

  public ThemeBuilder withTitleDisplayFormat(DisplayFormat format);

  public Theme build();
}
