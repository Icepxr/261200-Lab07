public class Character {

    private int health;
    private int stamina;
    private final int maxHealth ;
    private final int maxStamina ;

    public Character(int health,int stamina){
        this.health = health;
        this.stamina = stamina;
        this.maxStamina = stamina;
        this.maxHealth= health;
        System.out.println("Character created with "+health+" health and "+stamina+" stamina.");

    }

    public void Status(){
        System.out.println("Character's health: "+health+"., stamina: "+stamina);
    }
    public void  swingSword(){
        stamina -= 10;
        if(stamina<=0){
            System.out.println("Your character needs to cool down.");
        }else {
            System.out.println("Character swings the sword. Stamina is now " + stamina);
        }
    }
    public void takeDamage(int damage){
        if(health<damage){
            System.out.println("Character is dead.");
        }else {
            health-=damage;
            System.out.println("Character takes " + damage + " damage. Health is now " + health);
        }
    }
    public void rest(){
        stamina = maxStamina;
        health = maxHealth;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}

