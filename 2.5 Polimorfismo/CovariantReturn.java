
/*
Covariância de Retorno:
Permite que um método em uma subclasse tenha um tipo de retorno diferente do método na superclasse.

Explicação:
Neste exemplo, temos uma superclasse 'SuperClass' e uma subclasse 'SubClass'. O método 'getObject' na subclasse retorna 
um tipo diferente do método na superclasse.
*/

class SuperClass {
    SuperClass getObject() {
        System.out.println("Object from SuperClass");
        return new SuperClass();
    }
}

class SubClass extends SuperClass {
    @Override
    SubClass getObject() {
        System.out.println("Object from SubClass");
        return new SubClass();
    }
}

public class CovariantReturn {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();

        superClass.getObject();
        subClass.getObject();
    }
}

