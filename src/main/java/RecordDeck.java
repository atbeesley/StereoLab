public class RecordDeck extends Component implements IPlay {

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

    public void play(String vinylName){
         this.playingSong = vinylName;
    }
}
