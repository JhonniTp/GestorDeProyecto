public class Principal {
    public static void main(String[] args) {

        //INTEGRANTES:

        //Yoni Nando Turpo Quispe
        //Nicole Angi Curi Zarate
        //Elvis Ccahua Saico
        //Renato Sebastian Torres Rodriguez
        //Mayerli Katiuska Esperilla Cutipa

        // Creación de especialistas
        Especialista profesional1 = new Especialista("Juan", "Pérez", 30, "Masculino", "123456789", 50.0);
        Especialista profesional2 = new Especialista("María", "González", 35, "Femenino", "987654321", 60.0);
        Especialista profesional3 = new Especialista("Carlos", "Mendoza", 28, "Masculino", "654321987", 70.0);
        Especialista profesional4 = new Especialista("Renzo", "Acosta", 32, "Masculino", "456789123", 70.0);
        Especialista profesional5 = new Especialista("Miguel", "Rojas", 29, "Masculino", "321987654", 80.0);

        // Creación de proyecto
        Proyecto desarrollo = new Proyecto("PR01", "Gestor de proyectos", 30, 10000.0);

        // Agregar especialistas al proyecto
        desarrollo.agregarEspecialista(profesional1);
        desarrollo.agregarEspecialista(profesional2);
        desarrollo.agregarEspecialista(profesional3);
        desarrollo.agregarEspecialista(profesional4);
        desarrollo.agregarEspecialista(profesional5);

        // Mostrar la creación del proyecto
        System.out.println("Se ha creado el proyecto:");
        System.out.println("Código: " + desarrollo.getCodigo());
        System.out.println("Nombre: " + desarrollo.getNombre());
        System.out.println("Duración: " + desarrollo.getDuracion() + " días");
        System.out.println("Presupuesto: S/" + desarrollo.getPresupuesto());

        // Mostrar precio por trabajador por hora
        System.out.println("Precio de trabajador por hora:");
        System.out.println("Total de trabajadores");
        for (Especialista especialista : desarrollo.getEspecialistas()) {
            System.out.println("\t" + especialista.getNombres() + " " + especialista.getApellidos() + ": S/." + especialista.getTarifaHora());
        }

        // Calcular costo del proyecto
        double costoProyecto = desarrollo.calcularCostoProyecto();

        // Imprimir resultado
        System.out.println("El costo total del proyecto es: S/." + costoProyecto);

        System.out.println("INTEGRANTES: ");
        System.out.println("Yoni Nando Turpo Quispe");
        System.out.println("Nicole Angi Curi Zarate");
        System.out.println("Elvis Ccahua Saico");
        System.out.println("Renato Sebastian Torres Rodriguez");
        System.out.println("Mayerli Katiuska Esperilla Cutipa");

        
    }
}

