class Guerreiro  {
  vida 150;
  mana 50;
  descricao "Classe focada em combate corpo-a-corpo.";
  
  int forca 10;
  int destreza 8;
  int constituição 12
  
  item espada deals 15 damage;
  item pocao heals 25;
  
  action fortalecer() {
    destreza += 2;
    forca += 5;
  }
  
  action sobrevida() {
    vida += 20;
  }
}
