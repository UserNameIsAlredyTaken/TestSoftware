import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Map;
import java.util.Random;

/**
 * Created by danil on 05.09.2019.
 */
public class Ford {
    boolean isSckok;

    void ToSckok(){
        isSckok = true;
    }

    void RandomTogle(ControlPanel cp){
        if(isSckok){
            for (boolean togl :cp.toglers.values()) {
                togl = new Random().nextBoolean();
            }
            cp.Apply();
        }
    }
}
