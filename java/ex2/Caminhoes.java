
public class Caminhoes extends Veiculos {
    private Integer eixos;

    public Caminhoes (String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    public void exibirDados(){
        System.out.println("\nDados do Caminhoes:" + "\nPlaca:" + this.getPlaca() + "\nano:" + this.getAno() + "\nEixos:" + this.getEixos());
    }
    
    public Integer getEixos() {
        return eixos;
    }

    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }
}
