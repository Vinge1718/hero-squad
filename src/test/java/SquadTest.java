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
}
