import java.util.Date;

public class Empleado {
    String nombre;
    Date fechaContratacion;
    private int edad;

    public void setEdad(int edad) {
        if(edad<0)throw new RuntimeException("un empleado no puede tener edad negativa");
        else  this.edad = edad;
    }

    public Empleado(String name, int edad, Date fechaContratacion) {
        this.nombre=name;
        this.edad=edad;
        this.fechaContratacion=fechaContratacion;
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre+" ("+edad+" años; contratado en 19"+fechaContratacion.getYear()+")";
    }
}
