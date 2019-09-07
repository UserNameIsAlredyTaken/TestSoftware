/**
 * Created by danil on 05.09.2019.
 */
public class Main {
    public static void Main(){
        Ford ford = new Ford();
        Ship ship = new Ship();
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.ship = ship;

        ford.ToSckok();
        ford.RandomTogle(controlPanel);
    }
}
