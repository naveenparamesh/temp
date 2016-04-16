public abstract class Attacker extends Character{
    
    // attributes here:
    private int speed;
    
    // default constructor for Attacker
    public Attacker(int speed){
        this.speed = speed;
    }
    
    //methods here:
    public abstract void move();