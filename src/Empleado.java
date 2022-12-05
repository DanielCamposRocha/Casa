import java.util.Date;

public class Empleado {
    String nombre;
    Date fechaContratacion;
    int edad;

    public Empleado(String name,int edad, Date fechaContratacion) {
        this.nombre=name;
        this.edad=edad;
        this.fechaContratacion=fechaContratacion;
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre+" ("+edad+" años; contratado en 19"+fechaContratacion.getYear()+")";
    }
}
