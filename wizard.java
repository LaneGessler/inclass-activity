public class wizard extends character {
//variables
    private int spells;

    public wizard(String name, int health, int spells){
        //calls the super classses constructor
        super(name,health);
        //whats unique to the wizard class
        this.spells = spells;
    }
    
    @Override
    public void attack(){
        
        if (spells>0){
            System.out.println("Character "+name+" is casting spells.");
        }
        else{
            System.out.println(name+" is out of spells.");
        }
        
        spells = spells-1;
        }
    

}
