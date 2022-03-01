/* Hu Alberto - 1279840*/
import java.util.Scanner;

public class Estudiante{
    private String nombreAlumno;
    private String matricula;
    private String materia;
    private float calificacion;
    private String estadoAlumno;

    public Estudiante() {
        this.matricula = "";
        this.nombreAlumno = "";
        this.materia = "";
        this.calificacion = 0;
        this.estadoAlumno = "";
    }

    public Estudiante(String matricula, String nombreAlumno, String materia, float calificacion) {
        this.matricula = matricula;
        this.nombreAlumno = nombreAlumno;
        this.materia = materia;
        this.calificacion = calificacion;
        this.estadoAlumno = this.estadoAlumno(calificacion);
    }

    public void asignarNombre(Scanner scn){

        System.out.println("Matricula del Alumno: ");
        this.matricula = scn.next();

        System.out.println("Nombre del Alumno: ");
        this.nombreAlumno = scn.next();

        System.out.println("Materia: ");
        this.materia = scn.next();

        System.out.println("Calificacion del Alumno: ");
        this.calificacion = scn.nextFloat();

        this.setEstadoAlumno(this.calificacion);
    }

    public String estadoAlumno(float calificación) {
        return(calificacion >= 60 ? "Aprobado" : "Reprobado");
    }

    public void setEstadoAlumno(float calificacion){
        if(calificacion > 59) {
            this.estadoAlumno = "Aprobado";
        }
        else {
            this.estadoAlumno = "Reprobado";
        }
    }

    public String getEstadoAlumno(){
        return estadoAlumno;
    }

    public String getNombreAlumno(){
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public float getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    public String toString() {
        return "Matricula del Alumno: " + matricula + ", \nNombre del Alumno: " + nombreAlumno +
                ", \nMateria: " + materia + ", \nCalificacion: " + calificacion + ", \nEstado: " + estadoAlumno + "}\n";
    }


}

