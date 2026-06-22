public class Expreso extends Cafe {
    public Expreso() {
        descripcion = "Cafe Expreso";
    }

    @Override
    public double costo() {
        if (getTamaño() == Tamaño.NORMAL) {
            return 1.99;
        } else if (getTamaño() == Tamaño.MEDIANO) {
            return 2.09;
        } else if (getTamaño() == Tamaño.GRANDE) {
            return 2.15;
        }
        return 1.99;
    }
}
