public class Batido extends Cafe {

    public Batido() {
        descripcion = "Cafe Batido";
    }

    @Override
    public double costo() {
        if (getTamaño() == Tamaño.NORMAL){
            return 0.89;
        } else if (getTamaño() == Tamaño.MEDIANO){
            return 0.99;
        } else if (getTamaño() == Tamaño.GRANDE) {
            return 1.09;
        }
        return 0.89;
    }
}
