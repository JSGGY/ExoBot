package BusinessLogic.Entities.Exoesqueleto;

public class TurboReactor {
    public static int ssNivelDeEnergia;

    public TurboReactor() {
        ssNivelDeEnergia = 100;
    }

    public int getssNivelDeEnergia() {
        return ssNivelDeEnergia;
    }

    public void setssNivelDeEnergia(int nivelDeEnergia) {
        ssNivelDeEnergia = nivelDeEnergia;
    }

    public void ssVolar() {
        for (int porcentajeBateria = 100; porcentajeBateria >= 0; porcentajeBateria--) {
            System.out.print("\rExobot Volando...batería al " + porcentajeBateria + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

    }
}
