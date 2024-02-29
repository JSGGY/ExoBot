package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.FuentePoder;
import BusinessLogic.Entities.Exoesqueleto.TurboReactor;

public class HormigaRusa extends Hormiga implements IhomigaExtremidad {
    private String clasificacion;
    
    private Boolean ssHabilidadBrazoIzquierdo;
    private Boolean ssHabilidadBrazoDerecho;
    
    public HormigaRusa(String nombre, String clasificacion) {
        super(nombre);
        this.clasificacion = clasificacion;
        if (HormigaRusa.radio)
        setssHabilidadBrazoDerecho(getHabilidadRandom());
        
        if (HormigaRusa.circuitoAnillado)
        setssHabilidadBrazoIzquierdo(getHabilidadRandom());
        
    }
    
    private boolean getHabilidadRandom() {
        int bias = 50;
        return (Math.random() * 100 < bias);
    }
    
    public Boolean getssHabilidadBrazoIzquierdo() {
        return ssHabilidadBrazoIzquierdo;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
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
