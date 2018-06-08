import com.kodilla.rps.Player;
import com.kodilla.rps.RockPaperScissorsGame;
import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsGameTestSiute {
    private Player computerPlayer = new Player("Computer");
    private Player player = new Player("Ania");

    @Test
    public void rockShouldBeatScissors() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player, computerPlayer);
        String move = "rock";
        String computerMove = "scissors";

        //When
        String message = game.decide(move, computerMove);
        String message2 = game.decide(computerMove,move);
        System.out.println(message);
        System.out.println(message2);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins());
        Assert.assertEquals("Winner: ROCK Player: Ania(1)", message);
        Assert.assertEquals("Winner: ROCK Player: Computer(1)", message2);

    }

    @Test
    public void scissorsShouldBeatPaper() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player, computerPlayer);
        String move = "scissors";
        String computerMove = "paper";

        //When
        String message = game.decide(move,computerMove);
        String message2 = game.decide(computerMove,move);
        System.out.println(message);
        System.out.println(message2);

        //Then
        Assert.assertEquals(1, game.getPlayer().getWins() );
        Assert.assertEquals("Winner: SCISSORS Player: Ania(1)",message);
        Assert.assertEquals("Winner: SCISSORS Player: Computer(1)", message2);

    }

    @Test
    public void paperShouldBeatRock() {
        //Given
        RockPaperScissorsGame game = new RockPaperScissorsGame(player, computerPlayer);
        String move = "paper";
        String computerMove = "rock";

        //When
        String message = game.decide(move,computerMove);
        String message2 = game.decide(computerMove,move);
        System.out.println(message);
        System.out.println(message2);

        //Then
        Assert.assertEquals(1,game.getPlayer().getWins());
        Assert.assertEquals("Winner: PAPER Player: Ania(1)", message);
        Assert.assertEquals("Winner: PAPER Player: Computer(1)", message2);
    }

}
