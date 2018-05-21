import monsters.BatMonster;
import monsters.GiantLizard;
import monsters.Kaiju;
import org.junit.Before;
import org.junit.Test;
import vehicles.Army;
import vehicles.VehicleType;

import static org.junit.Assert.assertEquals;

public class GiantLizardTest {

    GiantLizard giantLizard;
    BatMonster batMonster;
    Army tank;

    @Before
    public void before(){
        giantLizard = new GiantLizard("Godzilla", 5, 12);
        batMonster = new BatMonster("Mothra", 3, 10);
        tank = new Army(VehicleType.TANK, 5);
    }


    @Test
    public void canGetName(){
        assertEquals("Godzilla", giantLizard.getName());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(5, giantLizard.getAttackValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(12, giantLizard.getHealthValue());
    }

    @Test
    public void canRoar(){
        assertEquals("RAAAAAAaar!", giantLizard.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Godzilla stomps towards the enemy", giantLizard.move());
    }

    @Test
    public void canAttackOtherMonsters(){
        giantLizard.attackMonster(batMonster);
        assertEquals(5, batMonster.getHealthValue());
    }

    @Test
    public void canAttackArmy(){
        giantLizard.attackArmy(tank);
        assertEquals(0, tank.getHealth());
    }


}
