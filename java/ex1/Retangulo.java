package ex1;

public class Retangulo extends Figura{
   private double lado1, lado2;
   private String cor;


public Retangulo(double lado1, double lado2, String cor){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.cor = cor;
}

@Override 
public String toString() {
    return "\nRetangulo:\n lado1: " + this.getLado1() + "\n Cor:"+ this.getCor() +  "\n lado2: " + this.getLado2() + "\n area:" + this.areaRetangulo(this.getLado1(), this.getLado2());
}

public double areaRetangulo(double lado1, double lado2){
    double area;
    area = lado1 * lado2;
    return area;
}




public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public double getLado1() {
    return lado1;
}

public void setLado1(double lado1) {
    this.lado1 = lado1;
}

public double getLado2() {
    return lado2;
}

public void setLado2(double lado2) {
    this.lado2 = lado2;
}

}

