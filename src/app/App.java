package src.app;

import src.pacote1.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Conta c1 = new Conta();
        c1.titular = "Pedro";
        c1.saldo = 100.0;
        c1.numConta = 1001;
        c1.dataAbertura = "07/02/2021";
        c1.agencia = "10001-0";

        c1.saca(30.0);
        c1.deposita(20.0);
        c1.calculaRendimento();
        System.out.println("Novo saldo = " + c1.saldo + "R$");

        System.out.println(c1.impressao());
    }
}
