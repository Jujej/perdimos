import java.util.Random;

public class Batalha {
    private Random random = new Random();

    public Animal lutar(Animal animal1, Animal animal2, String atributo) {
        int valor1 = 0;
        int valor2 = 0;
//testando
        switch (atributo.toLowerCase()) {
            case "forca":
                valor1 = animal1.getForca();
                valor2 = animal2.getForca();
                break;
            case "velocidade":
                valor1 = animal1.getVelocidade();
                valor2 = animal2.getVelocidade();
                break;
            case "inteligencia":
                valor1 = animal1.getInteligencia();
                valor2 = animal2.getInteligencia();
                break;
            default:
                throw new IllegalArgumentException("Atributo desconhecido: " + atributo);
        }

        // Adicionar um pequeno fator de sorte
        valor1 += random.nextInt(10); // Adiciona um valor entre 0 e 9
        valor2 += random.nextInt(10); // Adiciona um valor entre 0 e 9

        System.out.println("Batalha: " + animal1.getEspecie() + " vs " + animal2.getEspecie());
        System.out.println(animal1.getEspecie() + " " + atributo + ": " + valor1);
        System.out.println(animal2.getEspecie() + " " + atributo + ": " + valor2);

        if (valor1 > valor2) {
            return animal1;
        } else if (valor2 > valor1) {
            return animal2;
        } else {
            return null; // Empate
        }
    }
}
