package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Docente extends Persona {

    private ArrayList<Curso> listaCursosAsociados;
    private Universidad ownedByUniversidad;

    public Docente() {
        this.listaCursosAsociados = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (!listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.add(curso);
            curso.setDocenteAsociado(this);

            if (this.ownedByUniversidad != null) {
                curso.setOwnedByUniversidad(this.ownedByUniversidad);
            }
        }
    }

    public void eliminarCurso(Curso curso) {
        if (listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.remove(curso);
            curso.setDocenteAsociado(null);
        }
    }

    public ArrayList<Curso> getListaCursosAsociados() {
        return listaCursosAsociados;
    }

    public void setListaCursosAsociados(ArrayList<Curso> listaCursosAsociados) {
        this.listaCursosAsociados = listaCursosAsociados;
    }

    public Universidad getOwnedByUniversidad() {
        return ownedByUniversidad;
    }

    public void setOwnedByUniversidad(Universidad ownedByUniversidad) {
        this.ownedByUniversidad = ownedByUniversidad;
    }

    public boolean verificarEdadEsPrimo(int edad) {
        if (edad < 2) return false;
        for (int i = 2; i <= Math.sqrt(edad); i++) {
            if (edad % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean verificarNombrePalindromo(String nombre) {
        String invertido = "";
        nombre = nombre.toLowerCase();
        for (int i = nombre.length() - 1; i >= 0; i--) {
            invertido = invertido + nombre.charAt(i);
        }
        return nombre.equals(invertido);
    }
}
