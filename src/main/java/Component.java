public abstract class Component {

    protected String playingSong;

    public Component(){
        this.playingSong = "";
    }

    public String getPlayingSong(){
        return this.playingSong;
    }

    public void stopPlaying(){
        this.playingSong = "";
    }

}
