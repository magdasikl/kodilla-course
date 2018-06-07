import com.kodilla.rps.Player;
import com.kodilla.rps.RockPaperScissorsGame;
import org.junit.Assert;
import org.junit.Test;

public class RockPapreScissorsGameTestSiute {

    @Test
    public void rockPaperShouldBeatScissors() {
        //Given
        Player player = new Player("Ania");
        RockPaperScissorsGame game = new RockPaperScissorsGame(player);
        String move = "rock";
        String computerMove = "scissors";

        //When
        String message = game.decide(move,computerMove);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins());
        Assert.assertEquals("Ania:1,Computer:0", message);

    }
}
