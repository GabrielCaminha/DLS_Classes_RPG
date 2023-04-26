public class Guerreiro {
    private String descricao = "Classe focada em combate corpo-a-corpo.";
    private int vida = 150;
    private int mana = 50;

    // Attributes
    private int forca = 10;
    private int destreza = 8;
    private int constituição = 12;

    // Items
    private int espadaDamage = 15;
    private int poçãoHealing = 25;

    // Actions
    public void atacar() {
        destreza += 2;
        forca += 5;
    }

    public void beberPoção() {
        vida += poçãoHealing;
    }

    // Getters e Setters para os itens
    public int getEspadaDamage() {
        return espadaDamage;
    }

    public void setEspadaDamage(int damage) {
        espadaDamage = damage;
    }

    public int getPoçãoHealing() {
        return poçãoHealing;
    }

    public void setPoçãoHealing(int healing) {
        poçãoHealing = healing;
    }

    // Getters e Setters para os atributos
    public int getForca() {
        return forca;
    }

    public void setForca(int amount) {
        forca = amount;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int amount) {
        destreza = amount;
    }

    public int getConstituição() {
        return constituição;
    }

    public void setConstituição(int amount) {
        constituição = amount;
    }
}
