package javafxdemo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// import javax.swing.Action;
// import org.w3c.dom.events.Event;

//new
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class App extends Application implements EventHandler<ActionEvent>{
    Button button;
    Stage window;
    Scene scene;

    public static void main(String[] args) {
      launch(args);

    }

    @Override
    public void start(Stage primarysStage) throws Exception {
       window = primarysStage;
       window.setTitle("Record your data collection here");

       //form
       TextField nameInput = new TextField();

        button = new Button("Submit data");
        button.setOnAction(e -> System.out.println(nameInput.getText()));

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();    
    }

    private boolean isValid(TextField input, String message){
        try{
            int pcount = Integer.parseInt(input.getText());
            System.out.println("You counted this many microplastics:" + pcount);
            return true;
        }catch(Exception e) {
        System.out.println("error");
        return false;
        }
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button) {
            System.out.println("Thanks for submitting your data!");
        }}}
    

/**
 * JavaFX App
 */
// public class App extends Application {

//     private static Scene scene;

//     @Override
//     public void start(Stage stage) throws IOException {
//         scene = new Scene(loadFXML("primary"), 640, 480);
//         stage.setScene(scene);
//         stage.show();
//     }

//     static void setRoot(String fxml) throws IOException {
//         scene.setRoot(loadFXML(fxml));
//     }

//     private static Parent loadFXML(String fxml) throws IOException {
//         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
//         return fxmlLoader.load();
//     }

//     public static void main(String[] args) {
//         launch();
//     }

// }