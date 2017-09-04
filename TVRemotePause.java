
public class TVRemotePause extends RemoteControl{
    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttion9pressed() {

        System.out.println("TV was pause");

    }
}
