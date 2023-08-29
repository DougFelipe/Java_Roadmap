
/*
Modificador de Acesso Padrão (sem modificador):
Se você não usar nenhum modificador, ele terá visibilidade de pacote por padrão. 
O membro será acessível dentro do mesmo pacote, mas não de fora dele.

Explicação:
Neste exemplo, temos uma classe 'DefaultModifierExample' com um atributo 'defaultData' 
e um método 'displayData', ambos sem modificador de acesso. Isso significa que ambos 
são visíveis apenas dentro do mesmo pacote.

NOTA: Este código não pode ser executado diretamente sem criar pacotes apropriados.
*/

// Suponha que isso esteja em um pacote chamado 'examples'
class DefaultModifierExample {
    String defaultData;

    void displayData() {
        System.out.println("Default Data: " + defaultData);
    }

    public static void main(String[] args) {
        DefaultModifierExample example = new DefaultModifierExample();
        example.defaultData = "This is default data.";
        example.displayData();
    }
}

