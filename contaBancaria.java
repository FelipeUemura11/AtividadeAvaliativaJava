class contaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public contaBancaria() {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado com sucesso! Novo saldo: "+ this.saldo);
    }

    public void saque(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("O saque foi feito com sucesso! Novo saldo: "+ this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consulta() {
        System.out.println("Consulta da conta: "+this.saldo);
    }
}

