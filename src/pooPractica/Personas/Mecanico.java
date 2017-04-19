/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPractica.Personas;

/**
 *
 * @author RadW
 */
public class Mecanico extends Trabajador{
    private int antiguedad;

    
    //Constructor de la clase Mecanico
    public Mecanico(int antiguedad) {
        super();
        this.antiguedad = antiguedad;
    }
    
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    
}
