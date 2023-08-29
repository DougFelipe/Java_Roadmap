
/*
Hierarquia de Herança:
É possível ter uma cadeia de classes que herdam umas das outras, formando uma hierarquia de herança.

Explicação:
Neste exemplo, temos uma hierarquia de herança de três níveis: 'Creature' -> 'Mammal' -> 'Human'.
A classe 'Human' herda da classe 'Mammal', que por sua vez herda da classe 'Creature'.
*/

class Creature {
    void breathe() {
        System.out.println("Creature breathes");
    }
}

class Mammal extends Creature {
    void giveBirth() {
        System.out.println("Mammal gives birth to live young ones");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("Human thinks and makes decisions");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.breathe();  // Inherited from Creature
        human.giveBirth();  // Inherited from Mammal
        human.think();  // Method of Human
    }
}

