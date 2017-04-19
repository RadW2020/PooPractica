package pooPractica.Vehiculos;

/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo implements java.io.Serializable
{
    private String marca;
    private String modelo;
    private int anyo;
    private String matricula;/////// clave identificativa
    //private Cliente cliente;
    private enum combustible{DIESEL, GASOLINA, ELECTRICO};
    private int numRuedas;
    
    public void Vehiculo(String matricula){
        this.matricula = matricula;
    }
    
   
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setAnyo(int anyo)
    {
        this.anyo = anyo;
    }
    
    public int getAnyo()
    {
        return anyo;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getMatricula()
    {
        return matricula;
    }

    
    
    
}