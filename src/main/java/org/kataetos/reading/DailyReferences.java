package org.kataetos.reading;

import org.kataetos.date.YearlessDate;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Represents references to the church readings on a specific day.
 *
 * @author peter
 */
@AllArgsConstructor
public class DailyReferences {
  @Getter
  private YearlessDate day;
  @Getter
  private BiblicalReference pauline, catholicon, acts, gospel;
  @Getter
  private List<SynaxariumReference> synaxarium;
}
