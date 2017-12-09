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
}
