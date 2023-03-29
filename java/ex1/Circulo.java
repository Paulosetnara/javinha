package ex1;


public class Circulo extends Figura{
    private double raio;
    private String cor;

    public Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return "\nCirculo:\n raio:" + this.getRaio() + "\n Cor:"+ this.getCor() +  "\n area:" + this.areaCirculo(this.getRaio());
    }
   
    public double areaCirculo(double raio){
        double area;
        area = raio * 3.14;
        return area;

    }


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
