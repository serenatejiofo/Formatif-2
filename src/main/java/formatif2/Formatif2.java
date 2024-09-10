package formatif2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Formatif2 extends Application {

    private Button bouton1 = new Button("un");
    private Button bouton2 = new Button("deux");
    private Button bouton3 = new Button("trois");
    private Button bouton4 = new Button("quatre");
    private Button bouton5 = new Button("cinq");

    private String titre = "Fonctionnalité";

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création des boutons

        bouton1.setPrefSize(50, 50);
        bouton1.setMinSize(25, 25);
        bouton1.setMaxSize(200, 200);

//		bouton2.setGraphic(loadImageView("trefle.png", 50, 50));
        bouton2.setPrefSize(50, 50);
        bouton2.setMinSize(25, 25);
        bouton2.setMaxSize(200, 200);

//		bouton3.setGraphic(loadImageView("coeur.png", 50, 100));
        bouton3.setPrefSize(50, 100);
        bouton3.setMinSize(25, 25);
        bouton3.setMaxSize(200, 200);

//		bouton4.setGraphic(loadImageView("carre.png", 100, 50));
        bouton4.setPrefSize(100, 50);
        bouton4.setMinSize(25, 25);
        bouton4.setMaxSize(200, 200);

//		bouton5.setGraphic(loadImageView("quatre.png", 100, 50));
        bouton5.setPrefSize(100, 100);
        bouton5.setMinSize(25, 25);
        bouton5.setMaxSize(200, 200);

        bouton1.setOnAction(ae-> System.out.println("allo"));


        // Choix de la scene initiale
        primaryStage.setScene(setVHScene());


        // On crée des closure pour mettre les scènes
        CreationScene vhScene = null;
        CreationScene borderScene = null;
        CreationScene gridScene = null;

        // On peut appeler directement la reference



        // Association des comportements (Action)


        this.primaryStage = primaryStage;
        primaryStage.show();

    }

    private void associeDialogAuxBoutons(Button... boutons) {

    }

    private void associeDialogAnonymous(Button... boutons) {
        String headerText = "Fonctionnalité à venir anonymous";

    }

    private void associeDialogClosure(Button bouton, CreationScene scene) {

    }


    private Scene setAnchoreScene() {
		AnchorPane anchorPane = new AnchorPane();


        return new Scene(anchorPane);
    }


    private Scene setGridScene() {
        GridPane grid = new GridPane();


        return new Scene(grid, 400, 400);
    }

    private Scene setBorderScene() {
        BorderPane borderPane = new BorderPane();


        return new Scene(borderPane, 400, 400);

    }

    private Scene setVHScene() {
        HBox hpane = new HBox();
        VBox vpane = new VBox();
        Label label = new Label("V H pane");
        vpane.getChildren().add(bouton1);

        return new Scene(vpane, 400, 300);

    }


    public static void main(String[] args) {
        launch(args);
    }

    private ImageView loadImage(String nom, double height, double width) {
        ImageView retImageView = new ImageView(
                new Image(this.getClass().getResourceAsStream(nom), width, height, false, true));
        return retImageView;
    }

    private void showAlert(String titre, String headerText) {
        //On affiche un dialog simple avec seulement un bouton OK


    }

    //On programme une classe interne non statique pour gérer l'événement
    public class InnerAction {

        private String headerText = "Fonctionnalité à venir inner class";


    }

    public interface CreationScene {
        public Scene setScene();
    }
}
