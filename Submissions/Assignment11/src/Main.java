import Problem1.CastleChecker;
import Problem2.Gameplay.GameMaster;
import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

public class Main {

    public static void main(String[] args){
//        Problem 1 test
//        int[] arr = {1,1,3,5,2,3,5};
//        System.out.println("Number of castle spots found: " + CastleChecker.checkAvailability(arr));
//        Problem 2 test
        Transformer soundwave = new Transformer("Soundwave", Team.D, 7, 1, 7, 4, 8, 8, 3, 7);
        Transformer bumblebee = new Transformer("Bumblebee", Team.A, 4, 2, 6, 4, 6, 7, 4, 7);
        Transformer optimusPrime = new Transformer("Optimus Prime", Team.A, 5, 7, 4, 6, 10, 10, 7, 6);
        Transformer[] transformers = {soundwave, bumblebee, optimusPrime};
        GameMaster gameMaster = new GameMaster(transformers);
        gameMaster.conductBattles();
    }
}
