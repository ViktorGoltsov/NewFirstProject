package HW;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        Fighter f1 = null;
        Fighter f2 = null;

        if (fighter1.name.equals(firstAttacker)) {
            f1 = fighter1;
            f2 = fighter2;
        }
        if (fighter2.name.equals(firstAttacker)) {
            f1 = fighter2;
            f2 = fighter1;
        }
            int minHelth = Math.min(f1.health, f2.health);

            while (minHelth > 0) {
                f2.health = f2.health - f1.damagePerAttack;
                if (f2.health <= 0) {
                    winner = f1.name;
                } else {
                    f1.health = f1.health - f2.damagePerAttack;
                    if (f1.health <= 0) {
                        winner = f2.name;
                    }
                }
                minHelth = Math.min(f1.health, f2.health);
            }

        return winner;
    }

    public static void main(String[] args) {
        Fighter Lew = new Fighter("Lew", 4, 2);
        Fighter Harry = new Fighter("Harry",4 , 2);
        System.out.println(declareWinner(Lew, Harry, "Harry"));
    }
}
