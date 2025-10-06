package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    private ArrayList<Curso> listaCursosAsociados;
    private Universidad ownedByUniversidad;

    public Estudiante() {
        this.listaCursosAsociados = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (!listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.add(curso);

            if (!curso.getListaEstudiantesAsociados().contains(this)) {
                curso.getListaEstudiantesAsociados().add(this);
            }

            if (this.ownedByUniversidad != null) {
                curso.setOwnedByUniversidad(this.ownedByUniversidad);
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

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public Universidad getOwnedByUniversidad() {
        return ownedByUniversidad;
    }

    public void setOwnedByUniversidad(Universidad ownedByUniversidad) {
        this.ownedByUniversidad = ownedByUniversidad;
    }
}
