/**
 * Created by danil on 05.09.2019.
 */
public class Rockets {
    Vector3 position;

    static private Rockets instance;

    public static Rockets get_instance() {
        if(instance == null) {
            instance = new Rockets();
        }
        return instance;
    }

}
