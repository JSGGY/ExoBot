package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.AntBot;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;

public class Mecatronico extends Hormiga {

    public Mecatronico(String nombre) {
        super(nombre);
    }

    public void ensamblar(HormigaRusa ssSoldado, AntBot ssExobot, IABOT ssIaBot) throws InterruptedException {
        System.out.println("El soldado consta de las siguientes habilidades: ");
        System.out.println("Brazo Derecho, habilidad: " + ssSoldado.getssHabilidadBrazoDerecho());
        System.out.println("Brazo Izquierdo, habilidad: " + ssSoldado.getssHabilidadBrazoIzquierdo());
        System.out.println("Ensamblando exobot, con las siguientes armas");
        ssExobot.unirseSoldado(ssSoldado);
    }

}
