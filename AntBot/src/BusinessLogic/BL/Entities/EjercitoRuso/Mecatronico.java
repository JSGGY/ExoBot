package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.ExoBot;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;

public class Mecatronico extends Humano {

    public Mecatronico(String nombre) {
        super(nombre);
    }

    public void ensamblar(Soldado ssSoldado, ExoBot ssExobot, IABOT ssIaBot) throws InterruptedException {
        System.out.println("El soldado consta de las siguientes habilidades: ");
        System.out.println("Brazo Derecho, habilidad: " + ssSoldado.getssHabilidadBrazoDerecho());
        System.out.println("Brazo Izquierdo, habilidad: " + ssSoldado.getssHabilidadBrazoIzquierdo());
        System.out.println("Ensamblando exobot, con las siguientes armas");
        ssExobot.unirseSoldado(ssSoldado);
    }

}
