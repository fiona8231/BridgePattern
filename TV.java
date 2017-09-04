
public class TV extends EntertainmentDevice {

    public TV(int newDeviceState, int newMaxSetting){
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void button5pressed() {

        System.out.println("Channel down");
        deviceState--;

    }

    @Override
    public void button6pressed() {
        System.out.println("Channel up");
        deviceState++;

    }
}
