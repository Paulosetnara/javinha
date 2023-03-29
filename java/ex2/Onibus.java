

public class Onibus extends Veiculos{
    private Integer assentos;
    
    public Onibus (String placa, int ano, int assentos){
        super(placa, ano);
        setAssentos(assentos);
    }

    public void exibirDados(){
        System.out.println("\nDados do Onibus:\n" + "Placa:\n" + this.getPlaca() + "ano:\n" + this.getAno() + "Assentos:\n" + this.getAssentos());
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }
}
