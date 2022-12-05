import java.util.Date;

public class Empleado {

    private final String nombre;
    private final Date fechaContratacion;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public int getEdad() {
        return edad;
    }

    public static Empleado crearEmpleado(String nombre, int edad, Date fechaContratacion) {
        if (edad<0)throw new RuntimeException("Un empleado no puede tener edad negativa");
        else return new Empleado(nombre,edad,fechaContratacion);
    }

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
