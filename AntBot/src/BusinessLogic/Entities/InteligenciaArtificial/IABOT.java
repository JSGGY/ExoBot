package BusinessLogic.Entities.InteligenciaArtificial;

import java.util.Hashtable;

import BusinessLogic.Entities.Exoesqueleto.ITecnicoRuso;
import BusinessLogic.Entities.Exoesqueleto.ITecnicoIngles;


public class IABOT implements ITecnicoRuso, ITecnicoIngles {
    // patron Singletoon
    private static String ssNombre;
    private static IABOT ssInstancia;

    private IABOT() {
    }

    protected IABOT(IABOT ia) {
        if (ia != null) {
            ssInstancia = ia;
        }
    }

    public static IABOT getssInstancia(String ssNombre) {
        if (ssInstancia == null) {
            ssInstancia = new IABOT();
            IABOT.ssNombre = ssNombre;
        }
        return ssInstancia;
    }

    public String getssNombre() {
        return ssNombre;
    }

    private void setssNombre(String ssNombre) {
        this.ssNombre = ssNombre;
    }

    Hashtable<Integer, String> ssListaAprendizajes = new Hashtable<>();

    public void ssAprenderIdiomaIngles() {
        ssListaAprendizajes.put(1, " Ingles");
    }

    public void ssAprenderIdiomaRuso() {
        ssListaAprendizajes.put(2, " Ruso");
    }

    public void ssMostrarIdiomasAprendidos() {
        System.out.println("IAbot ha logrado aprender:");
        ssListaAprendizajes.forEach((k, v) -> {
            System.out.print(v + " , ");
        });
        System.out.println();
    }
}
