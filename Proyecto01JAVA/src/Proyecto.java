import java.util.ArrayList;

public class Proyecto {
    private String codigo;
    private String nombre;
    private int duracion;
    private double presupuesto;
    private ArrayList<Especialista> especialistas;

    public Proyecto(String codigo, String nombre, int duracion, double presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.presupuesto = presupuesto;
        this.especialistas = new ArrayList<>();
    }

    // captadores y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Especialista> getEspecialistas() {
        return especialistas;
    }

    // Método para agregar un especialista al proyecto

    public void agregarEspecialista(Especialista especialista) {
        especialistas.add(especialista);
    }

    // Método para calcular el costo total del proyecto

    public double calcularCostoProyecto() {
        double costoTotal = 0.0;
        for (Especialista especialista : especialistas) {
            costoTotal += especialista.getTarifaHora() * duracion;
        }
        return costoTotal;
    }
}
 
