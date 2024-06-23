public class Cachorro extends Animal {
    public Cachorro(int forca, int velocidade, int inteligencia) {
        super("Cachorro", forca, velocidade, inteligencia);
    }

    @Override
    public void display() {
        System.out.println("Cachorro [Força: " + forca + ", Velocidade: " + velocidade + ", Inteligência: " + inteligencia + "]");
    }
}