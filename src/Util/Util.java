package Util;

public class Util {
    // Convierte a float los números que usan coma como separador decimal
    public static float parseFloat(String value) {
        value = value.replaceAll(",", ".");
        return Float.parseFloat(value);
    }
}
