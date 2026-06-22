public class TostadoNegro extends Cafe {
    public TostadoNegro() {
        descripcion = "Cafe Tostado Negro";
    }

    @Override
    public double costo() {
        if (getTamaño() == Tamaño.NORMAL) {
            return 0.99;
        } else if (getTamaño() == Tamaño.MEDIANO) {
            return 1.09;
        } else if (getTamaño() == Tamaño.GRANDE) {
            return 1.19;
        }
        return 0.99;
    }
}
