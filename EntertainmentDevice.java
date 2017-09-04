// This is the Abstract class is going to represent every single  device tha we are going to be creating
abstract class EntertainmentDevice {

    public int deviceState;
    public int maxSetting; //maximum chanel
    public int  volume = 0;

    public abstract void button5pressed();
    public abstract void button6pressed();

    public void deviceFeedback(){
        if(deviceState > maxSetting || deviceState <0){
            deviceState = 0;
        }
        System.out.println("On " + deviceState);
    }

    public void button7pressed(){
        volume++;
        System.out.println("Volume at: " + volume);
    }

    public void button8pressed(){
        volume--;
        System.out.println("Volume at: " + volume);
    }

}
