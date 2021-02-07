package src.pacote1;

public class Conta {

    public String titular;
    public double saldo;
    public int numConta;
    public String agencia;
    public String dataAbertura;

    public void saca(double valor){
        saldo -= valor;
        System.out.println("Novo saldo = " + saldo + "R$");
    }
    public void deposita(double valor){
        saldo += valor;
        System.out.println("Novo saldo = " + saldo + "R$");
    }
    public double calculaRendimento(){
        saldo = saldo*1.05;
        return saldo;
    }

    public String impressao(){  
        String dados = "Titular: " + titular;
        dados += "\nNumero da conta: " + numConta;
        dados += "\nSaldo na conta: " + saldo;
        dados += "\nNumero da agencia: " + agencia;
        dados += "\nData de abertura: " + dataAbertura;

        return dados;
    }


}
