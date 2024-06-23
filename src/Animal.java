public abstract class Animal {

    // atributos
    protected String especie;
    protected int forca;
    protected int velocidade;
    protected int inteligencia;

    // construtor
    public Animal(String especie, int forca, int velocidade, int inteligencia) {
        this.especie = especie;
        this.forca = forca;
        this.velocidade = velocidade;
        this.inteligencia = inteligencia;
    }

    // getters
    public String getEspecie() {
        return especie;
    }

    public int getForca() {
        return forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    // setters
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    // metodos
    public abstract void display();
    
}
