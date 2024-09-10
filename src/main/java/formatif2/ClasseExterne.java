package formatif2;

import javafx.event.Event;
import javafx.event.EventHandler;

public class ClasseExterne implements SimpleCallBack.Methode1 {

    @Override
    public String fait(String val) {
        return val;
    }

    public static class ClasseExterneStatic implements SimpleCallBack.Methode1 {

        @Override
        public String fait(String val) {
            return val;
        }
    }


}
