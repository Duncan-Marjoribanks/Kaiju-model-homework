package monsters;

public class GiantMonkey extends Kaiju{

    public GiantMonkey(String name, int attackValue, int healthValue) {
        super(name, attackValue, healthValue);
    }

    public String move(){
        return String.format("%s climbs over an office block ", this.getName());
    }
}
