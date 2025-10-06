package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String identificacion;
    private double nota1;
    private double nota2;
    private double nota3;
    private ArrayList<Curso> listaCursosAsociados;
    private Universidad ownedByUniversidad;

    public Estudiante() {
    }

    public void agregarCurso(Curso curso) {
        if (!listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.add(curso);
            if (!curso.getListaEstudiantesAsociados().contains(this)) {
                curso.getListaEstudiantesAsociados().add(this);
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.remove(curso);
            curso.getListaEstudiantesAsociados().remove(this);
        }
    }

    public ArrayList<Curso> getListaCursosAsociados() {
        return listaCursosAsociados;
    }

    public void setListaCursosAsociados(ArrayList<Curso> listaCursosAsociados) {
        this.listaCursosAsociados = listaCursosAsociados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Universidad getOwnedByUniversidad() {
        return ownedByUniversidad;
    }

    public void setOwnedByUniversidad(Universidad ownedByUniversidad) {
        this.ownedByUniversidad = ownedByUniversidad;
    }
}
