public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Andrei Muresanu", 100, 20);
        Fighter fighter2 = new Fighter("Doroftei", 120, 15);

        BoxingMatch start = new BoxingMatch(fighter1, fighter2);

        System.out.println(start.fight());
    }
}