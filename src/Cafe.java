public abstract class Cafe {
    String descripcion = "Bebida desconocida";
    Tamaño tamaño = Tamaño.NORMAL;

    public String getDescripcion(){
        return descripcion;
    }

    public abstract double costo();

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

}
