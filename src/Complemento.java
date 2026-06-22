public abstract class Complemento extends Cafe{
    public Cafe bebida;

    public abstract String getDescription();

    @Override
    public Tamaño getTamaño() {
        return bebida.getTamaño();
    }
}
