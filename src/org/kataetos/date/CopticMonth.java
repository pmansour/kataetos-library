package org.kataetos.date;

public enum CopticMonth {
    TOUT("Thout", "Tout"),
    BABA("Paopi", "Baba"),
    HATOUR("Hathor", "Hatour"),
    KIAHK("Koiak", "Kiahk"),
    TOUBA("Tobi", "Touba"),
    AMSHIR("Meshir", "Amshir"),
    BARAMHAT("Paremhat", "Baramhat"),
    BARMOUDA("Parmouti", "Barmouda"),
    BASHANS("Pashons", "Bashans"),
    BAOUNA("PAONI", "Baouna"),
    ABIB("Epip", "Abib"),
    MESRA("Mesori", "Mesra"),
    NASIE("Pi Kogi Enavot", "Nasie");

    private String copticName, arabicName;

    CopticMonth(String copticName, String arabicName) {
        this.arabicName = arabicName;
        this.copticName = copticName;
    }

    public String getCopticName() {
        return copticName;
    }

    public String getArabicName() {
        return arabicName;
    }

    public String toString() {
        return arabicName;
    }
}
