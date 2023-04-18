public class Warrior {
	private String = "Um guerreiro valente e forte";
	private int vida = 100;
	private int mana = 50;

	// Attributes
	private int forca = 10;
	private int defesa = 5;

	// Items
	private int espadaDamage = 15;
	private int escudoDamage = 5;

	// Actions
	public int atacar() {
		int damage = espadaDamage + forca;
		mana -= 10;
		return damage;
	}

	public void defender() {
		defesa += escudoDamage;
		mana -= 5;
	}
}
