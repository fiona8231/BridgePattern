
public class Testing {

    public static void main(String[] args){
        RemoteControl theTV = new TVRemoteMute(new TV(1,200));
        RemoteControl theTV2 = new TVRemotePause(new TV(1,200));

        System.out.println(" TEST TV with mute");
        theTV.button5pressed();
        theTV.button6pressed();
        theTV.buttion9pressed();
        theTV.deviceFeedback(); // on the channel 1


        System.out.println("\n TEST TV with pause");
         theTV2.button5pressed();
         theTV2.button6pressed();
         theTV2.buttion9pressed();
         theTV2.deviceFeedback(); // on the channel 1
    }

}
