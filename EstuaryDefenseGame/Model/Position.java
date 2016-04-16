public class Position {
    
    // attributes here:
    private int x; // x position
    private int y; // y position 
    
    // default constructor for Position
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // getters here:
    public int getX() {
        return x; 
    }
    public int getY() {
        return y;
    }
    
    // setters here:
    public void setX(int num) {
        x = num;
    }
    public void setY(int num) {
        y = num;
    }
    
    // Position methods:
    public void incrX(){
        this.x += 1;
    }
}