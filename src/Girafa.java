public class Girafa extends Animal {
    public Girafa(int forca, int velocidade, int inteligencia) {
        super("Girafa", forca, velocidade, inteligencia);
    }

    @Override
    public void display() {
        System.out.println("Girafa [Força: " + forca + ", Velocidade: " + velocidade + ", Inteligência: " + inteligencia + "]");
    }
}