public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.cadastrarPessoa("Jose", "(35)99931-5555", 5);
        agenda.cadastrarPessoa("Marcos", "(35)999999-9999", 1);
        agenda.imprimeAgenda();
        agenda.imprimePessoa(5);
        agenda.imprimePessoa(1);
    }
}
