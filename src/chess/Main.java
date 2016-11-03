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
        Canvas canvas = new Canvas(200,200);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for(Tile t : gameController.getChessBoard().getTiles()){
            gc.drawImage(t.getImg(),t.getPos().getX(),t.getPos().getY());   
        }
        
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
