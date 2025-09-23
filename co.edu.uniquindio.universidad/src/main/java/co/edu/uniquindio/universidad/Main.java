package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.*;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = inicializaDatos();

        Estudiante estudiante = universidad.getListaEstudiantes().get(0);
        estudiante.getOwnedByUniversidad();

        calcularDefinitivaEstudiante(estudiante1, docente);
        calcularPromedioCurso(estudiante1, estudiante2, estudiante3, docente);
        calcularPromedioEdad(estudiante1, estudiante2, estudiante3, docente);
        calcularPromedioNota1(estudiante1, estudiante2, estudiante3, docente);
        calcularNotaMayorCurso(estudiante1, estudiante2, estudiante3, docente);
        calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3, docente);
        aprobacionCurso(estudiante1, estudiante2, estudiante3, docente);
        porcentajeAprobados(estudiante1, estudiante2, estudiante3, docente);
        porcentajeReprobados(estudiante1, estudiante2, estudiante3, docente);
        obtenerEstudianteNotasMayor4(estudiante1,  estudiante2, estudiante3, docente);
        obtenerNotaMaxima(estudiante1,  estudiante2, estudiante3, docente);

    }

    private static Universidad inicializaDatos() {
        Universidad universidad = inicializaDatos();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Raul");
        estudiante1.setEdad(19);
        estudiante1.setCorreo("ujfe");
        estudiante1.setSemestre(8);
        estudiante1.setNota1(4.0);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Rodolfo");
        estudiante2.setEdad(17);
        estudiante2.setCorreo("jberjgk");
        estudiante2.setSemestre(9);
        estudiante2.setNota1(5.0);
        estudiante2.setNota2(4.9);
        estudiante2.setNota3(4.7);
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Ana");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("vjwi");
        estudiante3.setSemestre(9);
        estudiante3.setNota1(4.5);
        estudiante3.setNota2(3.0);
        estudiante3.setNota3(4.5);
        Docente docente= new Docente();
        docente.setNombre("Pedro");
        docente.setEdad(35);
        docente.setCorreo("sbvi");
        Rector rector = new Rector();
        rector.setNombre("Rodolfo");
        rector.setApellido("Aifi");
    }

    public static void calcularDefinitivaEstudiante(Estudiante estudiante, Docente docente){
        double definitiva=docente.calcularDefinitivaEstudiante(estudiante.getNota1(), estudiante.getNota2(), estudiante.getNota3());
        System.out.println("La definitiva es: "+definitiva);
    }
    public static void calcularPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double promedio = docente.calcularPromedioCurso(def1, def2, def3);
        System.out.println("El promedio del curso es: " + promedio);
    }

    public static void calcularPromedioEdad(Estudiante estudiante1, Estudiante eestudiante2, Estudiante estudiante3, Docente docente) {
        int edadPromedio = docente.calcularPromedioEdad(estudiante1.getEdad(), eestudiante2.getEdad(), estudiante3.getEdad());
        System.out.println("La edad promedio es: " + edadPromedio);
    }
    public static void calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double promedioNota1=docente.calcularPromedioNota1(estudiante1.getNota1(), estudiante2.getNota1(), estudiante3.getNota1());
        System.out.println("El promedio de la nota 1 es " +promedioNota1);
    }
    public static void calcularNotaMayorCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMayor= docente.calcularNotaMayorCurso(def1, def2, def3);
        System.out.println("La nota mayor es " +notaMayor);
    }
    public static void calcularNotaMenorCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMenor =docente.calcularNotaMenorCurso(def1, def2, def3);
        System.out.println("La nota menor es " + notaMenor);
    }
    public static void aprobacionCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        String aprobados=docente.aprobacionCurso(def1, def2, def3);
        System.out.println("Aprobados: "+aprobados);
    }
    public static void porcentajeAprobados(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double porcentajeAprobados = docente.calcularPorcentajeAprobados(def1, def2, def3);
        System.out.println("Porcentaje de los aprobados: " + porcentajeAprobados);
    }
    public static void porcentajeReprobados(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double porcentajeReprobados = docente.calcularPorcentajeReprobados(def1, def2, def3);
        System.out.println("Porcentaje de los reprobados: " + porcentajeReprobados);
    }
    public static void obtenerEstudianteNotasMayor4(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        String estudiante =docente.obtenerEstudianteNotasMayor4(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3(),
                estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3(),
                estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        System.out.println("Estudiante con todas las notas mayores o iguales a 4: "+ estudiante);
    }
    public static void obtenerNotaMaxima(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3, Docente docente) {
        double def1 = docente.calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double def2 = docente.calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double def3 = docente.calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMaxima=docente.obtenerNotaMaxima(def1, def2, def3);
        System.out.println("La nota maxima es de: "+notaMaxima);
    }
}