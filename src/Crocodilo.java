public class Crocodilo extends Animal {
    public Crocodilo(int forca, int velocidade, int inteligencia) {
        super("Crocodilo", forca, velocidade, inteligencia);
    }

    @Override
    public void display() {
        System.out.println("Crocodilo [Força: " + forca + ", Velocidade: " + velocidade + ", Inteligência: " + inteligencia + "]");
    }
}