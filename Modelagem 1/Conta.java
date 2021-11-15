
public class Conta {
    private String propietario;
    private int numDaConta;
    
    public Conta(String propietario,int numDaConta) {
        this.numDaConta = numDaConta;
        this.propietario = propietario;

    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumDaConta() {
        return numDaConta;
    }

    public void setNumDaConta(int numDaConta) {
        this.numDaConta = numDaConta;
    }

    @Override
    public String toString() {
        return "Conta criada no nome de " + propietario + " com o número "+ numDaConta;
    }
  

}
