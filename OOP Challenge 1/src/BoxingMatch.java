public class BoxingMatch {
    private Fighter fighter1, fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        while (fighter1.getHealth() != 0 && fighter2.getHealth() != 0) {
            fighter2 = fighter1.attack(fighter2);
            if (fighter2.getHealth() == 0)
                return fighter1.getName() + " has won!";
            fighter1 = fighter2.attack(fighter1);
            if (fighter1.getHealth() == 0)
                return fighter2.getName() + " has won!";
        }

        return "The fight has ended in a draw";
    }
}
