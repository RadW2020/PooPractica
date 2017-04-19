package pooPractica.Personas;

import Main.FichaReparacion;
import pooPractica.Vehiculos.Vehiculo;

/**
 *
 * @author RadW
 */
public class Cliente extends Persona{
    
    
    private String email;
    private Vehiculo[] vehiculos; //array con los vehiculos que posee el cliente
    private FichaReparacion fichaActual; // ficha de reparación actual en proceso

 
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
