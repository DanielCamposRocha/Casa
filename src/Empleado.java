import java.util.Date;

public class Empleado {
    public String nombre;
    public Date birthdate;

    public Empleado(String name, Date birthdate) {
        this.nombre=name;
        this.birthdate=birthdate;
    }

    @Override
    public String toString(){
        return "Empleado: "+nombre+" (nacido en 19"+birthdate.getYear()+")";
    }
}
