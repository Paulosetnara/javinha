
import java.util.Scanner;

public class Pessoa {
    Scanner read = new Scanner(System.in);

    private String nome;
    private String numero;
    private int ID;

    public Pessoa(String nome, String numero, int ID) {
        this.nome = nome;
        this.numero = numero;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}