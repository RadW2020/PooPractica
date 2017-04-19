package Main;

import java.util.Date;
import pooPractica.Personas.Mecanico;
import pooPractica.Vehiculos.Vehiculo;

/**
 *
 * @author RadW
 */
public class FichaReparacion implements java.io.Serializable{
    
    private Vehiculo vehiculo;
    private Mecanico mecanicoAsignado;
    private String notasMecanico;
    private enum estado {PENDIENTE, PROCESO, PARADO, PRUEBA, TERMINADO};
    private Date fechaRecepcion;
    private Date fechaTerminado;
    
}
