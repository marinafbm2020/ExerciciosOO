package exercicio01;

public class Caneta {
    private String cor;
    private String tampa;
    private double valor;

    public Caneta(){

    }

    public Caneta (String cor, String tampa, double valor){
        this.cor = cor;
        this.tampa = tampa;
        this.valor = valor;
    }

    public void escrever(){
        System.out.println("Caneta Escrevendo");
    }

    public void pintar(){
        System.out.println("pintando");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTampa() {
        return tampa;
    }

    public void setTampa(String tampa) {
        this.tampa = tampa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
