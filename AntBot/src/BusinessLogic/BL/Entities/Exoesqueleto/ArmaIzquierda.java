package BusinessLogic.Entities.Exoesqueleto;

public abstract class ArmaIzquierda {
    private String ssTipo;

    public ArmaIzquierda(String sstipo) {
        this.ssTipo = sstipo;
    }

    public String getssTipo() {
        return ssTipo;
    }

    public void ssDispararArmaIzquierda(int cantidadBalas) throws InterruptedException {
        System.out.println("Disparando arma Izquierda: ");
        for (int i = 0; i < cantidadBalas; i++) {

            System.out.print(" * ");
            Thread.sleep(50);
        }
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return this.ssTipo + "\n";
    }
}
