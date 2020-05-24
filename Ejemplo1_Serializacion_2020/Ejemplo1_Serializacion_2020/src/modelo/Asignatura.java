package modelo;

import java.io.Serializable;

public class Asignatura implements Serializable
{
    private String nombre;
    private int codigo;


    public Asignatura(String nombre, int codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public Asignatura(){}

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo()
    {
        return codigo;
    }


    @Override
    public String toString()
    {
        // TODO Implement this method
        return "Asignatura: "+this.nombre+ " codigo: "+this.codigo;
    }
}
