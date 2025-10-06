package co.edu.uniquindio.universidad.model;

import java.util.ArrayList;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;
    private String identificacion;
    private ArrayList<Curso> listaCursosAsociados;
    private Universidad ownedByUniversidad;

    public Docente(){
        this.listaCursosAsociados = new ArrayList<>();
    }

    public Docente(String nombre, int edad, String correo, String identificacion) {
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
        this.identificacion=identificacion;
        this.listaCursosAsociados = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        if(!listaCursosAsociados.contains(curso)) {
            listaCursosAsociados.add(curso);
            curso.setDocenteAsociado(this);
        } if (this.ownedByUniversidad != null) {
            curso.setOwnedByUniversidad(this.ownedByUniversidad);
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

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo=correo;
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

    public boolean verificarEdadEsPrimo(int edad) {
        for (int i = 2; i <= Math.sqrt(edad); i++) {
            if (edad % i == 0) {
                return false;
            }
        }
        return true;

    }
    public boolean verificarNombrePalindromo(String nombre) {
        String invertido="";
        nombre = nombre.toLowerCase();
        for(int i=nombre.length()-1; i>=0; i--){
            invertido= invertido + nombre.charAt(i);
        }
        if (nombre.equals(invertido)) {
            return true;
        } else {
            return false;
        }
    }
}


