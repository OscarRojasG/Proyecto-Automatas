package Util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Util {
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
