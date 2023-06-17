package Variables;

public abstract class Var {
    private String nombre;
    private Tipo tipo;

    public Var(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public abstract String getString();
}
