package monsters;

public class GiantLizard extends Kaiju{

    public GiantLizard(String name, int attackValue, int healthValue){
        super(name, attackValue, healthValue);
    }

    public String move(){
        return String.format("%s stomps towards the enemy", this.getName());
    }

}
