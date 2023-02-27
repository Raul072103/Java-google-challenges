import org.jetbrains.annotations.NotNull;

public class Fighter {

    private String name;
    private int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public Fighter attack(@NotNull Fighter fighter){
        fighter.health = fighter.health - this.damagePerAttack;
            return fighter;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamagePerAttack(){
        return this.damagePerAttack;
    }
}
