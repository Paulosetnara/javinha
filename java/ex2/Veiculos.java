
public class Veiculos {
    private String placa;
    private Integer ano;
   
   public Veiculos(){}

   public Veiculos(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
   }

   public void exibirDados(){
        System.out.println("\nDados do Veiculos:\n" + "Placa:\n" + this.getPlaca() + "ano:\n" + this.getAno());
   }
   
   
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
