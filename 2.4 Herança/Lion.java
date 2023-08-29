
/*
Herança e Construtores:
Os construtores não são herdados, mas a subclasse pode chamar o construtor da superclasse usando a palavra-chave `super`.

Explicação:
Neste exemplo, a superclasse 'Animal' possui um construtor que aceita um nome. A subclasse 'Lion' 
usa a palavra-chave `super` para chamar o construtor da superclasse e inicializar o atributo 'name'.
*/

class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
}

class Lion extends Animal {
    String maneColor;

    Lion(String name, String maneColor) {
        super(name);  // Call superclass constructor
        this.maneColor = maneColor;
    }
    
    void roar() {
        System.out.println(name + " with " + maneColor + " mane roars!");
    }

    public static void main(String[] args) {
        Lion lion = new Lion("Leo", "golden");
        lion.roar();
    }
}

