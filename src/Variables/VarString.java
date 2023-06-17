package Variables;

public class VarString extends Var {
    private String valor;

    public VarString(String nombre, String valor) {
        super(nombre, Tipo.STRING);
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String getString() {
        return valor;
    }
}
