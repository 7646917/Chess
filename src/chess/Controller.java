package chess;

import javafx.scene.canvas.GraphicsContext;

public class Controller {


    Chessboard chessBoard;

    public Controller() {
        
    }

    public void initializeGame() {
        chessBoard = new Chessboard(8);
    }
    
    
    public Chessboard getChessBoard(){
        return this.chessBoard;
    }
    
    public void draw(GraphicsContext gc){
        //Draw Tiles
        for(Tile t : chessBoard.getTiles()){
            gc.drawImage(t.getImg(),t.getPos().getX(),t.getPos().getY());   
        }
        
        //Draw Pieces
        /*
        for(GamePiece p : chessBoard.getPawns()){
            gc.drawImage(p.getImg(),p.getPos().getX(),p.getPos().getY());   
        }
        */
    }
}
