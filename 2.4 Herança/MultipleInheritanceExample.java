
/*
Herança Múltipla e Interfaces:
Java não suporta herança múltipla com classes devido à ambiguidade. No entanto, uma classe pode implementar várias interfaces, 
o que é uma forma de herança múltipla.

Explicação:
Neste exemplo, a classe 'Smartphone' implementa duas interfaces: 'Phone' e 'Camera'. Isso demonstra a herança múltipla 
através de interfaces em Java.
*/

interface Phone {
    void makeCall(String number);
    void receiveCall();
}

interface Camera {
    void clickPhoto();
    void recordVideo();
}

class MultipleInheritanceExample implements Phone, Camera {
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    public void clickPhoto() {
        System.out.println("Clicking a photo...");
    }

    public void recordVideo() {
        System.out.println("Recording a video...");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample smartphone = new MultipleInheritanceExample();
        smartphone.makeCall("1234567890");
        smartphone.clickPhoto();
    }
}

