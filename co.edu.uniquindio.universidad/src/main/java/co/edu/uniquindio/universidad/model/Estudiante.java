package co.edu.uniquindio.universidad.model;

public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;
    private double nota1;
    private double nota2;
    private double nota3;
    private Universidad ownedByUniversidad;

    public Estudiante(){}

    public Estudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
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
    public double calcularNotaDefinitiva(double nota1, double nota2, double nota3) {
        double definitiva=0;
        definitiva=(nota1+nota2+nota3)/3;
        return definitiva;
    }
}
