package BusinessLogic.Entities.Exoesqueleto;

import BusinessLogic.Entities.EjercitoRuso.IhomigaExtremidad;
import BusinessLogic.Entities.EjercitoRuso.Soldado;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;

public class ExoBot extends IABOT implements IhomigaExtremidad {
    private FuentePoder ssEFuentePoder;

    private Tenazas tenazas;
    private SensoresOpticos sensor;
    private Radio radio;
    private Antenas antenas;
    private Procesador procesador;
    private Tronco tronco;
    private TurboReactor ssETurboReactor;
    private BrazoDerecho ssEBrazoDerecho;
    private BrazoIzquierdo ssEBrazoIzquierdo;
   
    public ExoBot(IABOT iaBot) {
        super(iaBot);
        // ssEFuentePoder = new FuentePoder();
        tenazas = new Tenazas();
        sensor = new SensoresOpticos();
        radio = new Radio();    
        antenas = new Antenas();
        procesador = new Procesador();
        tronco = new Tronco();

        ssETurboReactor = new TurboReactor();
        ssEBrazoDerecho = new BrazoDerecho();
       

     

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
