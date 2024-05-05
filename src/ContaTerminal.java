public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setAgencia(String novoAgencia) {
        this.agencia = novoAgencia;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void setNomeCliente(String novoNomeCliente) {
        this.nomeCliente = novoNomeCliente;
    }
}
