package Exoesqueleto;

import EjercitoRuso.IhomigaExtremidad;
import EjercitoRuso.HormigaRusa;
import InteligenciaArtificial.IABOT;

public class AntBot extends IABOT implements IhomigaExtremidad, ITecnicoRuso,ITecnicoIngles{
    
    private FuentePoder fuentePoder;
    private Tenazas tenazas;
    private SensoresOpticos sensor;
    private Radio radio;
    private Antenas antenas;
    private CircuitoAnillado circuitoAnillado;
    private CircuitoCarga circuitoCarga;
    private Procesador procesador;
    private Tronco tronco;
    private Alas alas;
    private Patas patas;
    private Transductores transductores;
    public AntBot(IABOT iaBot) {
        super(iaBot);
        // ssEFuentePoder = new FuentePoder();
        tenazas = new Tenazas();
        sensor = new SensoresOpticos();
        radio = new Radio();    
        antenas = new Antenas();
        procesador = new Procesador();
        tronco = new Tronco();
        circuitoAnillado = new CircuitoAnillado();
        circuitoCarga = new CircuitoCarga();
        transductores = new Transductores();
    }

    public void unirseHormigaRusa(HormigaRusa hRusa) throws InterruptedException {
        if (hRusa.getClasificacion().equals("Zangano")) {
            alas = new Alas();
            alas.ssVolar();
        }
        System.out.println("Hormiga Rusa: " + hRusa.getClasificacion() + " ha ingresado correctamente al AntBot");
    }

    public void controlarAcciones(){
        antenas.detectarSonido();
        antenas.cumplirInstrucciones();
        radio.detectarEnemigos();
        radio.cumplirInstrucciones();
        tenazas.mover();
        tenazas.cumplirInstrucciones();
        
    }

    @Override
    public String traducirIngles(String texto) {
       return texto;
    }
    @Override
    public String traducirRuso(String texto) {
       return texto;
    }



}
