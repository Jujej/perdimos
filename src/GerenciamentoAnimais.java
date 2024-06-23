import java.util.*;
import java.io.*;

public class GerenciamentoAnimais {
    private List<Animal> animais;

    public GerenciamentoAnimais() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            animal.display();
        }
    }

    public void salvarAnimais(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Animal animal : animais) {
                writer.write(animal.getEspecie() + "," + animal.getForca() + "," + animal.getVelocidade() + "," + animal.getInteligencia());
                writer.newLine();
            }
        }
    }

    public void carregarAnimais(String filename, String tipoAnimal) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String especie = data[1];
                int forca = Integer.parseInt(data[2]);
                int velocidade = Integer.parseInt(data[3]);
                int inteligencia = Integer.parseInt(data[4]);

                if (!especie.equalsIgnoreCase(tipoAnimal)) {
                    continue;
                }

                switch (especie) {
                    case "Cachorro":
                        adicionarAnimal(new Cachorro(forca, velocidade, inteligencia));
                        break;
                    case "Gato":
                        adicionarAnimal(new Gato(forca, velocidade, inteligencia));
                        break;
                    case "Crocodilo":
                        adicionarAnimal(new Crocodilo(forca, velocidade, inteligencia));
                        break;
                    case "Girafa":
                        adicionarAnimal(new Girafa(forca, velocidade, inteligencia));
                        break;
                    default:
                        System.out.println("Espécie desconhecida: " + especie);
                        break;
                }
            }
        }
    }
}
