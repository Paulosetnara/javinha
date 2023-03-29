package ex1;

public class Triangulo extends Figura{
   private double base, altura;
   private String cor;


public Triangulo(double base, double altura, String cor){
    this.base = base;
    this.altura = altura;
    this.cor = cor;
}
@Override 
public String toString() {
    return "\nTriangulo:\n base: " + this.getBase() + "\n Cor:"+ this.getCor() +  "\n altura: " + this.getAltura() + "\n area:"+ this.areaTriangulo(this.getBase(), this.getAltura());
}

public double areaTriangulo(double base, double altura){
    double area;
    area = (base * altura)/2;
    return area;
}



public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
public double getBase() {
    return base;
}
public void setBase(double base) {
    this.base = base;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}


}


