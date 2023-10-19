class Hero {
    String heroName; // имя героя
    String attribute; // атрибут героя
    int health; // показатель здоровья
    int strength; //  показатель силы
    int agility; // показатель ловкости
    int intelligence; // показатель интеллекта
    int moveSpeed; // показатель скорости бега
    double armor; // показатель брони
    int damage; // показатель урона

}
class Creep {
    String creepName; // имя монстра
    int health; // показатель здоровья
    int damage; // показатель урона
    int armor; // показатель брони
    int moveSpeed; // показатель скорости бега
}

class Neutral_Creep {
    String neutralCreepName; // имя нейтральных монстров
    int tier; // класс нейтрального монстра
    int health; // показатель здоровья
    int damage; // показатель урона
    int armor; // показатель брони
    int moveSpeed; // показатель скорости бега
}
public class Main {
    public static void main(String[] args) {
        Hero hero_One; // первый герой
        hero_One = new Hero();

        hero_One.heroName = "Axe";
        hero_One.attribute = "Strength";
        hero_One.health = 670;
        hero_One.strength = 25;
        hero_One.agility = 20;
        hero_One.intelligence = 18;
        hero_One.moveSpeed = 315;
        hero_One.armor = 2.33;
        hero_One.damage = 55;

        Hero hero_Two; // второй герой
        hero_Two = new Hero();
        hero_Two.heroName = "Phantom Assassin";
        hero_Two.attribute = "Agility";
        hero_Two.health = 538;
        hero_Two.strength = 19;
        hero_Two.agility = 23;
        hero_Two.intelligence = 15;
        hero_Two.moveSpeed = 305;
        hero_Two.armor = 4.83;
        hero_Two.damage = 54;

        Creep creep_One; // первый монстр
        creep_One = new Creep();
        creep_One.creepName = "Ranged creep";
        creep_One.health = 300;
        creep_One.damage = 21;
        creep_One.armor = 0;
        creep_One.moveSpeed = 325;

        Creep creep_Two; // второй монстр
        creep_Two = new Creep();
        creep_Two.creepName = "Melee creep";
        creep_Two.health = 550;
        creep_Two.damage = 19;
        creep_Two.armor = 2;
        creep_Two.moveSpeed = 300;

        Neutral_Creep neutral_Creep_One;
        neutral_Creep_One = new Neutral_Creep();
        neutral_Creep_One.neutralCreepName = "Ghosts";
        neutral_Creep_One.tier = 1;
        neutral_Creep_One.health = 500;
        neutral_Creep_One.damage = 45;
        neutral_Creep_One.armor = 2;
        neutral_Creep_One.moveSpeed = 320;

        Neutral_Creep neutral_Creep_Two;
        neutral_Creep_Two = new Neutral_Creep();
        neutral_Creep_Two.neutralCreepName = "Wolfs";
        neutral_Creep_Two.tier = 2;
        neutral_Creep_Two.health = 600;
        neutral_Creep_Two.damage = 30;
        neutral_Creep_Two.armor = 3;
        neutral_Creep_Two.moveSpeed = 350;
    }
}
