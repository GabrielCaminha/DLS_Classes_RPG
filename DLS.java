class Warrior {
  vida 100;
  mana 50;
  descricao "Um guerreiro valente e forte";
  
  int forca 10;
  int defesa 5;
  
  item espada deals 15 damage;
  item escudo deals 5 damage;
  
  action atacar() {
    : int
    damage = espadaDamage + forca;
    mana -= 10;
    return damage;
  }
  
  action defender() {
    defesa += escudoDamage;
    mana -= 5;
  }
}
