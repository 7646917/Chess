package chess;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller gameController = new Controller();
        gameController.initializeGame();
        System.out.println("Start");
        primaryStage.setTitle("Chess");

        Group root = new Group();
        Canvas canvas = new Canvas(800,800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gameController.draw(gc);

        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 800, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
