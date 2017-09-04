// This is the abstraction layer and it represent numerous different ways we can
//use this remote to work with all the different types of devices

public abstract class RemoteControl {
    private EntertainmentDevice theDevice;

    public RemoteControl(EntertainmentDevice newDevice){
        theDevice = newDevice;
    }

    public void button5pressed(){
        theDevice.button5pressed();

    }

    public void button6pressed(){
      theDevice.button6pressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public abstract void buttion9pressed();

}
