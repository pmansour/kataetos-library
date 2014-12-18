package org.kataetos.calendar;

public interface ConfigurationBuilder {

  public ConfigurationBuilder withTitle(String title);

  public ConfigurationBuilder withShowSundayReadings(Boolean showSundayReadings);

  public ConfigurationBuilder withShowEverydayReadings(Boolean showEverydayReadings);
}
