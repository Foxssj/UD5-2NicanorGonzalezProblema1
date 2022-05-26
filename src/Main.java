public class Main {

    public static void main(String[] args) {

        /*
        * Crea un pequeño programa que instancie un objeto de tipo SuperList para almacenar enteros.
        Inserta cuatro elementos en la instancia de SuperList,
    *   elimina el que ocupa la posición 3 y luego muestra la lista haciendo uso de los dos métodos
    *   que has programado a tal efecto.

        * */
        SuperList lista = new SuperList();

        lista.addElement(85);
        lista.addElement(69);
        lista.addElement(15);
        lista.addElement(45);

        System.out.println("Se ha eliminado el objeto:" + lista.removeElement(3));

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        lista.showElements();
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        lista.showReversedElements();
    }
}
