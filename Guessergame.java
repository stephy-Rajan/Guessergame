
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		boolean valFlag = false;
		Scanner scan=new Scanner(System.in);
		System.out.print("Guesser kindly guess the number:");
		do
		{
			guessNum=scan.nextInt();
			if(guessNum<0 || guessNum>10) {
				System.out.println("Invalid Number;Please enter the number between 0 to 10");				
			}
			else
				valFlag = true;

		}	while(!valFlag);
			return guessNum;
	}	
}

class Player
{
	int guessNum;
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number:");
	  	boolean valFlag = false;
		do {
		guessNum=scan.nextInt();
		if(guessNum<0 || guessNum>10) {
			System.out.println("Invalid Number;Please enter the number between 0 to 10");				
		}
		else 
			valFlag = true;
		}while(!valFlag);
	  	return guessNum;
	  	
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p1.guessNum();
		numFromPlayer3=p1.guessNum();
		
	}
	 boolean compare()
	 {	 
		 boolean result = false;
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game.Tie!Again match start");
				result = false;
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
				result = true;
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
				result = true;
			}
			else
			{
			System.out.println("Player 1 won the game");
			result = true;
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
				result = false;
			}
			else
			{
			System.out.println("Player 2 won the game");
			result=true;
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
			result=true;
		}
		else
		{
			System.out.println("Game lost Try Again!");
			result=false;
		}
		return result;
	}
	
}


public class Guessergame {

	public static void main(String[] args) {
	    boolean res = false;
		Umpire u=new Umpire();
			do
			{
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			res = u.compare();
			}while(!res);
}
}