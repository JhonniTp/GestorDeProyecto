//sub clase de la clase Persona

public class Especialista extends Persona {
    private double tarifaHora;

    public Especialista(String nombres, String apellidos, int edad, String genero, String dni, double tarifaHora) {
        super(nombres, apellidos, edad, genero, dni);
        this.tarifaHora = tarifaHora;
    }

    // captadores y setter de tarifaHora

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
}
