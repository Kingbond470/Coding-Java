class GuessGame{
	Player p1;
	Player p2;
	Player p3;

	public void startGame(){
	p1=new Player();
	p2=new Player();
	p3=new Player();
	int player1_guess=0;
	int player2_guess=0;
	int player3_guess=0;
	
	boolean player1_guess_b=false;
	boolean player2_guess_b=false;
	boolean player3_guess_b=false;

	int guess_number=(int)(Math.random()*100);
	// System.out.println("The correct number and have to guess is "+guess_number);
	System.out.println("I'm thinking of a number between 0 and 100");

	while(true){
		System.out.println("Number to guess is "+guess_number);
		System.out.println("");
		p1.guess();
		p2.guess();
		p3.guess();
		
		player1_guess=p1.number;
		player2_guess=p2.number;
		player3_guess=p3.number;
		System.out.println("Player P1, P2 and respectively "+player1_guess+" "+player2_guess+" "+player3_guess);
		if(player1_guess==guess_number) player1_guess_b=true;

		if (player2_guess==guess_number) player2_guess_b=true;

		if (player3_guess==guess_number) player3_guess_b=true;

		if(player1_guess_b || player2_guess_b || player3_guess_b){
			System.out.println("we have winner");
			System.out.println("Each player point respectively "+ player1_guess_b+" "+player2_guess_b+" "+player3_guess_b);
			break;
		}
		else{
			System.out.println("Try guessing again");
			System.out.println(" ");
			}
		}
	}
}

class Player{
int number=0;
public void guess(){
	number =(int)(Math.random()*100);
	System.out.println("I'm guessing "+number);
	}
}

public class GameLauncher{
public static void main(String[] args){
GuessGame game=new GuessGame();
game.startGame();
}
}

