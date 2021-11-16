package Banco;
import java.util.LinkedList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new LinkedList<Conta>();

    public Banco() {
        super();
    }

    public Conta criarConta(String nome, int num){
        Conta conta = new Conta(nome, num);
        contas.add(conta);
        return conta; 
    }
    public void excluirConta(int numeroConta){
        for (Conta conta : contas) {
            if(conta.getNumDaConta() == numeroConta){
                contas.remove(conta);
            }
            
        }
    }



    public List<Conta> getContas() {
        return contas;
    }

}
