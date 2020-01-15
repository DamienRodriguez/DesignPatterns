public class GuitarHero {

    public static void main(String[] args) {

        PlayerCharacter player1 = new PlayerCharacterSlash(new GibsonSG(), new JumpOffStage());
        PlayerCharacter player2 = new PlayerCharacterHendrix(new GibsonFlyingV(), new GuitarOnFire());
        PlayerCharacter player3 = new PlayerCharacterYoung(new FenderTelecaster(), new SmashingGuitar());


        //This code block is designed to show proper use of the design pattern given initial behaviors

        System.out.println("==================================================================");
        player1.display();
        player1.playGuitar();
        player1.playSolo();
        formatting();

        player2.display();
        player2.playGuitar();
        player2.playSolo();
        formatting();


        player3.display();
        player3.playGuitar();
        player3.playSolo();
        formatting();
        //end of code block

        //This code block is designed to show interchangeability
        player1.setSoloBehavior(new SmashingGuitar());
        player1.setGuitarBehavior(new FenderTelecaster());
        player1.display();
        player1.playGuitar();
        player1.playSolo();
        formatting();

        player1.setSoloBehavior(new GuitarOnFire());
        player1.setGuitarBehavior(new GibsonFlyingV());
        player1.display();
        player1.playGuitar();
        player1.playSolo();
        System.out.println("==================================================================");

        //end of code block
    }

    private static void formatting() {
        System.out.println("==================================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("==================================================================");
    }
}
