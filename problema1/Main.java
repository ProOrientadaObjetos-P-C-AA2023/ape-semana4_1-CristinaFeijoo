class Estudiante{
    private String nombreEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    public Estudiante(){

    }

    public Estudiante(String nombreEstudiante, double nota1, double nota2, double nota3){
        this.nombreEstudiante=nombreEstudiante;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }
    public void calcularPromedio(){
        this.promedio=(this.getNota1()+this.getNota2()+this.getNota3()+3);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante();
        Estudiante estudiante1=new Estudiante("Leona",10,9.8,7.9);
        estudiante1.calcularPromedio();
        System.out.println("Hello world!");
    }
}