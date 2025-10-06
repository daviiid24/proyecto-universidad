package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Universidad universidad = inicializarDatos();

        int opcionPrincipal;

        do {
            opcionPrincipal = mostrarMenuPrincipal();

            switch (opcionPrincipal) {
                case 1: // Estudiantes
                    menuEstudiantes(universidad);
                    break;
                case 2: // Docentes
                    menuDocentes(universidad);
                    break;
                case 3: // Cursos
                    menuCursos(universidad);
                    break;
                case 4: // Rector
                    menuRector(universidad);
                    break;

                case 5:
                    //verificarNombrePalindromo(estudiante1, docente);
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcionPrincipal != 6);


    }

    private static int mostrarMenuPrincipal() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1 - Estudiantes");
        System.out.println("2 - Docentes");
        System.out.println("3 - Cursos");
        System.out.println("4 - Rector");
        System.out.println("5 - Métodos");
        System.out.println("6 - Salir");
        return leerEntero("Seleccione una opción: ");
    }

    private static void menuEstudiantes(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- CRUD ESTUDIANTES ---");
            System.out.println("1 - Crear");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Obtener");
            System.out.println("5 - Salir");
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearEstudiante(universidad);
                case 2 -> eliminarEstudiante(universidad);
                case 3 -> actualizarEstudiante(universidad);
                case 4 -> obtenerEstudiante(universidad);
                case 5 -> System.out.println("Saliendo del menú estudiantes...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static void menuDocentes(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- CRUD DOCENTES ---");
            System.out.println("1 - Crear");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Obtener");
            System.out.println("5 - Asociar curso a docente");
            System.out.println("6 - Mostrar cursos asociados a el docente");
            System.out.println("7 - Salir");
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearDocente(universidad);
                case 2 -> eliminarDocente(universidad);
                case 3 -> actualizarDocente(universidad);
                case 4 -> obtenerDocente(universidad);
                case 5 -> asociarCursoADocente(universidad);
                case 6 -> mostrarCursosDeDocente(universidad);
                case 7 -> System.out.println("Saliendo del menú docentes...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    private static void menuCursos(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- CRUD CURSOS ---");
            System.out.println("1 - Crear");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Obtener");
            System.out.println("5 - Asociar estudiante a curso");
            System.out.println("6 - Mostrar estudiantes asociados a un curso");
            System.out.println("7 - Salir");
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearCurso(universidad);
                case 2 -> eliminarCurso(universidad);
                case 3 -> actualizarCurso(universidad);
                case 4 -> obtenerCurso(universidad);
                case 5 -> asociarEstudiantesACurso(universidad);
                case 6 -> mostrarEstudiantesDeCurso(universidad);
                case 7 -> System.out.println("Saliendo del menú cursos...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 7);
    }

    private static void menuRector(Universidad universidad) {
        int opcion;
        do {
            System.out.println("\n--- CRUD RECTOR ---");
            System.out.println("1 - Crear");
            System.out.println("2 - Eliminar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Obtener");
            System.out.println("5 - Salir");
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearRector(universidad);
                case 2 -> eliminarRector(universidad);
                case 3 -> actualizarRector(universidad);
                case 4 -> obtenerRector(universidad);
                case 5 -> System.out.println("Saliendo del menú rector...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    public static void verificarNombrePalindromo(Estudiante estudiante1, Docente docente){

        boolean resultado=docente.verificarNombrePalindromo(estudiante1.getNombre());

        if (resultado) {
            System.out.println("El nombre del estudiante es palindromo:");
        }else{
            System.out.println("El nombre del estudiante no es palindromo:");
        }

    }
    /*
    public static void verificarEdadEsPrimo(Estudiante estudiante1, Docente docente){
        boolean resultado=docente.verificarEdadEsPrimo(estudiante1.getEdad());
        if(resultado) {
            System.out.println("Edad es primo");
        } else {
            System.out.println("Edad no es primo");
        }
    }
    */
    private static void crearEstudiante(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del estudiante: ");
        String apellido = leerStringConsola("Ingrese el apellido del estudiante: ");
        int edad = leerEntero("Ingrese la edad del estudiante: ");
        String identificacion = leerStringConsola(("Ingrese la identificacion del estudiante:"));
        double nota1 = leerDoubleConsola("Ingrese la nota 1: ");
        double nota2 = leerDoubleConsola("Ingrese la nota 2: ");
        double nota3 = leerDoubleConsola("Ingrese la nota 3: ");

        boolean resultado = universidad.crearEstudiante(nombre, apellido, edad, nota1, nota2, nota3, identificacion);

        if (resultado) {
            System.out.println("Estudiante creado con exito");
        } else {
            System.out.println("Estudiante no creado");
        }
    }

    private static void eliminarEstudiante(Universidad universidad) {
        String idEliminar = leerStringConsola("Ingrese el id del estudiante a eliminar:");
        boolean resultado = universidad.eliminarEstudiante(idEliminar);
        if (resultado) {
            System.out.println("Estudiante eliminado con exito");
        } else {
            System.out.println("Estudiante no eliminado");
        }
    }

    private static void actualizarEstudiante(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del estudiante: ");
        String apellido = leerStringConsola("Ingrese el apellido del estudiante: ");
        int edad = leerEntero("Ingrese la edad del estudiante: ");
        String identificacion = leerStringConsola(("Ingrese la identificacion del estudiante:"));
        double nota1 = leerDoubleConsola("Ingrese la nota 1: ");
        double nota2 = leerDoubleConsola("Ingrese la nota 2: ");
        double nota3 = leerDoubleConsola("Ingrese la nota 3: ");

        boolean resultado = universidad.actualizarEstudiante(nombre, apellido, edad, nota1, nota2, nota3, identificacion);

        if (resultado) {
            System.out.println("Estudiante actualizado con exito");
        } else {
            System.out.println("Estudiante no actualizado");
        }
    }

    public static void obtenerEstudiante(Universidad universidad) {
        String idBuscar = leerStringConsola("Ingrese el id del estudiante a buscar:");
        Estudiante resultado = universidad.obtenerEstudiante(idBuscar);
        if (resultado != null) {
            System.out.println("Estudiante encontrado con exito");
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    private static void crearDocente(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del docente: ");
        int edad = leerEntero("Ingrese la edad del docente: ");
        String correo = leerStringConsola("Ingrese el correo del docente: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del docente: ");

        boolean resultado = universidad.crearDocente(nombre, edad, correo, identificacion);

        if (resultado) {
            System.out.println("Docente creado con exito");
        } else {
            System.out.println("Docente no creado");
        }
    }

    private static void eliminarDocente(Universidad universidad) {
        String idEliminar = leerStringConsola("Ingrese el id del docente a eliminar:");
        boolean resultado = universidad.eliminarDocente(idEliminar);
        if (resultado) {
            System.out.println("Docente eliminado con exito");
        } else {
            System.out.println("Docente no eliminado");
        }
    }

    private static void actualizarDocente(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del docente: ");
        int edad = leerEntero("Ingrese la edad del docente: ");
        String correo = leerStringConsola("Ingrese el correo del docente: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del docente: ");

        boolean resultado = universidad.actualizarDocente(nombre, edad, correo, identificacion);

        if (resultado) {
            System.out.println("Docente actualizado con exito");
        } else {
            System.out.println("Docente no actualizado");
        }
    }

    public static void obtenerDocente(Universidad universidad) {
        String idBuscar = leerStringConsola("Ingrese el id del docente a buscar:");
        Docente resultado = universidad.obtenerDocente(idBuscar);
        if (resultado != null) {
            System.out.println("Docente encontrado con exito");
        } else {
            System.out.println("Docente no encontrado");
        }
    }

    private static void crearCurso(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del curso: ");
        String semestre = leerStringConsola("Ingrese el semestre del curso: ");
        String grupo = leerStringConsola("Ingrese el grupo del curso: ");
        double creditos = leerDoubleConsola("Ingrese los creditos: ");
        String jornada = leerStringConsola("Ingrese la jornada: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del curso: ");

        boolean resultado = universidad.crearCurso(nombre, semestre, grupo, creditos, jornada, identificacion);

        if (resultado) {
            System.out.println("Curso creado con exito");
        } else {
            System.out.println("Curso no creado");
        }
    }

    private static void eliminarCurso(Universidad universidad) {
        String idEliminar = leerStringConsola("Ingrese el id del curso a eliminar:");
        boolean resultado = universidad.eliminarCurso(idEliminar);
        if (resultado) {
            System.out.println("Curso eliminado con exito");
        } else {
            System.out.println("Curso no eliminado");
        }
    }

    private static void actualizarCurso(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del curso: ");
        String semestre = leerStringConsola("Ingrese el semestre del curso: ");
        String grupo = leerStringConsola("Ingrese el grupo del curso: ");
        double creditos = leerDoubleConsola("Ingrese los creditos: ");
        String jornada = leerStringConsola("Ingrese la jornada: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del curso: ");

        boolean resultado = universidad.actualizarCurso(nombre, semestre, grupo, creditos, jornada, identificacion);

        if (resultado) {
            System.out.println("Curso actualizado con exito");
        } else {
            System.out.println("Curso no actualizado");
        }
    }

    public static void obtenerCurso(Universidad universidad) {
        String idBuscar = leerStringConsola("Ingrese el id del curso a buscar:");
        Curso resultado = universidad.obtenerCurso(idBuscar);
        if (resultado != null) {
            System.out.println("Curso encontrado con exito");
        } else {
            System.out.println("Curso no encontrado");
        }
    }


    private static void crearRector(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del rector: ");
        String apellido = leerStringConsola("Ingrese el apellido del rector: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del rector: ");

        boolean resultado = universidad.crearRector(nombre, apellido, identificacion);

        if (resultado) {
            System.out.println("Rector creado con exito");
        } else {
            System.out.println("Rector no creado");
        }
    }

    private static void eliminarRector(Universidad universidad) {

        boolean resultado = universidad.eliminarRector();
        if (resultado) {
            System.out.println("Rector eliminado con exito");
        } else {
            System.out.println("Rector no eliminado");
        }
    }

    private static void actualizarRector(Universidad universidad) {
        String nombre = leerStringConsola("Ingrese el nombre del rector: ");
        String apellido = leerStringConsola("Ingrese el apellido del rector: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del rector: ");

        boolean resultado = universidad.actualizarRector(nombre, apellido, identificacion);

        if (resultado) {
            System.out.println("Rector actualizado con exito");
        } else {
            System.out.println("Rector no actualizado");
        }
    }

    public static void obtenerRector(Universidad universidad) {
        Rector resultado = universidad.obtenerRector();
        if (resultado != null) {
            System.out.println("Rector encontrado con exito");
        } else {
            System.out.println("Rector no encontrado");
        }
    }
    private static void asociarCursoADocente(Universidad universidad) {
        String idDcocente = leerStringConsola("Ingrese la identificacion del docente:");
        String idCurso = leerStringConsola("Ingrese la identificacion del curso");
        boolean resultado = universidad.asociarCursoADocente(idDcocente, idCurso);

        if (resultado) {
            System.out.println("Curso asociado correctamente al docente.");
        } else {
            System.out.println("No se pudo asociar el curso. Verifique los datos.");
        }
    }
    private static void mostrarCursosDeDocente(Universidad universidad) {
        String idDocente = leerStringConsola("Ingrese la identificación del docente: ");
        universidad.mostrarCursosDeDocente(idDocente);
    }
    private static void asociarEstudiantesACurso(Universidad universidad) {
        String idEstudiante = leerStringConsola("Ingrese la identificación del estudiante: ");
        String idCurso = leerStringConsola("Ingrese la identificación del curso: ");
        boolean resultado = universidad.asociarEstudianteACurso(idEstudiante, idCurso);

        if (resultado) {
            System.out.println("Estudiante asociado correctamente al curso.");
        } else {
            System.out.println("No se pudo asociar el estudiante. Verifique los datos.");
        }
    }
    private static void mostrarEstudiantesDeCurso(Universidad universidad) {
        String idCurso = leerStringConsola("Ingrese la identificación del curso: ");
        universidad.mostrarEstudiantesDeCurso(idCurso);
    }

    private static Universidad inicializarDatos() {
        Universidad universidad = new Universidad();

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

    public static String leerStringConsola(String mensaje) {
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static double leerDoubleConsola(String mensaje) {
        double dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Double.parseDouble(captura);
        return dato;
    }
}
