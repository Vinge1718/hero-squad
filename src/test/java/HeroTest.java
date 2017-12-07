import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero = new Hero("Omni-man");
        assertEquals(true, myHero instanceof Hero);
    }
}
