
/*
Métodos `final` e Polimorfismo:
Métodos marcados como `final` não podem ser sobrescritos, o que significa que o polimorfismo não se aplica a eles.

Explicação:
Neste exemplo, temos uma superclasse 'Base' que tem um método 'show' marcado como `final`. A subclasse 'Derived' 
não pode sobrescrever esse método.
*/

class Base {
    final void show() {
        System.out.println("Final method of Base class");
    }
}

class Derived extends Base {
    // The following code will result in a compilation error:
    // void show() {
    //     System.out.println("Method of Derived class");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Base base = new Derived();
        base.show();
    }
}

