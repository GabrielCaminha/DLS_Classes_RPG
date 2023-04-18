public class Mage {
	// Description: A powerful spellcaster
	private int vida = 10;
	private int mana = 100;

	// Items
	private int wandDamage = 5;
	private int robeDamage = 2;

	// Actions
	public void fireball() {
		System.out.println("fireball dealt 20 damage!");
	}
	public void heal() {
		System.out.println("heal dealt -10 damage!");
	}
}

public class Warrior {
	// Description: A fierce fighter
	private int vida = 20;
	private int mana = 0;

	// Items
	private int swordDamage = 10;
	private int shieldDamage = 5;

	// Actions
	public void charge() {
		System.out.println("charge dealt 15 damage!");
	}
	public void block() {
		System.out.println("block dealt -5 damage!");
	}
}
