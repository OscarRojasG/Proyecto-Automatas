package Variables;

import Util.Util;

public class Variable {
    private String nombre;
    private String valor;
    private Tipo tipo;

    public Variable(String nombre, String valor, Tipo tipo) {
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getStrValue() {
        return valor;
    }

    public int getIntValue() {
        if (tipo == Tipo.STRING)
            return 0;

        return Integer.parseInt(valor);
    }

    public float getFloatValue() {
        if (tipo == Tipo.STRING)
            return 0;

        return Util.parseFloat(valor);
    }
}
