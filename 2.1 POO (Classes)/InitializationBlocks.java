
/*
Blocos de Inicialização:
São blocos de código que são executados quando uma instância da classe é criada. 
Eles são executados antes dos construtores.

Explicação:
No exemplo abaixo, temos um bloco de inicialização que é executado antes do construtor 
da classe 'InitializationBlocks'.
*/

public class InitializationBlocks {

    int value;

    // Bloco de inicialização
    {
        System.out.println("Initialization block executed");
        value = 10;
    }

    InitializationBlocks() {
        System.out.println("Constructor executed");
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        InitializationBlocks example = new InitializationBlocks();
    }
}
