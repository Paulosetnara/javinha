package ex1;


public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
        
    }
    @Override
    public String toString() {
        return "\nQuadrado:\n lado1:" + this.getLado1() + "\n Cor:"+ this.getCor() +  "\n lado2:" + this.getLado2()+ "\n area:" + this.areaRetangulo(getLado1(), getLado2());
    }
}
