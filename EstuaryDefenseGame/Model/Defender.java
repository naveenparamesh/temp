public abstract class Defender extends Character{
   
   // attributes here:
    private int speed; // rate of movement -> 0
    private int baseAttack; // for Defenders 
    private int cost; // cost of each character
    
    // default constructor for Defenders
    public Defender(int speed, int baseAttack, int cost, int hp, Position pos, boolean isOutermost){
        super(hp, pos, isOutermost);
        speed = 0;
        this.baseAttack = baseAttack;
        this.cost = cost;
        
    }
    
    // methods here:
    
}