package monsters;

public class BatMonster extends Kaiju{

    public BatMonster(String name, int attackValue, int healthValue) {
        super(name, attackValue, healthValue);
    }

    public String move(){
        return String.format("%s flyes high overhead", this.getName());
    }


}
