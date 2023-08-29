
/*
Palavra-chave 'final':
A palavra-chave 'final' é usada para indicar que algo não pode ser alterado. 
Pode ser aplicada a variáveis, métodos e classes. Uma variável 'final' não pode 
ser modificada, um método 'final' não pode ser sobrescrito e uma classe 'final' 
não pode ser estendida.

Explicação:
No exemplo abaixo, temos uma classe 'FinalExample' com um atributo 'final' chamado 'MAX_VALUE'. 
Uma vez que 'MAX_VALUE' é inicializado, não pode ser modificado.
*/

public class FinalKeyword {
    final int MAX_VALUE = 100;

    public void display() {
        System.out.println("Max Value: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalKeyword example = new FinalKeyword();
        example.display();
    }
}
