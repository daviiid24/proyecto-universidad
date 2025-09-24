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

    }
}
