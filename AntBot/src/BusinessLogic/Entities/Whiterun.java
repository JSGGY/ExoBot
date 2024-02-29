package BusinessLogic.Entities;
import java.util.Scanner;

import BusinessLogic.Entities.EjercitoRuso.ExpertoRuso;
import BusinessLogic.Entities.EjercitoRuso.ExpertoIngles;
import BusinessLogic.Entities.EjercitoRuso.Mecatronico;
import BusinessLogic.Entities.EjercitoRuso.Soldado;
import BusinessLogic.Entities.Exoesqueleto.ExoBot;
import BusinessLogic.Entities.Exoesqueleto.FuentePoder;
import BusinessLogic.Entities.Exoesqueleto.TurboReactor;
import BusinessLogic.Entities.InteligenciaArtificial.IABOT;


public class Whiterun {

    public void iniciar() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        boolean ingresoCorrecto = false;
        Mecatronico mecatronico = new Mecatronico("mecatronico");
        int cantidadPelotones = 0;
        System.out.println("\u001B[38;5;208m" + "Creando la IA-BOT...");
        IABOT iaBot = IABOT.getssInstancia("IA-BOT");
        System.out.println("La IABOT aprenderá idiomas");
        ExpertoRuso oSSExpertoRuso = new ExpertoRuso();
        ExpertoIngles oSSExpertoIngles = new ExpertoIngles();
        oSSExpertoRuso.ssEnsenarRuso(iaBot);
        oSSExpertoIngles.ssEnsenarIngles(iaBot);
        iaBot.ssAprenderIdiomaRuso();
        iaBot.ssAprenderIdiomaIngles();

        iaBot.ssMostrarIdiomasAprendidos();
        System.out.println("Presione enter para continuar");
        sc.nextLine();
        limpiarConsola();
        while (ingresoCorrecto == false || cantidadPelotones <= 0) {

            System.out.println("¿Cuántos pelotones de 5 soldados desea crear?" + "\u001B[0m");
            try {
                cantidadPelotones = Integer.parseInt(sc.nextLine());
                ingresoCorrecto = true;
            } catch (Exception e) {
                System.out.println("Solo enteros positivos por favor");
            }
        }
        int contadorSoldadosTotales = 1;
        TurboReactor oSSTurboReactor = new TurboReactor();
        FuentePoder ossFuentePoder = new FuentePoder();
        for (int contadorPelotones = 0; contadorPelotones < cantidadPelotones; contadorPelotones++) {
            for (int contadorSoldados = 0; contadorSoldados < 5; contadorSoldados++) {
                System.out.println("\033[32m" + "Peloton " + (contadorPelotones + 1) + " :" + "\u001B[0m");
                String identificadorSoldado = "Soldado" + (contadorSoldadosTotales);
                contadorSoldadosTotales++;
                Soldado soldado = new Soldado(identificadorSoldado);
                ExoBot exobot = new ExoBot(iaBot);
                System.out.println("\033[35m" + identificadorSoldado + " :" + "\033[36m");

                mecatronico.ensamblar(soldado, exobot, iaBot);
                System.out.println("\033[31m" + "Presione enter para disparar" + "\u001B[0m");
                sc.nextLine();
                limpiarConsola();
                exobot.dispararArmas();
                System.out.println("Presione enter para continuar");
                sc.nextLine();
                limpiarConsola();
                System.out.println("Desea volar?");
                String ssdecisionVolar = sc.nextLine();
                if (ssdecisionVolar.toLowerCase().equals("si")) {

                    oSSTurboReactor.ssVolar();
                    System.out.println("Reemplazando batería del turbo reactor y de la fuente de poder ");
                    soldado.ssReemplazarBateriaTurboReactor(oSSTurboReactor);
                    soldado.ssReemplazarBateriaFuente(ossFuentePoder);
                    System.out.println("Baterias al 100");
                }

            }
        }

    }

    public void limpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
        }
    }
    // Soldado s1 = new Soldado("pepe");
    // Soldado s2 = new Soldado("pancho");
    // Soldado s3 = new Soldado("lucho");

    // System.out.println(e1.getNombre());
    // System.out.println(e2.getNombre());
    // System.out.println(e3.getNombre());

    // Hijo hijo1 = new Hijo("pepe");
    // Hijo hijo2 = new Hijo("pancho");
    // Hijo hijo3 = new Hijo("lucho");

    // System.out.println(hijo1.getNombre());
    // System.out.println(hijo2.getNombre());
    // System.out.println(hijo3.getNombre());

}
