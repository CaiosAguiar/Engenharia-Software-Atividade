public class InsertionSort implements OrdenacaoStrategy {

    @Override
    public void ordenar(int[] v) {
        int i, j;
        int temp;
        for (i = 1; i < v.length; i++) {
            temp = v[i];
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
