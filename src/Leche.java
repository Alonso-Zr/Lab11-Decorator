public class Leche extends Complemento {
    public Leche(Cafe bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double costo() {
        double costoComplemento = 0;
        if(getTamaño() == Tamaño.NORMAL){
            return costoComplemento = 0.10;
        } else if (getTamaño() == Tamaño.MEDIANO) {
            return costoComplemento = 0.15;
        } else if (getTamaño() == Tamaño.GRANDE){
            return costoComplemento = 0.20;
        }
        return bebida.costo() + costoComplemento;
    }

}
