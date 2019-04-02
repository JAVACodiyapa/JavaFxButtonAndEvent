import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    Label response;
    public static void main(String args[]){
        //start javaFx application by calling launch().
        launch(args);

    }
    @Override
    public void start(Stage myStage){
        //give stage a title.
        myStage.setTitle("Demonstrate JavaFx Button ANd Event");

        //use Flow Pane For the root node.
        //in this case vertical and horizontal gaps of 10.
        FlowPane rootNode =new FlowPane(10,10);

        //centre the control in the scene
        rootNode.setAlignment(Pos.CENTER);

        //create scene.
        Scene myScene=new Scene(rootNode, 700,500);

        //set the scene to the stage.
        myStage.setScene(myScene);

        //create a label.
        response=new Label("Push a Button");

        //create two push button.
        Button btnAlpha=new Button("Alpha");
        Button btnBeta =new Button("Beta");

        //Handle the action events for the alpha buttoN.
        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Alpha is Pressed");
            }
        });

        //Handle the action for the beta.
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Beta is Pressed");
            }
        });

        //add label,button to the root node.
        rootNode.getChildren().addAll(response,btnAlpha,btnBeta);

        //show the stage and the scene.
        myStage.show();

    }
}