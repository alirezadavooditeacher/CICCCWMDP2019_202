import Problem02.Transformer;
import Problem02.War;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Transformer> transformers = new ArrayList<>();
        transformers.add(new Transformer(Transformer.Team.Autobot, "Name", 0,0,0,0,0,0,0,0));
        transformers.add(new Transformer(Transformer.Team.Deception, "Name", 1,0,0,0,0,0,0,0));
        transformers.add(new Transformer(Transformer.Team.Deception, "Name", 0,0,0,0,0,0,0,0));
        War war = new War(transformers);
        war.start();
        war.printResult();
    }
}
