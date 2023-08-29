
/*
Sobrescrita de Métodos e Exceções:
Regras para sobrescrita de métodos quando as exceções estão envolvidas.

Explicação:
Neste exemplo, temos uma superclasse 'BaseClass' e uma subclasse 'DerivedClass'. Ambas as classes têm um método 'show'. 
A subclasse sobrescreve o método 'show' e adiciona uma cláusula 'throws'.
*/

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class BaseClass {
    void show() {
        System.out.println("Base class method.");
    }
}

class DerivedClassWithException extends BaseClass {
    // Note: This will result in a compilation error because the overridden method does not throw an exception in the superclass.
    // void show() throws CustomException {
    //     System.out.println("Derived class method with exception.");
    //     throw new CustomException("Custom Exception occurred.");
    // }
}

public class MethodOverridingAndExceptions {
    public static void main(String[] args) {
        BaseClass base = new DerivedClassWithException();
        base.show();
    }
}

