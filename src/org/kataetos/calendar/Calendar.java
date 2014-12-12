package org.kataetos.calendar;

import java.io.IOException;
import java.io.OutputStream;

public interface Calendar {

  public OutputStream exportToPdf() throws IOException;

  public String exportToHtml();

}
