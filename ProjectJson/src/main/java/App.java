import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    private File file;
    static Gson gson;
    private static final String jsonFilePath= "src\\main\\resources\\Empleado.json";

    public static void main(String[] args) {
        gson=new Gson();
        ImprimirEmpleados(JsonToObject());
    }

    public static Empleado JsonToObject(){
        Empleado empleado= null;
            try {
                empleado = gson.fromJson(new FileReader(jsonFilePath), Empleado.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return empleado;
        }


    public static void ImprimirEmpleados(Empleado emp) {
        for (int i = 0; i < emp.getEmpleado().length; i++) {
            System.out.println("******EMPLEADO # "+(i+1)+"*****");
            System.out.println("*Nombre: "+emp.getEmpleado()[i].getFirstName());
            System.out.println("*Apellido: "+emp.getEmpleado()[i].getLastName());
            System.out.println("*Edad: "+emp.getEmpleado()[i].getAge());
            System.out.println("*Dirección: "+emp.getEmpleado()[i].getAddress().getStreetAddress()
                                +" Ciudad: "+emp.getEmpleado()[i].getAddress().getCity()
                                +" Codigo Postal: "+emp.getEmpleado()[i].getAddress().getPostalCode());
            System.out.println("***********************\n");

        }

    }




}
