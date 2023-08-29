
/*
Modificador public:
O modificador public oferece visibilidade completa. Membros declarados como public são 
acessíveis de qualquer outra classe.

Explicação:
No exemplo abaixo, temos a classe 'PublicModifierExample' com um atributo 'publicData' e 
um método 'displayData'. Ambos são declarados como public e, portanto, podem ser acessados 
diretamente de qualquer outra classe ou pacote.
*/

public class PublicModifierExample {
    public String publicData;

    public void displayData() {
        System.out.println("Public Data: " + publicData);
    }

    public static void main(String[] args) {
        PublicModifierExample example = new PublicModifierExample();
        example.publicData = "This is public data.";
        example.displayData();
    }
}

