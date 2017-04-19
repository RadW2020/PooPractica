package Main;

import java.util.ArrayList;
import java.util.Scanner;
import pooPractica.Personas.Persona;
import pooPractica.Vehiculos.Vehiculo;

/**
 *
 * @author RadW
 */
public class Taller {

    ArrayList<Vehiculo> VehiculosBD;
    ArrayList<Persona> PersonasBD;
    ArrayList<FichaReparacion> FichasBD;

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Taller taller = new Taller();

        taller.checkArchivosBD();

        while (true) {
            taller.display();
        }
    }
    
    

    //cheque si existen los archivos BD, si existen los lee y 
    //los carga en los arrays, si no, los crea vacíos.
    public void checkArchivosBD() {

    }

    public void display() {
        System.out.println("\n\nTALLER VEHICULOS");
        System.out.println(
                "Selecciona una opción: \n"
                + "  1) Alta Nuevo Vehiculo\n"
                + "  2) Alta Cliente y ficha reparación\n"
                + "  3) Búsqueda sobre BD de Vehículos \n"
                + "  4) Salir\n "
        );

        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1:
                this.nuevoVehiculo();
                break;
            case 2:
                this.altaCliente();
                break;
            case 3:
                this.consultaVehiculos();
                break;
            case 4:
                //grabar los cambios en los arrays antes de salir
                this.salir();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    private void salir() {
        System.out.println("Saliendo...");
        System.exit(0);
    }
    
    //alta de un nuevo vehiculo
    public  void nuevoVehiculo() {
        
        System.out.println("Introduce el número que indique el tipo de vehículo: ");
        System.out.println("1 Autobus, 2 Camión, 3 Deportivo, 4 Furgoneta,"
                + "5 Moto, 6 Todoterreno, 7 Turismo ");
        int selection = input.nextInt();
        input.nextLine();

        switch (selection) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                //grabar los cambios en los arrays antes de salir
                this.salir();
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        
        }
        String matricula = input.next();
        input.nextLine();
        
        
        //String matricula = input.next();
        input.nextLine();
        
        
    }

    private void altaCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void consultaVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
