import monsters.BatMonster;
import monsters.GiantLizard;
import org.junit.Before;
import org.junit.Test;
import vehicles.Army;
import vehicles.VehicleType;

import static org.junit.Assert.assertEquals;

public class BatMonsterTest {

    BatMonster batMonster;
    GiantLizard giantLizard;
    Army tank;

    @Before
    public void before(){
        batMonster = new BatMonster("Mothra", 3, 10);
        giantLizard = new GiantLizard("Godzilla", 5, 12);
        tank = new Army(VehicleType.TANK,5);
    }

    @Test
    public void canGetName(){
        assertEquals("Mothra", batMonster.getName());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(3, batMonster.getAttackValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, batMonster.getHealthValue());
    }

    @Test
    public void canRoar(){
        assertEquals("RAAAAAAaar!", batMonster.roar());
    }

    @Test
    public void canMove(){
        assertEquals("Mothra flyes high overhead", batMonster.move());
    }
    @Test
    public void canAttackOtherMonsters(){
        batMonster.attackMonster(giantLizard);
        assertEquals(9, giantLizard.getHealthValue());
    }

    @Test
    public void canAttackArmy(){
        batMonster.attackArmy(tank);
        assertEquals(2, tank.getHealth());
    }

}
