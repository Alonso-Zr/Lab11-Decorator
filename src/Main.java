public class Main {
    public static void main(String[] args) {

        Cafe c1 = new Batido();
        c1.setTamaño(Tamaño.MEDIANO);
        System.out.println("Pedido: " + c1.getDescripcion() + " (" + c1.getTamaño() + ")");
        System.out.println("Total Soles S/." + c1.costo() );

        Cafe c2 = new Expreso();
        c2.setTamaño(Tamaño.GRANDE);
        c2 = new Moca(c2);
        c2 = new Soya(c2);
        c2 = new Crema(c2);
        System.out.println("Pedido: " + c2.getDescripcion() + " (" + c2.getTamaño() + ")");
        System.out.println("Total Soles S/." +  c2.costo() );

    }
}
