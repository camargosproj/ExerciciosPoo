package Banco;
public class Movimentacao {
    String descricao;
    double valor;
    public Operacao operacao;

    public Movimentacao(String descricao, double valor, Operacao operacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.operacao = operacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
   
    @Override
    public String toString() {
        return "Descricao da movimentacao: " + getDescricao() +  "\n Valor da movimentação:" + getValor();
    }
   
}
