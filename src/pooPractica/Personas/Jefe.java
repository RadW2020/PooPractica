
package pooPractica.Personas;

/**
 *
 * @author RadW
 */
public class Jefe extends Trabajador{
    
    private String password;

    //Constructor de la clase Jefe
    public Jefe(String password) {
        super();
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
    
}
