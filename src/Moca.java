public class Moca extends Complemento {

    public Moca(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    @Override
    public double costo() {
        double costoComplemento = 0;
        if (getTamaño() == Tamaño.NORMAL) {
            costoComplemento = 0.20;
        } else if (getTamaño() == Tamaño.MEDIANO) {
            costoComplemento = 0.25;
        } else if (getTamaño() == Tamaño.GRANDE) {
            costoComplemento = 0.30;
        }
        return bebida.costo() + costoComplemento;
    }
}