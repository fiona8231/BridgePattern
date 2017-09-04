
public class TVRemoteMute extends RemoteControl {


    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttion9pressed() {
        System.out.println(" TV was muted");

    }
}
