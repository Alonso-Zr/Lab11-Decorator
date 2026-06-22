public class Crema extends Complemento {
    public Crema(Cafe bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public double costo() {
        double costoComplemento = 0;
        if (getTamaño() == Tamaño.NORMAL) {
            costoComplemento = 0.10;
        } else if (getTamaño() == Tamaño.MEDIANO) {
            costoComplemento = 0.15;
        } else if (getTamaño() == Tamaño.GRANDE) {
            costoComplemento = 0.20;
        }
        return bebida.costo() + costoComplemento;
    }
}
