import java.util.*;
	
	
	class Guesser{
		int guessno;
		public int guessno() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Hey Guesser! Guess the Number man betwwen 0 and 10");
			int enter=sc.nextInt();
			if(enter <10&& enter >0)
			{
				guessno=enter;
			}
			else {
				Guesser g1=new Guesser();
			    System.out.println("Sorry! Guess the number again Correctly");

				g1.guessno();
			}
			
			return guessno;
		}
	}
	
	
	class Player
	{
		static int choose;
		public static int guessing()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Hello Player , Guess the Number man betwwen 0 and 10");
			int enter1=sc.nextInt();
			if(enter1 <10&& enter1 >0)
			{
				choose=enter1;
			}
			else {
				Player pl=new Player();
			    System.out.println("Sorry! Guess the number again Correctly");

				pl.guessing();
			}
			
			return choose;
		}
	}
	
	
	
	class Umpire
	{
		 static int guesser;
		static int player1;
		static int player2;
		static int player3;
		public void guesser()
		{
			Guesser g=new Guesser();
			guesser=g.guessno();
		}
		
		public static void player()
		{
			
			 
			
			//Player p1=new Player();
		    //Player p2=new Player();
		    //Player p3=new Player();
		    player1=Player.guessing();
		    player2=Player.guessing();
		    player3=Player.guessing();
		}
		public static void compare()
		{
			Umpire u1=new Umpire();
			//Player p4=new Player();
		    //Player p5=new Player();
		    //Player p6=new Player();
			
			if(guesser==player1)
			{
				if(guesser==player2 && guesser==player3) {
					System.out.println("Player 1 and Player 2  and Player 3 game tied try again:)");
					//System.out.println("P1"+player1);
					//System.out.println("P2"+player2);
					//System.out.println("P3"+player3);

					//Umpire u1=new Umpire();
                    u1.guesser();
					Umpire.player();
					Umpire.compare();
					
					
				}
				else if(guesser== player2)
				{
					System.out.println("Congrats! Player 1 and player 2 Game tied. Try again :)");
					//System.out.println("P1"+player1);
					//System.out.println("P2"+player2);
					//Umpire u1=new Umpire();
                    u1.guesser();
					player1=Player.guessing();
					player2=Player.guessing();
					Umpire.compare();
				}
				else if(guesser==player3)
				{
					System.out.println("Congrats! Player 1 and player 3 Game Tied :)");
					//System.out.println("P1"+player1);
					//System.out.println("P3"+player3);
                    u1.guesser();

					player1=Player.guessing();
					player3=Player.guessing();
					Umpire.compare();
				}
				else {
				System.out.println("Congrats! Player 1 has Won the Game");
				}
			}
			else if(guesser==player2)
			{
				if(guesser==player3)
				{
					System.out.println("Congrats! Player 2 and player 3 Game Tied. Try again :)");
					//System.out.println("P2"+player2);
					//System.out.println("P3"+player3);
		
					
                    u1.guesser();

					player2=Player.guessing();
					player3=Player.guessing();
					Umpire.compare();
				}
				else {
					System.out.println("Congrats! Player 2 has Won the Game");
				}
			}
			else if(guesser==player3){
				System.out.println("Congrats! Player 3 has Won the Game");
			}
			
			else{
				System.out.println("All the players has LOST the game");
			}
			
			
	}
	
	}
	
	public class GuesserGame {
    
		public static void main(String[] args) {
    
		Umpire u=new Umpire();
		u.guesser();
		u.player();
		u.compare();
    
    
	}

}
