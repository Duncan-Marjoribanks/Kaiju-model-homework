package vehicles;

public enum VehicleType {

    TANK(5),
    JEEP(3),
    INFANTRY(1);

    private final int health;

    VehicleType(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

}
