package monsters;

import vehicles.Vehicle;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int attackValue, int healthValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }

    public String roar(){
        return "RAAAAAAaar!";
    }

    public void attackMonster(Kaiju monsterTarget){
        monsterTarget.loseHealth(this.attackValue);
    }

    public void attackArmy(Vehicle armyTarget){
        armyTarget.loseHealth(this.attackValue);
    }


    public void loseHealth(int amount){
        healthValue -= amount;
    }

    public String move;


}
