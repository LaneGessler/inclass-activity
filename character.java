public class character {
//variables
    protected String name;
    protected int health;
//constructors
    public character(){
        this.name = "unknown";
        this.health = 10;
    }
    public character(String name, int health){
        this.name = name;
        this.health = health;
    }
//getters
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
//actions
    public void attack(){
        System.out.println("Character "+this.name+" is attacking");
    }
    public void displayHealth(){
        System.out.println("Character "+this.name+"'s health is "+this.health);
    }

}
