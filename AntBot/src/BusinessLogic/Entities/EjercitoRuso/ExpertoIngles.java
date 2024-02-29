package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.ITecnicoIngles;

public class ExpertoIngles {
    private final String ssNombreExpertoIngles;

    public ExpertoIngles() {
        this.ssNombreExpertoIngles = "Arthur";
    }

    public String getSsNombreExpertoIngles() {
        return ssNombreExpertoIngles;
    }

    public void ssEnsenarIngles(ITecnicoIngles iTecnicoIngles) {
        System.out.println("Ensenando a la AntBot ingles" + " soy el maestro " + getSsNombreExpertoIngles());
    }

}
