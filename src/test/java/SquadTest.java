import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{

  @Test
  public void squadinstantiatesCorrectly_true() {
    Squad testSquad = new Squad("Avengers", "Vengence for the weak" );
    assertEquals(true, testSquad instanceof Squad);
  }

  @Test
  public void getName_squadInstantiatesWithNameandCause_strings(){
    Squad testSquad = new Squad("Avengers", "Vengence for the weak");
    assertEquals("Vengence for the weak", testSquad.getCause());
    assertEquals("Avengers", testSquad.getName());
  }

  @Test
  public void all_returnAllInstancesofSquad_true(){
      Squad firstSquad = new Squad("Avengers", "vengence for the weak");
      Squad secondSquad = new Squad("Justice-League", "Argue on behalf of the weak");
      assertEquals(true, Squad.all().contains(firstSquad));
      assertEquals(true, Squad.all().contains(secondSquad));
  }

  @Test
  public void getId_squadInstantiateWithAnId_1(){
      Squad.clear();
      Squad testSquad = new Squad("Avengers", "vengence for the weak");
      assertEquals(1, testSquad.getId());
  }

  @Test
  public void clear_emptiesAllSquadsfromInstances_0(){
      Squad testSquad = new Squad("Avengers", "vengence for the weak");
      Squad.clear();
      assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getHeroes_initiallyreturnsEmptyList_ArrayList(){
      Squad.clear();
      Squad testSquad = new Squad("Avengers", "vengence for the weak");
      assertEquals(0, testSquad.getHeroes().size());
  }

  @Test
  public void addHero_addsHeroToList_true(){
      Squad testSquad = new Squad("Avengers", "vengence for the weak");
      Hero testHero = new Hero("Omni-man", "24", "Ever Present", "Easily Overwhelmed");
      testSquad.addHero(testHero);
      assertTrue(testSquad.getHeroes().contains(testHero));
  }

  @Test
  public void find_returnsSquadWithSameId_secondSquad(){
      Squad.clear();
      Squad firstSquad = new Squad("Avengers", "vengence for the weak");
      Squad secondSquad = new Squad("JLeague", "Argue out stuff");
      assertEquals(Squad.find(secondSquad.getId()), secondSquad);
  }
 
}
