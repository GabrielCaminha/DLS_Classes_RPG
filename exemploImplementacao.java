class Mage "A powerful spellcaster" {
    vida 10;
    mana 100;
    items {
        wand damage 5;
        robe damage 2;
    }
    actions {
        fireball damage 20;
        heal damage -10;
    }
}

class Warrior "A fierce fighter" {
    vida 20;
    mana 0;
    items {
        sword damage 10;
        shield damage 5;
    }
    actions {
        charge damage 15;
        block damage -5;
    }
}
