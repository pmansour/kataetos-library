package org.kataetos.calendar.theme;

public interface DisplayFormat {

    public RGBColor getBackgroundColor();

    public RGBColor getFontColor();

    public String getFontFace();

    public Integer getFontSize();

    public FontSizeUnit getFontSizeUnit();

    public TextAlignment getTextAlignment();

    public void setBackgroundColor(RGBColor color);

    public void setFontColor(RGBColor color);

    public void setFontFace(String fontFace);

    public void setFontSize(Integer fontSize);

    public void setFontSizeUnit(FontSizeUnit fontSizeUnit);

    public void setTextAlignment(TextAlignment textAlignment);
}
