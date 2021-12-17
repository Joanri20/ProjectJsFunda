public class Empleado {
    private User empleado[];

    public Empleado(User[] empleado) {
        this.empleado = empleado;
    }

    public User[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(User[] empleado) {
        this.empleado = empleado;
    }
}
