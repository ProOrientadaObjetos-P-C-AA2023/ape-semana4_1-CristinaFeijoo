class Profesores{
    private String nombreProfe;
    private String apellidosProfe;
    private double sueldoBasico;
    private double sueldoTotal;
    private int numCedula;

    public Profesores(){

    }
    public Profesores(String nombreProfe,String apellidosProfe,double sueldoBasico,int numCedula){
        this.apellidosProfe=apellidosProfe;
        this.nombreProfe=nombreProfe;
        this.sueldoBasico=sueldoBasico;
        this.numCedula=numCedula;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public String getApellidosProfe() {
        return apellidosProfe;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    public void setApellidosProfe(String apellidosProfe) {
        this.apellidosProfe = apellidosProfe;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico*1.20;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombreProfe='" + nombreProfe + '\'' +
                ", apellidosProfe='" + apellidosProfe + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", sueldoTotal=" + sueldoTotal +
                ", numCedula=" + numCedula +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Profesores profesor1 = new Profesores();
        Profesores profesor2 = new Profesores("Kayn", "Shieda", 0.50, 50);
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2);
    }
}