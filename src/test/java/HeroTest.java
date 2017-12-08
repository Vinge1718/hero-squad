import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
        assertEquals(true, myHero instanceof Hero);
    }
/*
    @Test
    public void Hero_instantiatesWithProperties_String(){
        Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
        assertEquals(("Omni-man", "24", "Ever Present", "Easily Overwhelmed"), ((myHero.getName()),(myHero.getAge()), (myHero.getPower()), (myHero.getWeakness())));
    }
    */
}
