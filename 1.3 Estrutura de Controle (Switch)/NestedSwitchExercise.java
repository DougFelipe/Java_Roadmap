
/*
`switch` aninhados

Um `switch` pode ser aninhado dentro de outro `switch` ou dentro de um bloco `case`.

Neste exemplo, avaliamos uma combinação de tipo de animal e ação, e imprimimos uma mensagem com base nela.
*/
public class NestedSwitchExercise {
    public static void main(String[] args) {
        String animalType = "domestic";
        String action = "bark";
        
        switch (animalType) {
            case "wild":
                switch (action) {
                    case "roar":
                        System.out.println("It might be a lion or tiger!");
                        break;
                    default:
                        System.out.println("Unknown wild animal action.");
                        break;
                }
                break;
            case "domestic":
                switch (action) {
                    case "bark":
                        System.out.println("It's a dog!");
                        break;
                    case "meow":
                        System.out.println("It's a cat!");
                        break;
                    default:
                        System.out.println("Unknown domestic animal action.");
                        break;
                }
                break;
            default:
                System.out.println("Unknown animal type.");
                break;
        }
    }
}
