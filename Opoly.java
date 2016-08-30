
public class Opoly{	
	private int boardSize;
	private int pos=0;
	private int move=0;
	private int rounds=0;
	private int reward=10;
	
	public void playGame(){
		while(!(isGameOver())){
			spinAndMove();
			if(pos==boardSize-1){
				reward=reward/3;
				pos=0;
			}
			else{
				if(pos%4==0){
					reward=reward*2;
				}
			}
			rounds++;
			drawBoard();
		}
		displayReport();
	}
	
	public Opoly(int bs){
		boardSize=bs;
	}
	
	private void Spin(){
		move=(int)(Math.random()*5)+1;
	}
	
	private void Move(){
		pos+=move;
	}
	
	private void spinAndMove(){
		Spin();
		if((pos+move)<=boardSize){
		Move();
		}
	}
	
	private boolean isGameOver(){
		boolean Over=false;
		if(pos==boardSize){
			Over=true;
		}
		return Over;
	}
	
	private void drawBoard(){		
		for(int i=1; i<=boardSize; i++)
		{
			if(pos==i){
				System.out.print("O");
			}
			else{
				System.out.print("*");
			}
		}
		System.out.print(" "+reward);
		System.out.println();
	}
	
	private void displayReport(){
		System.out.println("Game Over");
		System.out.println("-------------");
		System.out.println("Rounds of play: "+rounds);
		System.out.println("Final Reward: "+reward);
	}
}
