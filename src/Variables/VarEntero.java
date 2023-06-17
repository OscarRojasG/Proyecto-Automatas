package Variables;

public class VarEntero extends Var {
    private int valor;

    public VarEntero(String nombre, int valor) {
        super(nombre, Tipo.ENTERO);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String getString() {
        return String.valueOf(valor);
    }
}