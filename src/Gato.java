public class Gato extends Animal {
    public Gato(int forca, int velocidade, int inteligencia) {
        super("Gato", forca, velocidade, inteligencia);
    }

    @Override
    public void display() {
        System.out.println("Gato [Força: " + forca + ", Velocidade: " + velocidade + ", Inteligência: " + inteligencia + "]");
    }
}

