
/*
Uso de final com Atributos:
A palavra-chave final pode ser usada para criar atributos constantes, que só podem ser inicializados uma vez.

Explicação:
No exemplo abaixo, temos uma classe 'Constants' que possui dois atributos declarados como final - 'PI' e 'E'.
Estes atributos são inicializados apenas uma vez e seus valores não podem ser alterados.
*/

class FinalAttributesExample {
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    public static void main(String[] args) {
        System.out.println("Value of PI: " + PI);
        System.out.println("Value of E: " + E);
    }
}

