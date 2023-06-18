package Util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Util {
    // Convierte a float los números que usan coma como separador decimal
    public static float parseFloat(String value) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        float floatValue = 0;

		try {
            floatValue = format.parse(value).floatValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return floatValue;
    }
}
