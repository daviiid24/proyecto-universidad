package co.edu.uniquindio.universidad.model;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;
    private String identificacion;
    private Universidad ownedByUniversidad;

    public Docente(){}

    public Docente(String nombre, int edad, String correo, String identificacion) {
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
        this.identificacion=identificacion;
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
    public String obtenerEstudianteNotasMayor4(
            double n1est1, double n2est1, double n3est1,
            double n1est2, double n2est2, double n3est2,
            double n1est3, double n2est3, double n3est3) {

        if(n1est1 >=4 && n2est1 >=4 && n3est1 >=4) return "Estudiante 1";
        if(n1est2 >=4 && n2est2 >=4 && n3est2 >=4) return "Estudiante 2";
        if(n1est3 >=4 && n2est3 >=4 && n3est3 >=4) return "Estudiante 3";
        return "Ninguno";
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


