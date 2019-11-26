public class Radio {

    private String channel;

    public Radio(String channel){
        this.channel = channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void tuneInTo(String desiredChannel) {
        this.channel = desiredChannel;
    }
}
