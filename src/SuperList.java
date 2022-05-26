import java.util.Iterator;

public class SuperList extends ListManager{

        /*
        * addElement(T element): Debe añadir un elemento al final de la lista.

removeElement(int position): Debe eliminar el elemento que se encuentra en la posición
* position de la lista y devolverlo.

showElements(): Debe mostrar por pantalla cada elemento de
* la lista en el orden en el que ha sido insertado seguido de un salto de línea. Debe implementarse con iteradores.

showReversedElements(): Debe mostrar por pantalla cada elemento de la lista en el orden
* inverso al que fue insertado seguido de un salto de línea.

        * */


        @Override
        public void addElement(Object element) {
                list.add(element);
        }

        @Override
        public Object removeElement(int position) {
                Object removedElement = list.remove(position);
                return removedElement;
        }

        @Override
        public void showElements() {

                Iterator<Object> it = list.iterator();

                while (it.hasNext()) {
                        System.out.println(it.next());
                }
        }

        @Override
        public void showReversedElements() {
                for (int i = (list.size() - 1); i > -1; i--) {
                        System.out.println(list.get(i));

                }
        }
}
