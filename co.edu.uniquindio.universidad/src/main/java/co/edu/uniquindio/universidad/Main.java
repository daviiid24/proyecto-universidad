import co.edu.uniquindio.universidad.model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Universidad universidad = inicializaDatos();

        //Estudiante estudiante = universidad.getListaEstudiantes().get(0);
        //estudiante.getOwnedByUniversidad();

                int opcionSeleccionada;

                do {
                    mostrarMenu();
                    opcionSeleccionada = leerEntero("Ingrese una opción: ");

                    switch (opcionSeleccionada) {
                        case 1:
                            String respuesta = crearEstudiante();
                            System.out.println(respuesta);
                            break;
                        case 2:
                            String respuesta1 = crearDocente();
                            System.out.println(respuesta1);
                            break;
                        case 3:
                            String respuesta2 = crearCurso();
                            System.out.println(respuesta2);
                            break;
                        case 4:
                            System.out.println("Saliendo de la aplicación...");
                            break;
                        default:
                            System.out.println("Opción no válida, intente de nuevo.");
                    }
                } while (opcionSeleccionada != 4);
            }

            //
       //calcularDefinitivaEstudiante(estudiante1, docente);
//calcularPromedioCurso(estudiante1, estudiante2, estudiante3, docente);
//calcularPromedioEdad(estudiante1, estudiante2, estudiante3, docente);
//calcularPromedioNota1(estudiante1, estudiante2, estudiante3, docente);
//calcularNotaMayorCurso(estudiante1, estudiante2, estudiante3, docente);
//calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3, docente);
//aprobacionCurso(estudiante1, estudiante2, estudiante3, docente);
//porcentajeAprobados(estudiante1, estudiante2, estudiante3, docente);
//porcentajeReprobados(estudiante1, estudiante2, estudiante3, docente);
//obtenerEstudianteNotasMayor4(estudiante1,estudiante2, estudiante3, docente);
//obtenerNotaMaxima(estudiante1,  estudiante2, estudiante3, docente);
//
    }

    private static Universidad inicializaDatos() {
        Universidad universidad = new Universidad("Uniquindio");
        return universidad;
    }

private static void mostrarMenu() {
    System.out.println("\n===== MENÚ UNIVERSIDAD =====");
    System.out.println("1 - Crear estudiante");
    System.out.println("2 - Crear docente");
    System.out.println("3 - Crear curso");
    System.out.println("4 - Salir");
}

private static int leerEntero(String mensaje) {
    int dato = 0;
    String captura = "";
    System.out.println(mensaje);
    Scanner teclado = new Scanner(System.in);
    captura = teclado.nextLine();
    dato = Integer.parseInt(captura);
    return dato;
}
public static String leerStringConsola(String mensaje)
{
    String captura="";
    System.out.println(mensaje);
    Scanner teclado = new Scanner(System.in);
    captura = teclado.nextLine();
    return captura;
}
public static double leerDoubleConsola(String mensaje)
{
    double dato=0;
    String captura="";
    System.out.println(mensaje);
    Scanner teclado = new Scanner(System.in);
    captura = teclado.nextLine();
    dato=Double.parseDouble(captura);
    return dato;
}


public static String crearEstudiante() {
    String nombre = leerStringConsola("Ingrese el nombre del estudiante: ");
    int edad = leerEntero("Ingrese la edad del estudiante: ");
    String correo = leerStringConsola("Ingrese el correo del estudiante: ");
    int semestre = leerEntero("Ingrese el semestre del estudiante: ");
    double nota1 = leerDoubleConsola("Ingrese la nota 1: ");
    double nota2 = leerDoubleConsola("Ingrese la nota 2: ");
    double nota3 = leerDoubleConsola("Ingrese la nota 3: ");

    Estudiante estudiante1 = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);

    return estudiante1.toString();
}

public static String crearDocente() {
    String nombre = leerStringConsola("Ingrese el nombre del docente: ");
    int edad = leerEntero("Ingrese la edad del docente: ");
    String correo = leerStringConsola("Ingrese el correo del docente: ");

    Docente docente1 = new Docente(nombre, edad, correo);

    return docente1.toString();
}

public static String crearCurso() {
    String nombre = leerStringConsola("Ingrese el nombre del curso: ");
    String semestre = leerStringConsola("Ingrese el semestre del curso: ");
    String grupo = leerStringConsola("Ingrese el grupo del curso: ");
    double creditos = leerDoubleConsola("Ingrese los créditos del curso: ");
    String jornada = leerStringConsola("Ingrese la jornada del curso: ");

    Curso curso1 = new Curso(nombre, semestre, grupo, creditos, jornada, null);

    return curso1.toString();
}

void main() {
}

/*public static void calcularDefinitivaEstudiante(Estudiante estudiante, Docente docente){

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
    }*/
