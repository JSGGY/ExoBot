package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.ITecnicoRuso;

public class ExpertoRuso {
    private final String ssNombreExpertoRuso;

    public ExpertoRuso() {
        this.ssNombreExpertoRuso = "Sebastian";
    }

    public String getSsNombreExpertoRuso() {
        return ssNombreExpertoRuso;
    }

    public void ssEnsenarRuso(ITecnicoRuso iTecnicoRuso) {
        System.out.println("Ensenando a la AntBot Ruso" + " soy el maestro " + getSsNombreExpertoRuso());
    }
}
