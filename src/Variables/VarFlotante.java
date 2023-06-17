package Variables;

public class VarFlotante extends Var {
    private float valor;

    public VarFlotante(String nombre, float valor) {
        super(nombre, Tipo.FLOTANTE);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String getString() {
        return String.valueOf(valor);
    }
}