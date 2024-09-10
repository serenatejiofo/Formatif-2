package formatif2;

import java.beans.EventHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleCallBack {
    public static void main(String[] args) {


        SimpleCallBack app = new SimpleCallBack();


        //appelle de tous les types de call back
        //avec classe externe

        app.afficheCallBack(new ClasseExterne());

        // avec classe externe static

        app.afficheCallBack(new ClasseExterne.ClasseExterneStatic());

        //avec classe anonyme
        app.afficheCallBack(new Methode1() {
            @Override
            public String fait(String val) {
                return val;
            }
        });

        // avec closure
        app.afficheCallBack(cb -> {
            String val = cb.toString();
            return val;
        });

        //avec l'opérateur de référence :: sur la méthode dooda de L'objet app
        app.afficheCallBack(app::dooda);

        //avec l'opérateur de référence sur la méthode static staticDooda

        app.afficheCallBack(SimpleCallBack::staticDooda);
        // manipulation de référence avec callback

        Methode1 anonyme = new Methode1() {
            @Override
            public String fait(String val) {
                return val;
            }
        };

        Methode1 closure;

        Methode1 dooda;


        Methode1 choixCallBack = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un type 1,2 ou 3");
        int choix = scanner.nextInt();


        //on récupère le choix de l'utilisateur dans choixCallBack
        switch (choix) {
            case 1:
                choixCallBack = anonyme;
            case 2 :
                choixCallBack = closure;
            case 3:
                choixCallBack = dooda;

            default:
                System.out.println("Choix inexistant");
        }
        //on appelle afficheCallBack avec le callback choisi par l'utilisateur

        List<Integer> list = new ArrayList<>();

    }

    public void afficheCallBack(Methode1 callback) {
        System.out.println(callback.fait("Allo!"));
    }

    public String dooda(String param) {
        return "Méthode normale de SimpleCallBack " + param;
    }

    public static String staticDooda(String param) {
        return "Méthode statique de SimpleCallBack " + param;
    }

    public interface Methode1 {
        String fait(String val);
    }


}
