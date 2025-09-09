package co.edu.uniquindio.universidad.model;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;

    public Docente(String nombre, int edad, String correo) {
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
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
    public double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3) / 3;
    }
    public double calcularPromedioCurso(double definitiva1, double definitiva2, double definitiva3){
        return (definitiva1+definitiva2+definitiva3) / 3;
    }
    public int calcularPromedioEdad(int edad1, int edad2, int edad3){
        return (edad1+edad2+edad3) / 3;
    }
    public double calcularPromedioNota1(double nota1e1, double nota1e2, double nota1e3){
        return (nota1e1+nota1e2+nota1e3) /3;
    }
    public double calcularNotaMayorCurso(double nota1Mayor, double nota2Mayor, double nota3Mayor){
        double mayor=0;
            if(nota1Mayor > nota2Mayor && nota1Mayor > nota3Mayor) {
                mayor= nota1Mayor;
            } else if(nota2Mayor > nota1Mayor && nota2Mayor > nota3Mayor) {
                mayor= nota2Mayor;
            } else {
                mayor= nota3Mayor;
            }
        return mayor;
    }
    public double calcularNotaMenorCurso(double nota1Menor, double nota2Menor, double nota3Menor){
        double menor=0;
            if(nota1Menor<nota2Menor && nota1Menor<nota3Menor) {
                menor=nota1Menor;
            } else if (nota2Menor<nota1Menor && nota2Menor<nota3Menor) {
                menor=nota2Menor;
            } else {
                menor=nota3Menor;
            }
        return menor;
    }
    public String aprobacionCurso(double definitiva1, double definitiva2, double definitiva3) {
        String mensaje="";
        if(definitiva1>=3.0) {
            mensaje+="Estudiante 1 aprobo el curso\n";
        }
        if (definitiva2>=3.0) {
            mensaje+="Estudiante 2 aprobo el curso\n";
        }
        if(definitiva3>=3.0) {
            mensaje+="Estudiante 3 aprobo el curso\n";
        }
        return mensaje;
    }
    public double calcularPorcentajeAprobados(double definitiva1, double definitiva2, double definitiva3) {
        double porcentaje=0;
        if(definitiva1>=3.0) {
            porcentaje+=1;
        } if (definitiva2>=3.0) {
            porcentaje+=1;
        } if (definitiva3>=3.0) {
            porcentaje+=1;
        }
        porcentaje=(porcentaje/3)*100;
        return porcentaje;
    }
    public double calcularPorcentajeReprobados(double definitiva1, double definitiva2, double definitiva3) {
        double porcentaje=0;
        if(definitiva1<3.0) {
            porcentaje+=1;
        } if(definitiva2<3.0) {
            porcentaje+=1;
        } if (definitiva3<3.0) {
            porcentaje+=1;
        }
        porcentaje=(porcentaje/3)*100;
        return porcentaje;
    }
    public String obtenerEstudianteNotasMayor4(double estudiante1[], double estudiante2[], double estudiante3[]) {
        String mensaje="";

        int comprobar=0;
            for (int i = 0; i < estudiante1.length; i++) {
                if (estudiante1[i] >= 4.0) {
                    comprobar++;
                }
            }
            if(comprobar==estudiante1.length) {
                mensaje += "El estudiante 1 tiene todas las notas mayores o iguales a 4 \n";
            }
        int comprobar1=0;
            for (int i = 0; i < estudiante2.length; i++) {
                if (estudiante2[i] >= 4.0) {
                    comprobar1++;
                }
            }
        if(comprobar1==estudiante2.length) {
            mensaje += "El estudiante 2 tiene todas las notas mayores o iguales a 4 \n";
        }
        int comprobar3 =0;
            for (int i = 0; i < estudiante3.length; i++) {
                if (estudiante3[i] >= 4.0) {
                    comprobar3++;
                }
            }
        if(comprobar3==estudiante3.length) {
            mensaje += "El estudiante 3 tiene todas las notas mayores o iguales a 4 \n";
        }
        return mensaje;
    }
    public double obtenerNotaMaxima(double definitiva1, double definitiva2, double definitiva3) {
        if(definitiva1>definitiva2 && definitiva1>definitiva3) {
            return definitiva1;
        } else if (definitiva2>definitiva1 && definitiva2>definitiva3) {
            return definitiva2;
        } else {
            return definitiva3;
        }
    }
}
