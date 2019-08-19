import Problem2.Gameplay.GameMaster;
import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

public class Main {

    public static void main(String[] args){
        Transformer soundwave = new Transformer("Soundwave", Team.D, 7, 1, 7, 4, 8, 8, 3, 7);
        Transformer hotshot = new Transformer("Hotshot", Team.D, 3, 4, 7, 7, 5, 6, 7, 7);
        Transformer bumblebee = new Transformer("Bumblebee", Team.A, 4, 2, 6, 4, 6, 7, 4, 7);
        Transformer light = new Transformer("Light", Team.A, 6, 1, 7, 4, 2, 8, 3, 7);
        Transformer optimusPrime = new Transformer("Optimus Prime", Team.A, 5, 7, 4, 6, 10, 10, 7, 6);
        Transformer ritcher = new Transformer("Ritcher", Team.D, 1, 10, 10, 10, 2, 4, 10, 7);
        Transformer[] transformers = {soundwave, bumblebee, optimusPrime, hotshot, light, ritcher};
        GameMaster gameMaster = new GameMaster(transformers);
        gameMaster.conductBattles();
    }
}
