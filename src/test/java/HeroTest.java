import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
        assertEquals(true, myHero instanceof Hero);
    }

    @Test
    public void getId_heroInstantiatesWithId_1(){
        Hero.clear();
        Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
        assertEquals(1, myHero.getId());
    }

    @Test
    public void clear_emptiesAllHeroesFromArrayList_0(){
        Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }

    @Test
    public void find_returnsHeroWithSameId_secondHero() {
      Hero myHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
      Hero mySecondHero = new Hero("Imort-man", "1123", "survivor", "bored");
      assertEquals(Hero.find(mySecondHero.getId()), mySecondHero);
    }
}
