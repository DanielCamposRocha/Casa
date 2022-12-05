import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Empleado p=Empleado.crearEmpleado("Pepe Pérez",31, new Date(90,Calendar.FEBRUARY,1));
        System.out.println(p);
       // p.nombre="Manolo";
        //p.fechaContratacion=new Date(99,Calendar.FEBRUARY,1);

        //p.edad=-31;//arreglado edad no accesible
       /* Empleado p2= new Empleado("Pepe Pérez", -31,new Date(90,Calendar.FEBRUARY,1));
        System.out.println(p);*/

        System.out.println("Si quier mostrar solo el nombre: "+ p.getNombre());
        System.out.println("Si quiero mostrar solo la edad no puedo: "+p.getEdad());
        /*aunque fecha es immutable, su tipo no lo es  de modo que podria modificarse
        * p.getFechaContratacion().getYear(10);*/
        /*date e suna calse que solo almancena 2 digitos par años,*/
        System.out.println("nueva fecha de contratacion: "+p.getFechaContratacion().getYear());

    }
}