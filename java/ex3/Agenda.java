
import java.util.Scanner;

public class Agenda {
    Scanner read = new Scanner(System.in);

    Pessoa[] agenda = new Pessoa[10];
    

    public void cadastrarPessoa(String nome, String numero, int ID){
        agenda[ID-1] = new Pessoa(nome, numero, ID);
    }


    public void imprimePessoa(int ID){
        ID -= 1;
	System.out.println("Dados do cadastrado: ");
        System.out.println("Nome: " + agenda[ID].getNome());
        System.out.println("Número: " + agenda[ID].getNumero());
        System.out.println("ID: " + agenda[ID].getID());
    }

    public void removePessoa(int ID){
        ID -= 1;
        agenda[ID] = null;
    }

    public void imprimeAgenda(){
        System.out.println("Dados dos cadastrados: ");
        for(int x = 0;x < 10;x++){
            if(agenda[x] != null){
                System.out.println("Nome: " + agenda[x].getNome());
                System.out.println("Número: " + agenda[x].getNumero());
                System.out.println("ID: " + agenda[x].getID());
            }
        }
    }
}