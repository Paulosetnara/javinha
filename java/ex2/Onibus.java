

public class Onibus extends Veiculos{
    private Integer assentos;
    
    public Onibus (String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    public void exibirDados(){
        System.out.println("\nDados do Onibus:\n" + "Placa:" + this.getPlaca() + "\nano:" + this.getAno() + "\nAssentos:" + this.getAssentos());
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
}
