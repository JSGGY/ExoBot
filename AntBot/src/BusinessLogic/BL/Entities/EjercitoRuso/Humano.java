package BusinessLogic.Entities.EjercitoRuso;

public abstract class Humano {
    private String ssNombre;

    public Humano(String ssNombre) {
        this.ssNombre = ssNombre;
    }

    public String getssNombre() {
        return ssNombre;
    }

    public void setssNombre(String ssNombre) {
        this.ssNombre = ssNombre;
    }

}
