/**
 * Estratégia concreta: Selection Sort.
 */
public class SelectionSort implements OrdenacaoStrategy {

    @Override
    public void ordenar(int[] v) {
        int i, j, min, aux;
        for (i = 0; i < v.length - 1; i++) {
            min = i;
            for (j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            aux = v[i];
            v[i] = v[min];
            v[min] = aux;
        }
    }

    @Override
    public String toString() {
        return "Selection Sort";
    }
}
