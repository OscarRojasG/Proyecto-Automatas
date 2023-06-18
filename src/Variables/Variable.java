package Variables;

import Util.Util;

public class Variable {
    private String nombre;
    private String valor;
    private Tipo tipo;

    public Variable(String nombre, String valor, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;

        if (tipo == Tipo.ENTERO) {
            int valorNum = Integer.parseInt(valor);
            this.valor = String.valueOf(valorNum);
        }
        if (tipo == Tipo.FLOTANTE) {
            float valorNum = Util.parseFloat(valor);
            this.valor = String.valueOf(valorNum);
        }
        if (tipo == Tipo.STRING) this.valor = valor;
    }

    public void setValor(float valor) {
        if (tipo == Tipo.ENTERO) {
            int valorNum = (int) valor;
            this.valor = String.valueOf(valorNum);
        }
        else this.valor = String.valueOf(valor);
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

    public float getNumericValue() {
        if (tipo == Tipo.STRING)
            return 0;
            
        return Float.parseFloat(valor);
    }
}
