public class Ordenador {

    private static final Ordenador INSTANCIA = new Ordenador();

    private OrdenacaoStrategy estrategia;

    private Ordenador() {
    }

    public static Ordenador getInstance() {
        return INSTANCIA;
    }

    public void setEstrategia(OrdenacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public OrdenacaoStrategy getEstrategia() {
        return estrategia;
    }

    public void ordenar(int[] v) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de ordenação definida.");
        }
        estrategia.ordenar(v);
    }
}
