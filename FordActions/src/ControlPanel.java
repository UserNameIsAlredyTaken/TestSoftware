import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by danil on 05.09.2019.
 */
public class ControlPanel {
    public HashMap<String, Boolean> toglers;
    public Ship ship;

    public void Apply(){
        if(toglers.get("start")){
            ship.ToShake();
        }

        if(ship.isShaking || toglers.get("draw arc")){
            ship.DrawArc();
        }

        if(ship.isShaking || toglers.get("rotate")){
            ship.Rotate();
        }

        if(ship.isShaking || toglers.get("go to rockets")){
            ship.GoToRockets(Rockets.get_instance());
        }
    }
}
