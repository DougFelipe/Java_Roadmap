
/*
Benefícios do Encapsulamento:
O encapsulamento ajuda a proteger a integridade dos dados, evitando acesso direto a eles 
e permitindo que sejam acessados apenas através de métodos.

Explicação:
No exemplo abaixo, temos a classe 'BankAccount' que encapsula os atributos 'balance' e 'accountNumber'.
Usando métodos públicos, podemos garantir que as operações realizadas nos atributos sejam válidas, 
como não permitir saques superiores ao saldo disponível.
*/

class EncapsulationBenefits {
    private double balance;
    private String accountNumber;

    public EncapsulationBenefits(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        EncapsulationBenefits account = new EncapsulationBenefits("123456", 1000);
        account.deposit(200);
        account.withdraw(50);
        System.out.println("Balance: $" + account.getBalance());
    }
}

