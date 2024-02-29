package BusinessLogic.Entities.Exoesqueleto;

public class ArmaLaser implements IArmaDerecha {
    private String ssTipo;

    public ArmaLaser(String ssTipo) {
        this.ssTipo = ssTipo;
    }

    @Override
    public String toString() {
        return this.ssTipo + "\n";

    }

    @Override
    public void ssDispararArmaDerecha(int ssCantidadBalas) {
        System.out.println("Disparando arma derecha: ");
        for (int i = 0; i < ssCantidadBalas; i++) {

            System.out.print(" * ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" ");
    }

}
