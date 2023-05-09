class Banco {
    private String nomCliente;
    private String nomBanco;
    private double valorCheque;
    private double commBanco;
    public Banco(){

    }
    public Banco(String nomCliente,String nomBanco,double valorCheque){
        this.nomCliente=nomCliente;
        this.nomBanco=nomBanco;
        this.valorCheque=valorCheque;
    }
    //  SETS

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    // GETS

    public String getNomCliente() {
        return nomCliente;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getCommBanco() {
        return commBanco;
    }
    //CALCULAR VALOR COMISION

    public void calcularcommBanco(){
        this.commBanco=(this.getValorCheque()*0.003);
        this.commBanco=commBanco;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nomCliente='" + nomCliente + '\'' +
                ", nomBanco='" + nomBanco + '\'' +
                ", valorCheque=" + valorCheque +
                ", commBanco=" + commBanco +
                '}';
    }
}





public class Main {
    public static void main(String[] args) {
        Banco banco1=new Banco();
        Banco banco2=new Banco("RICHARD FEIJOO","BANCO DE LOJA",340000);
        banco2.calcularcommBanco();
        System.out.println(banco2);
    }
}