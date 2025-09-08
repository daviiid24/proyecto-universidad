package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.*;

public class Main {
    public static void main(String[] args) {
        Docente docente= new Docente("Fred", 24, "fiewhjfi");
        double nota1=3.0;
        double nota2=4.0;
        double nota3=5.0;
        double definitiva=docente.calcularDefinitivaEstudiante(nota1, nota2, nota3);
        System.out.println("Definitiva: "+definitiva);

        double definitiva1=5.0;
        double definitiva2=5.0;
        double definitiva3=5.0;
        double calcularPromedioCurso=docente.calcularPromedioCurso(definitiva1, definitiva2, definitiva3);
        System.out.println("Promedio curso: "+calcularPromedioCurso);

        int edad1=17;
        int edad2=17;
        int edad3=17;
        int calcularPromedioEdad=docente.calcularPromedioEdad(edad1, edad2, edad3);
        System.out.println("Promedio edad: "+calcularPromedioEdad);

        double nota1e1=5.0;
        double nota1e2=4.5;
        double nota1e3=5.0;
        double calcularPromedioNota1=docente.calcularPromedioNota1(nota1e1, nota1e2, nota1e3);
        System.out.println("Promedio nota1: "+ calcularPromedioNota1);

        double nota1Mayor =4.5;
        double nota2Mayor =5.0;
        double nota3Mayor =3.9;
        double calcularNotaMayorCurso=docente.calcularNotaMayorCurso(nota1Mayor, nota2Mayor, nota3Mayor);
        System.out.println("La nota mayor del curso es: " + calcularNotaMayorCurso);

        double nota1Menor=4.5;
        double nota2Menor=5.0;
        double nota3Menor=3.9;
        double calcularNotaMenorCurso=docente.calcularNotaMenorCurso(nota1Menor, nota2Menor, nota3Menor);
        System.out.println("La nota menor del curso es: " + calcularNotaMenorCurso);
    }
}