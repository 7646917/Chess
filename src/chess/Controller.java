package chess;

public class Controller {


    Chessboard chessboard;

    public Controller() {
        
    }

    public void initializeGame() {
        chessboard = new Chessboard(8);
    }
    
    
    public Chessboard getChessBoard(){
        return this.chessboard;
    }
    //Create Tiles DONE

    //Create Pieces 

    //SetBoard
}
