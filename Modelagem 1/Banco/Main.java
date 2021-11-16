package Banco;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Banco myBank = new Banco();
        System.out.println(myBank.criarConta("Marcos",1));
        System.out.println(myBank.criarConta("jose",2));
        System.out.println(myBank.criarConta("Maia",3));
        myBank.excluirConta(3);

        System.out.println(myBank.getContas());


    }
}