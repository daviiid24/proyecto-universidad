package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Universidad {

    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList();
    private ArrayList<Curso> listaCursos = new ArrayList();
    private ArrayList<Docente> listaDocentes = new ArrayList();
    private Rector rector;

    public Universidad() {
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public boolean crearEstudiante(String nombre,
                                   String apellido,
                                   int edad,
                                   double nota1,
                                   double nota2,
                                   double nota3,
                                   String identificacion) {

        Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
        if(estudianteEncontrado == null) {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre(nombre);
            estudiante.setApellido(apellido);
            estudiante.setEdad(edad);
            estudiante.setNota1(nota1);
            estudiante.setNota2(nota2);
            estudiante.setNota3(nota3);
            estudiante.setIdentificacion(identificacion);
            getListaEstudiantes().add(estudiante);

            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarEstudiante(String idEliminar) {
        Estudiante estudianteEncontrado=obtenerEstudiante(idEliminar);
        if(estudianteEncontrado!=null) {
            getListaEstudiantes().remove(estudianteEncontrado);
            return true;
        } else {
            return false;
        }
    }
    public boolean actualizarEstudiante(String nombre, String apellido, int edad, double nota1, double nota2, double nota3, String identificacion) {
        Estudiante estudianteEncontrado = obtenerEstudiante(identificacion);
        if(estudianteEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setApellido(apellido);
            estudianteEncontrado.setEdad(edad);
            estudianteEncontrado.setNota1(nota1);
            estudianteEncontrado.setNota2(nota2);
            estudianteEncontrado.setNota3(nota3);
            estudianteEncontrado.setIdentificacion(identificacion);

            return true;
        }else{
            return false;
        }
    }

    public Estudiante obtenerEstudiante(String identificacion) {
        Estudiante estudianteEncontrado =  null;
        for (Estudiante estudiante : getListaEstudiantes()) {
            if(estudiante.getIdentificacion().equalsIgnoreCase(identificacion)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        return estudianteEncontrado;
    }


    public boolean crearDocente(String nombre,
                                   int edad,
                                   String correo, String identificacion) {

        Docente docenteEncontrado = obtenerDocente(identificacion);
        if(docenteEncontrado == null) {
            Docente docente=new Docente();
            docente.setNombre(nombre);
            docente.setEdad(edad);
            docente.setCorreo(correo);
            docente.setIdentificacion(identificacion);
            getListaDocentes().add(docente);

            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarDocente(String idEliminar) {
        Docente docenteEncontrado = obtenerDocente(idEliminar);
        if(docenteEncontrado!=null) {
            getListaDocentes().remove(docenteEncontrado);
            return true;
        } else {
            return false;
        }
    }
    public boolean actualizarDocente(String nombre,
                                     int edad,
                                     String correo, String identificacion) {
        Docente docenteEncontrado = obtenerDocente(identificacion);
        if(docenteEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
            docenteEncontrado.setNombre(nombre);
            docenteEncontrado.setEdad(edad);
            docenteEncontrado.setCorreo(correo);
            docenteEncontrado.setIdentificacion(identificacion);

            return true;
        }else{
            return false;
        }
    }

    public Docente obtenerDocente(String identificacion) {
       Docente docenteEncontrado =  null;
        for (Docente docente : getListaDocentes()) {
            if(docente.getIdentificacion().equalsIgnoreCase(identificacion)) {
                docenteEncontrado = docente;
                break;
            }
        }

        return docenteEncontrado;
    }

    public boolean crearCurso(String nombre, String semestre, String grupo, double creditos, String jornada, String identificacion) {

        Curso cursoEncontrado = obtenerCurso(identificacion);
        if(cursoEncontrado == null) {
            Curso curso=new Curso();
            curso.setNombre(nombre);
            curso.setSemestre(semestre);
            curso.setGrupo(grupo);
            curso.setCreditos(creditos);
            curso.setJornada(jornada);
            curso.setIdentificacion(identificacion);
            getListaCursos().add(curso);

            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarCurso(String idEliminar) {
        Curso cursoEncontrado = obtenerCurso(idEliminar);
        if(cursoEncontrado!=null) {
            getListaCursos().remove(cursoEncontrado);
            return true;
        } else {
            return false;
        }
    }
    public boolean actualizarCurso(String nombre, String semestre, String grupo, double creditos, String jornada, String identificacion) {
        Curso cursoEncontrado = obtenerCurso(identificacion);
        if(cursoEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
            cursoEncontrado.setNombre(nombre);
            cursoEncontrado.setSemestre(semestre);
            cursoEncontrado.setGrupo(grupo);
            cursoEncontrado.setCreditos(creditos);
            cursoEncontrado.setJornada(jornada);
            cursoEncontrado.setIdentificacion(identificacion);

            return true;
        }else{
            return false;
        }
    }

    public Curso obtenerCurso(String identificacion) {
        Curso cursoEncontrado =  null;
        for (Curso curso : getListaCursos()) {
            if(curso.getIdentificacion().equalsIgnoreCase(identificacion)) {
                cursoEncontrado = curso;
                break;
            }
        }

        return cursoEncontrado;
    }

    public boolean crearRector(String nombre, String apellido, String identificacion) {

        if(this.rector == null) {
            Rector rector= new Rector();
            rector.setNombre(nombre);
            rector.setApellido(apellido);
            rector.setIdentificacion(identificacion);
            this.rector=rector;

            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarRector() {
        if(this.rector!=null) {
            this.rector=null;
            return true;
        } else {
            return false;
        }
    }
    public boolean actualizarRector(String nombre, String apellido, String identificacion) {

        if(this.rector!=null) {
            rector.setNombre(nombre);
            rector.setApellido(apellido);
            rector.setIdentificacion(identificacion);

            return true;
        }else{
            return false;
        }
    }

    public Rector obtenerRector() {
        return this.rector;
            }

    public boolean asociarCursoADocente(String idDocente, String idCurso) {
        Docente docente = obtenerDocente(idDocente);
        Curso curso = obtenerCurso(idCurso);

        if (docente != null && curso != null) {
            docente.agregarCurso(curso);
            curso.setDocenteAsociado(docente);
            return true;
        } else {
            return false;
        }
    }
    public void mostrarCursosDeDocente(String idDocente) {
        Docente docente = obtenerDocente(idDocente);

        if (docente != null) {
            System.out.println("\nCursos asociados al docente " + docente.getNombre() + ":");
            if (docente.getListaCursosAsociados().isEmpty()) {
                System.out.println("No tiene cursos asociados.");
            } else {
                for (Curso curso : docente.getListaCursosAsociados()) {
                    System.out.println("- " + curso.getNombre() + " (" + curso.getIdentificacion() + ")");
                }
            }
        } else {
            System.out.println("Docente no encontrado.");
        }
    }
    public boolean asociarEstudianteACurso(String idEstudiante, String idCurso) {
        Estudiante estudiante = obtenerEstudiante(idEstudiante);
        Curso curso = obtenerCurso(idCurso);

        if (estudiante != null && curso != null) {
            curso.agregarEstudiante(estudiante);
            return true;
        } else {
            return false;
        }
    }
    public void mostrarEstudiantesDeCurso(String idCurso) {
        Curso curso = obtenerCurso(idCurso);

        if (curso != null) {
            System.out.println("\nEstudiantes del curso " + curso.getNombre() + ":");
            if (curso.getListaEstudiantesAsociados().isEmpty()) {
                System.out.println("No hay estudiantes asociados.");
            } else {
                for (Estudiante estudiante : curso.getListaEstudiantesAsociados()) {
                    System.out.println("- " + estudiante.getNombre() + " (" + estudiante.getIdentificacion() + ")");
                }
            }
        } else {
            System.out.println("Curso no encontrado.");
        }
    }
    public void agregarDocente(Docente docente) {
        if (!listaDocentes.contains(docente)) {
            listaDocentes.add(docente);
            docente.setOwnedByUniversidad(this);
        }
    }

    public void agregarCurso(Curso curso) {
        if (!listaCursos.contains(curso)) {
            listaCursos.add(curso);
            curso.setOwnedByUniversidad(this);
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!listaEstudiantes.contains(estudiante)) {
            listaEstudiantes.add(estudiante);
            estudiante.setOwnedByUniversidad(this);
        }
    }
}


