package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.FuentePoder;
import BusinessLogic.Entities.Exoesqueleto.TurboReactor;

public class Soldado extends Humano implements IhomigaExtremidad {
    private Boolean ssHabilidadBrazoIzquierdo;
    private Boolean ssHabilidadBrazoDerecho;

    public Soldado(String nombre) {
        super(nombre);

        if (Soldado.radio)
            setssHabilidadBrazoDerecho(getHabilidadRandom());

        if (Soldado.circuitoAnillado)
            setssHabilidadBrazoIzquierdo(getHabilidadRandom());

    }

    private boolean getHabilidadRandom() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }

    public Boolean getssHabilidadBrazoIzquierdo() {
        return ssHabilidadBrazoIzquierdo;
    }

    public void setssHabilidadBrazoIzquierdo(Boolean ssHabilidadBrazoIzquierdo) {
        this.ssHabilidadBrazoIzquierdo = ssHabilidadBrazoIzquierdo;
    }

    public Boolean getssHabilidadBrazoDerecho() {
        return ssHabilidadBrazoDerecho;
    }

    public void setssHabilidadBrazoDerecho(Boolean ssHabilidadBrazoDerecho) {
        this.ssHabilidadBrazoDerecho = ssHabilidadBrazoDerecho;
    }

    public void ssReemplazarBateriaTurboReactor(TurboReactor oSSTurboReactor) {
        System.out.println("Recargando/ reemplazando batería");
        TurboReactor.ssNivelDeEnergia = 100;

    }

    public void ssReemplazarBateriaFuente(FuentePoder ossFuentePoder) {
        System.out.println("Recargando/ reemplazando batería");
        FuentePoder.ssNivelDeEnergia = 100;

    }
}
