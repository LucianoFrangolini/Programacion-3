package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Persona implements Serializable
{
    private static SimpleDateFormat formato=new SimpleDateFormat("dd MMMMMMMMM yyyy");
    private String nombre;
    private GregorianCalendar fechaNacimiento;


    public Persona(){}
    public Persona(String nombre, GregorianCalendar fechaNacimiento)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public GregorianCalendar getFechaNacimiento()
    {
        return fechaNacimiento;
    }


    @Override
    public String toString()
    {
        // TODO Implement this method
        return "Nombre: "+this.nombre+" fecha de nacimiento: "+Persona.formato.format(this.fechaNacimiento.getTime());
    }

}
