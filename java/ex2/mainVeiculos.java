import java.util.ArrayList;
import java.util.List;


public class mainVeiculos {
    
    public static void main(String[] args){
        
        Caminhoes C1 = new Caminhoes("OOO12", 2012, 3);
        Caminhoes C2 = new Caminhoes("XXX34", 2004, 2);
        Caminhoes C3 = new Caminhoes("ZZZ56", 2010, 1);
        Onibus O1 = new Onibus("BUS12", 2004, 20);
        Onibus O2 = new Onibus("ONI34", 2008, 25);
        Onibus O3 = new Onibus("ABC56", 2012, 40);

        List<Veiculos> veiculos = new ArrayList<Veiculos>();
        veiculos.add(C1);
        veiculos.add(C2);
        veiculos.add(C3);
        veiculos.add(O1);
        veiculos.add(O2);
        veiculos.add(O3);

        for(Veiculos veiculo: veiculos){
            veiculo.exibirDados();
        }

    }
}
