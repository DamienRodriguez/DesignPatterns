public abstract class PlayerCharacter {
    private GuitarBehavior guitarBehavior;
    private SoloBehavior soloBehavior;

    public PlayerCharacter(GuitarBehavior guitar, SoloBehavior solo) {
        setGuitarBehavior(guitar);
        setSoloBehavior(solo);
    }

    public abstract void display();

    public void setGuitarBehavior(final GuitarBehavior guitar) {
        this.guitarBehavior = guitar;
    }

    public void setSoloBehavior(final SoloBehavior solo) {
        this.soloBehavior = solo;
    }

    public void playGuitar() {
        guitarBehavior.guitar();
    }

    public void playSolo() {
        soloBehavior.solo();
    }

}
