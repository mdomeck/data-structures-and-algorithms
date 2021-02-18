package codewars;

public class DeclareWinner {

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if(!firstAttacker.equals(fighter1.name)){
           Fighter temp = fighter1;
           fighter1 = fighter2;
           fighter2 = temp;
        }
        while (true) {
            fighter2.health -= fighter1.damagePerAttack;
            if (fighter2.health < 1) {
                return fighter1.name;
            } else {
                fighter1.health -= fighter2.damagePerAttack;
            }
            if (fighter1.health < 1) {
                return fighter2.name;
            }
        }
    }
}
