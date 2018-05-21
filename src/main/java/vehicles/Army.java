package vehicles;
import monsters.Kaiju;

public class Army extends Vehicle{

    public Army(VehicleType type, int attackValue){
        super(type, attackValue);
    }

    public void attack(Kaiju target){
        target.loseHealth(this.getAttackValue());
    }


}
