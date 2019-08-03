package Problem2.Gameplay;

import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

import java.util.function.BinaryOperator;

public class Battle {
    private Transformer autobot;
    private Transformer decepitcon;
    private BinaryOperator<Transformer> checkFleeing =
            (autobotFighter, decepticonFighter) -> {
                int autobotCourage = autobotFighter.getCourage().getRange();
                int decepticonCourage = decepticonFighter.getCourage().getRange();
                int autobotStrength = autobotFighter.getStrength().getRange();
                int decepticonStrength = decepticonFighter.getStrength().getRange();
                int courageDifference = autobotCourage - decepticonCourage;
                int strengthDifference = autobotStrength - decepticonStrength;
                if(courageDifference >= 4 && strengthDifference >= 3){
                    return decepticonFighter;
                } else if(courageDifference <= -4 && strengthDifference <= -3){
                    return autobotFighter;
                } else {
                    return null;
                }
            };
    private BinaryOperator<Transformer> checkOutskill =
            (autobotFighter, decepticonFighter) -> {
                int autobotSkill = autobotFighter.getSkill().getRange();
                int decepticonSkill = decepticonFighter.getSkill().getRange();
                int skillDifference = autobotSkill - decepticonSkill;
                if(skillDifference >= 3){
                    return decepticonFighter;
                } else if(skillDifference <= -3){
                    return autobotFighter;
                } else {
                    return null;
                }
            };

    public Battle(Transformer autobot, Transformer decepitcon) {
        this.autobot = autobot;
        this.decepitcon = decepitcon;
    }

    public void fight(){
        System.out.println(this.autobot.getName());
        System.out.println(this.decepitcon.getName());
        Transformer coward = checkFleeing.apply(this.autobot, this.decepitcon);
        Transformer outskilled = checkOutskill.apply(this.autobot, this.decepitcon);
        if(coward == null && outskilled == null){
            if(this.autobot.getTotalRate() > this.decepitcon.getTotalRate()){
                this.decepitcon.setDestroyed(true);
            } else if(this.autobot.getTotalRate() < this.decepitcon.getTotalRate()){
                this.autobot.setDestroyed(true);
            } else {
                this.autobot.setDestroyed(true);
                this.decepitcon.setDestroyed(true);
            }
        } else if(coward != null){
            coward.setDestroyed(true);
        } else if(outskilled != null){
            outskilled.setDestroyed(true);
        }
    }
}
