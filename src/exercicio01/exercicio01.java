package exercicio01;

public class exercicio01 {
    public static void main(String[] args) {
    Caneta canetinha = new Caneta("azul", "azul", 3.50);
     Caneta canetinha2 = new Caneta("vermelha", "preta", 3.50);
     Caneta canetinha3 = new Caneta("verde", "vermelha", 3.50);

     canetinha.escrever();
     canetinha2.pintar();
     canetinha3.escrever();
     canetinha3.pintar();
    }
}
