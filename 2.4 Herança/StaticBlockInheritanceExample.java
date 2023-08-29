
/*
Bloco de Inicialização `static` e Herança:
Em uma hierarquia de classes, os blocos de inicialização `static` são chamados na ordem em que as classes são carregadas na memória.

Explicação:
Neste exemplo, temos uma superclasse 'Parent' e uma subclasse 'Child'. Ambas as classes possuem blocos de inicialização `static`. 
Quando criamos uma instância da subclasse 'Child', os blocos de inicialização `static` são chamados na ordem em que as classes são carregadas.
*/

class Parent {
    static {
        System.out.println("Static block of Parent");
    }
}

class StaticBlockInheritanceExample extends Parent {
    static {
        System.out.println("Static block of Child");
    }

    public static void main(String[] args) {
        System.out.println("Main method of Child");
        StaticBlockInheritanceExample child = new StaticBlockInheritanceExample();
    }
}

