package org.kataetos.reading;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Simple bean to encapsulate a reference to a biblical passage.
 *
 * @author peter
 */
@AllArgsConstructor
public class BiblicalReference {
  @Getter
  private BibleBook book;
  @Getter
  private int chapterFrom, verseFrom, chapterTo, verseTo;
}
