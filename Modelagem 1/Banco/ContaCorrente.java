package Banco;
public class ContaCorrente {
    private int numeroConta;
    private double saldo;
    private Boolean isSpecial;
    private double limite;

    public ContaCorrente() {
        super();
    }
    //#region
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Boolean isSpecial() {
        return isSpecial;
    }
    public void setStatus(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    //#endregion

    public double depositar(double quantidade){
        if (quantidade > 0){
            this.limite += quantidade;
            return quantidade;
        }
        return 0;
    }
    public double sacar(double quantidade){
        if (quantidade <= this.limite ){
            this.limite = this.limite - quantidade;
            return quantidade;
        }
        return 0;
    }
}
