import java.util.Random;
public class Playing21 {

	public static void main(String[] args) {
		Random myRandom = new Random();
		int cardTotal = 0;
		
		while (cardTotal < 21){
			cardTotal = cardTotal + myRandom.nextInt(10) + 1;
			
			System.out.println(cardTotal);
			
			 }
		
		
		}
	}


