package org.kataetos.reading;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents a particular reading from the Synaxarium.
 *
 * @author peter
 */
@AllArgsConstructor
public class SynaxariumReading {
  @Getter
  private SynaxariumReference reference;
  @Getter
  private String text, language;
}
