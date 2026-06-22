public abstract class Descafeinado extends Cafe{
    public Descafeinado() {
        descripcion = "Cafe Descafeinado";
    }

    @Override
    public double costo() {
        if (getTamaño() == Tamaño.NORMAL) {
            return 1.05;
        } else if (getTamaño() == Tamaño.MEDIANO){
            return 1.15;
        } else if (getTamaño() == Tamaño.GRANDE){
            return 1.25;
        }
        return 1.05;
    }
}
