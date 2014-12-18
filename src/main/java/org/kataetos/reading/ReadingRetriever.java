package org.kataetos.reading;

import org.kataetos.date.YearlessDate;

import java.util.concurrent.Callable;

/**
 * Defines the operations that a reading retriever must be able to perform. Operations include
 * finding the daily references for a given day, fetching a biblical passage from a reference, and
 * fetching a Synaxarium reading from a reference.
 *
 * @author peter
 */
public interface ReadingRetriever {

  /**
   * Get the references for the given day's readings.
   *
   * @param day The day for which to get the readings.
   * @return The readings for that day.
   */
  public DailyReferences getDailyReferences(YearlessDate day);

  /**
   * Load the biblical passage corresponding to the given reference, using the given translation
   * of the bible.
   * @param reference The reference to the passage to load.
   * @param translation The translation to load the passage from.
   * @param callback The callback to use with the passages, once retrieved.
   */
  public void loadPassage(BiblicalReference reference, String translation,
                          Callable<BiblicalPassage> callback);

  /**
   * Load the Synaxarium reading corresponding to the given reference.
   * @param reference The reference to the reading to load.
   * @param callback The callback to use with the reading, once retrieved.
   */
  public void loadSynaxariumReading(SynaxariumReference reference,
                                    Callable<SynaxariumReading> callback);

}