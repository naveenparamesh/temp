public abstract class Character extends Position{
    
    private int HP;
    private Position pos;
    //private BufferedImage image; this should be handled in View 
    private boolean isOutermost;
    
    public Character(int hp, Position pos, boolean isOutermost){
        this.HP = hp;
        this.pos = pos;
        this.isOutermost = isOutermost;
    }
    abstract void decreaseHP(int num);
    abstract void render();
    abstract void update();
    abstract void updateHP();
        
    
}