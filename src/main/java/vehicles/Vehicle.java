package vehicles;

import monsters.Kaiju;

public abstract class Vehicle {

    private VehicleType type;
    private int attackValue;
    private int health;

    public Vehicle(VehicleType type, int attackValue){
        this.type = type;
        this.attackValue = attackValue;
        this.health = this.type.getHealth();
    }

    public VehicleType getType(){
        return this.type;
    }

    public int getHealth(){
        return this.health;
    }

    public int getAttackValue(){
        return this.attackValue;
    }

    public void loseHealth(int amount){
        if (this.health <= amount){ this = null; }
        this.health -= amount;
    }

    public void shootMonster(Kaiju target){
        target.loseHealth(this.getAttackValue());
    }

    public void shootArmy(Vehicle target){
        target.loseHealth(this.getAttackValue());
    }

    public void ramMonster(Kaiju target){
        target.loseHealth(this.getHealth());
        this.loseHealth(this.getHealth());
    }

    public void ramArmy(Vehicle target){
        target.loseHealth(this.getHealth());
        this.loseHealth(this.getHealth());
    }


}
