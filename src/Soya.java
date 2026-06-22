public class Soya extends Complemento{

    public Soya(Cafe bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    @Override
    public double costo() {
        double costoComplemento = 0;
        if (getTamaño() == Tamaño.NORMAL){
            costoComplemento = 0.15;
        } else if (getTamaño() == Tamaño.MEDIANO){
            costoComplemento = 0.20;
        } else if (getTamaño() == Tamaño.GRANDE){
            costoComplemento = 0.25;
        }
        return bebida.costo() + costoComplemento;
    }
}
