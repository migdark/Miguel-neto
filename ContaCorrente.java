public class ContaCorrente {
    
    int agencia,saques;
    String senha,cpf,tipoDaConta;
    boolean ativa;
    double saldo;

    void depositar(double valor){
        saldo = saldo + valor;  
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    void showSaldo(){
        System.out.println("Novo saldo: "+this.saldo+"");
    }

}
