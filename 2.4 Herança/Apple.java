
/*
Uso da palavra-chave `extends`:
Em Java, a herança é implementada usando a palavra-chave `extends`. A subclasse `extends` a superclasse.

Explicação:
Neste exemplo, temos a superclasse 'Fruit' e a subclasse 'Apple'. A classe 'Apple' herda a superclasse 'Fruit' 
usando a palavra-chave `extends`. Isso significa que 'Apple' herda todos os métodos e atributos (exceto os privados) 
de 'Fruit'.
*/

class Fruit {
    void taste() {
        System.out.println("Fruit has its own taste");
    }
}

class Apple extends Fruit {
    void taste() {
        System.out.println("Apple is sweet");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.taste();
    }
}

