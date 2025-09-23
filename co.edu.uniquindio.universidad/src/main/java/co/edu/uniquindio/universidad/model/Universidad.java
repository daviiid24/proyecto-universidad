package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Universidad {
    private ArrayList<Estudiante> listaEstudiantes= new ArrayList();
    private ArrayList<Curso> listaCursos= new ArrayList();
    private ArrayList<Docente> listaDocentes= new ArrayList();
    Private Rector rector;

    private String nombre;
    public Universidad(){}
    public Universidad(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
