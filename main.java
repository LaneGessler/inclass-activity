public class main {
    public static void main(String[] args){
        character player = new character("bob",10);
        player.displayHealth();
        player.attack();

        wizard magicman = new wizard("magic bob",5,1);

        magicman.attack();
        magicman.displayHealth();
    }


}
