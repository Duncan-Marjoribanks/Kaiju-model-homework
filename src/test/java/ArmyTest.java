import monsters.BatMonster;
import monsters.GiantLizard;
import monsters.GiantMonkey;
import org.junit.Before;
import org.junit.Test;
import vehicles.Army;
import vehicles.VehicleType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ArmyTest {

    Army infantry;
    Army tank;
    Army jeep;
    BatMonster batMonster;
    GiantLizard giantLizard;
    GiantMonkey giantMonkey;


    @Before
    public void before() {
        infantry = new Army(VehicleType.INFANTRY, 2);
        tank = new Army(VehicleType.TANK, 6);
        jeep = new Army(VehicleType.JEEP, 3);
        batMonster = new BatMonster("Mothra", 3, 10);
        giantLizard = new GiantLizard("Godzilla", 5, 12);
        giantMonkey = new GiantMonkey("King Kong", 9, 7);
    }

    @Test
    public void canGettype() {
        assertEquals(VehicleType.TANK, tank.getType());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(6, tank.getAttackValue());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(5, tank.getHealth());
    }

    @Test
    public void canShootMonsters() {
        tank.shootMonster(giantLizard);
        jeep.shootMonster(giantLizard);
        infantry.shootMonster(batMonster);
        assertEquals(3, giantLizard.getHealthValue());
        assertEquals(8, batMonster.getHealthValue());
    }

    @Test
    public void canShootOtherArmy() {
        jeep.shootArmy(tank);
        assertEquals(2, tank.getHealth());
    }

    @Test
    public void canRamMonster() {
        tank.ramMonster(giantMonkey);
        assertEquals(2, giantMonkey.getHealthValue());
        assertEquals(0, tank.getHealth());
    }

    @Test
    public void canRamArmy() {
        jeep.ramArmy(tank);
        assertEquals(2, tank.getHealth());
        assertEquals(0, jeep.getHealth());
    }

}

