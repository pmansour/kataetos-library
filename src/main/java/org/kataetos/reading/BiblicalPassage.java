package org.kataetos.reading;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents a passage from a translation of the bible.
 *
 * @author peter
 */
@AllArgsConstructor
public class BiblicalPassage {
  @Getter
  private BiblicalReference reference;
  @Getter
  private String text, translation, language;
}
