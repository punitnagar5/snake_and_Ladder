package snakeLadder.snakeAndLadder;

public class MaxPlayersReachedExeption extends Exception{
    
    public MaxPlayersReachedExeption(Integer players){
        super("The board already has maximum allowed Player: " + players);
    }
}