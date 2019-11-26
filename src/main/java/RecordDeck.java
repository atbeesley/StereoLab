public class RecordDeck {

    private String name;
    private int playSpeed;


    public RecordDeck(String name, int playSpeed){
        this.name = name;
        this.playSpeed = playSpeed;
    }

    public String getName() {
        return this.name;
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }
}
