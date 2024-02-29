package BusinessLogic.Entities.Exoesqueleto;

import BusinessLogic.Entities.EjercitoRuso.HumanoExtremidad;
import BusinessLogic.Entities.EjercitoRuso.Soldado;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;

public class ExoBot extends IABOT implements HumanoExtremidad {
    private FuentePoder ssEFuentePoder;
    private TurboReactor ssETurboReactor;
    private BrazoDerecho ssEBrazoDerecho;
    private BrazoIzquierdo ssEBrazoIzquierdo;
    private Pierna ssEPiernaDerecha;
    private Pierna ssEPiernaIzquierda;

    public ExoBot(IABOT iaBot) {
        super(iaBot);
        // ssEFuentePoder = new FuentePoder();
        ssETurboReactor = new TurboReactor();
        ssEBrazoDerecho = new BrazoDerecho();
        ssEPiernaDerecha = new Pierna();
        ssEPiernaIzquierda = new Pierna();

        if (ExoBot.brazoIzquierdo)
            ssEBrazoIzquierdo = new BrazoIzquierdo();

    }

    public void unirseSoldado(Soldado soldado) throws InterruptedException {
        if (ExoBot.brazoIzquierdo && ssEBrazoIzquierdo != null) {
            ssEBrazoIzquierdo = new BrazoIzquierdo();
            System.out.print("Arma del brazo izquierdo: ");
            if (soldado.getssHabilidadBrazoIzquierdo())

                ssEBrazoIzquierdo.setssArma(new ArmaMetralleta("Metralleta MK61"));
            else
                ssEBrazoIzquierdo.setssArma(new ArmaBazuca("Bazuca antitanque"));

            System.out.println(ssEBrazoIzquierdo.ssArma.toString());
            System.out.print("Arma del brazo derecho: ");

            ArmaLaser armaLaser = new ArmaLaser("Arma láser");
            ArmaLanzaFuego armaLanzaFuegos = new ArmaLanzaFuego("Lanza fuegos");
            if (soldado.getssHabilidadBrazoDerecho())
                ssEBrazoDerecho.setArma(armaLaser);
            else
                ssEBrazoDerecho.setArma(armaLanzaFuegos);

            System.out.println(ssEBrazoDerecho.ssArma.toString());

        }

    }

    public void dispararArmas() throws InterruptedException {

        ssEBrazoIzquierdo.ssArma.ssDispararArmaIzquierda(30);
        ssEBrazoDerecho.ssArma.ssDispararArmaDerecha(10);
    }

}
