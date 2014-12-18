package org.kataetos.reading;

/**
 * The books of the old and new testament, and some of their abbreviations, according to the rite
 * of the Coptic Orthodox Church. Listed in order.
 *
 * @author peter
 */
public enum BibleBook {
  Genesis("Gen", "Gn", "Genesis", BibleTestament.OldTestament),
  Exodus("Exod", "Ex", "Exodus", BibleTestament.OldTestament),
  Leviticus("Lev", "Lv", "Leviticus", BibleTestament.OldTestament),
  Numbers("Num", "Nm", "Numbers", BibleTestament.OldTestament),
  Deuteronomy("Deut", "Dt", "Deuteronomy", BibleTestament.OldTestament),
  Joshua("Josh", "Jos", "Joshua", BibleTestament.OldTestament),
  Judges("Judg", "Jdg", "Judges", BibleTestament.OldTestament),
  Ruth("Ruth", "Ru", "Ruth", BibleTestament.OldTestament),
  Samuel1("1 Sam", "1 Sa", "1 Samuel", BibleTestament.OldTestament),
  Samuel2("2 Sam", "2 Sa", "2 Samuel", BibleTestament.OldTestament),
  Kings1("1 Kgs", "1 Ki", "1 Kings", BibleTestament.OldTestament),
  Kings2("1 Kgs", "2 Ki", "2 Kings", BibleTestament.OldTestament),
  Chronicles1("1 Chr", "1 Ch", "1 Chronicles", BibleTestament.OldTestament),
  Chronicles2("2 Chr", "2 Ch", "2 Chronicles", BibleTestament.OldTestament),
  Ezra("Ezra", "Ezr", "Ezra", BibleTestament.OldTestament),
  Nehemiah("Neh", "Ne", "Nehemiah", BibleTestament.OldTestament),
  Tobit("Tob", "Tb", "Tobit", BibleTestament.OldTestament),
  Judith("Jdt", "Jth", "Judith", BibleTestament.OldTestament),
  Esther("Esth", "Es", "Esther", BibleTestament.OldTestament),
  Maccabees1("1 Macc", "1 Mc", "1 Maccabees", BibleTestament.OldTestament),
  Maccabees2("2 Macc", "2 Mc", "2 Maccabees", BibleTestament.OldTestament),
  Job("Job", "Jb", "Job", BibleTestament.OldTestament),
  Psalms("Psa", "Ps", "Psalms", BibleTestament.OldTestament),
  Proverbs("Prov", "Pv", "Proverbs", BibleTestament.OldTestament),
  Ecclesiastes("Eccl", "Ec", "Ecclesiastes", BibleTestament.OldTestament),
  SongOfSongs("Song", "So", "Song of Songs", BibleTestament.OldTestament),
  WisdomOfSolomon("Wis", "Ws", "Wisdom of Solomon", BibleTestament.OldTestament),
  Sirach("Sir", "Sr", "Sirach", BibleTestament.OldTestament),
  Isaiah("Isa", "Is", "Isaiah", BibleTestament.OldTestament),
  Jeremiah("Jer", "Je", "Jeremiah", BibleTestament.OldTestament),
  Lamentations("Lam", "La", "Lamentations", BibleTestament.OldTestament),
  Baruch("Bar", "Ba", "Baruch", BibleTestament.OldTestament),
  Ezekiel("Ezek", "Ez", "Ezekiel", BibleTestament.OldTestament),
  Daniel("Dan", "Da", "Daniel", BibleTestament.OldTestament),
  Hosea("Hos", "Ho", "Hosiah", BibleTestament.OldTestament),
  Joel("Joel", "Joe", "Joel", BibleTestament.OldTestament),
  Amos("Amos", "Am", "Amos", BibleTestament.OldTestament),
  Obadiah("Obad", "Ob", "Obadiah", BibleTestament.OldTestament),
  Jonah("Jonah", "Jon", "Jonah", BibleTestament.OldTestament),
  Micah("Mic", "Mi", "Micah", BibleTestament.OldTestament),
  Nahum("Nah", "Na", "Nahum", BibleTestament.OldTestament),
  Habakkuk("Hab", "Hb", "Habakkuk", BibleTestament.OldTestament),
  Zephaniah("Zeph", "Zep", "Zephaniah", BibleTestament.OldTestament),
  Haggai("Hag", "Hg", "Haggai", BibleTestament.OldTestament),
  Zechariah("Zech", "Zec", "Zechariah", BibleTestament.OldTestament),
  Malachi("Mal", "Ml", "Malachi", BibleTestament.OldTestament),

  Matthew("Matt", "Mt", "Matthew", BibleTestament.NewTestament),
  Mark("Mark", "Mk", "Mark", BibleTestament.NewTestament),
  Luke("Luke", "Lk", "Luke", BibleTestament.NewTestament),
  John("John", "Jn", "John", BibleTestament.NewTestament),
  Acts("Acts", "Ac", "Acts", BibleTestament.NewTestament),
  Romans("Rom", "Ro", "Romans", BibleTestament.NewTestament),
  Corinthians1("1 Cor", "1 Co", "1 Corinthians", BibleTestament.NewTestament),
  Corinthians2("2 Cor", "2 Co", "2 Corinthians", BibleTestament.NewTestament),
  Galatians("Gal", "Ga", "Galatians", BibleTestament.NewTestament),
  Ephesians("Eph", "Ep", "Ephesians", BibleTestament.NewTestament),
  Philippians("Phil", "Php", "Philippians", BibleTestament.NewTestament),
  Colossians("Col", "Co", "Colossians", BibleTestament.NewTestament),
  Thessalonians1("1 Thess", "1 Th", "1 Thessalonians", BibleTestament.NewTestament),
  Thessalonians2("2 Thess", "2 Th", "2 Thessalonians", BibleTestament.NewTestament),
  Timothy1("1 Tim", "1 Tm", "1 Timothy", BibleTestament.NewTestament),
  Timothy2("2 Tim", "2 Tm", "2 Timothy", BibleTestament.NewTestament),
  Titus("Titus", "Ti", "Titus", BibleTestament.NewTestament),
  Philemon("Phlm", "Phm", "Philemon", BibleTestament.NewTestament),
  Hebrews("Heb", "He", "Hebrews", BibleTestament.NewTestament),
  James("Jam", "Ja", "James", BibleTestament.NewTestament),
  Peter1("1 Pet", "1 Pt", "1 Peter", BibleTestament.NewTestament),
  Peter2("2 Pet", "2 Pt", "2 Peter", BibleTestament.NewTestament),
  John1("1 John", "1 Jn", "1 John", BibleTestament.NewTestament),
  John2("2 John", "2 Jn", "2 John", BibleTestament.NewTestament),
  John3("3 John", "3 Jn", "3 John", BibleTestament.NewTestament),
  Jude("Jude", "Jd", "Jude", BibleTestament.NewTestament),
  Revelation("Rev", "Rv", "Revelation", BibleTestament.NewTestament);

  private String abbreviation, shortAbbreviation, name;
  private BibleTestament testament;
  BibleBook(String abbreviation, String shortAbbreviation, String name, BibleTestament testament) {
    this.abbreviation = abbreviation;
    this.shortAbbreviation = shortAbbreviation;
    this.name = name;
    this.testament = testament;
  }
}
