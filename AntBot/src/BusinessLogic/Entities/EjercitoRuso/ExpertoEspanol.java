package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.ITecnicoEspanol;

public class ExpertoEspanol {
    private final String ssNombreExpertoEspanol;

    public ExpertoEspanol() {
        this.ssNombreExpertoEspanol = "Sebastian";
    }

    public String getSsNombreExpertoEspanol() {
        return ssNombreExpertoEspanol;
    }

    public void ssEnsenarEspanol(ITecnicoEspanol iTecnicoEspanol) {
        System.out.println("Enseñando a la IABOT espanol" + " soy el maestro " + getSsNombreExpertoEspanol());
    }
}
