package BusinessLogic.Entities.EjercitoRuso;

import BusinessLogic.Entities.Exoesqueleto.FuentePoder;
import BusinessLogic.Entities.Exoesqueleto.TurboReactor;

public class HormigaRusa extends Hormiga implements IhomigaExtremidad {
    private String clasificacion;
        
    public HormigaRusa(String nombre, String clasificacion) {
        super(nombre);
        this.clasificacion = clasificacion;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {            
            this.clasificacion = clasificacion;
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
