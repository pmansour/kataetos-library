package org.kataetos.reading;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Simple bean to encapsulate a reference to a synaxarium reading.
 *
 * @author peter
 */
@AllArgsConstructor
public class SynaxariumReference {
  @Getter
  private String title;
  @Getter
  private String readingId;
}
