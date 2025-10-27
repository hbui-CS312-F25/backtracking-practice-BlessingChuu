public class Word{


	/**
	* @param solution current word
	* @param remaining remaining letters
	*/

	public static void permutation(String solution, String remaining, int k){
	//BASE CASE.. if remaining is empty, print solution
		if (solution.length() == k){
			System.out.println(solution);
		}
		if(remaining.length() == 0){
			return;
		}

		else{

			char ch = remaining.charAt(0);
			remaining = remaining.subtring(1);
			solution = solution + ch;
			combination(solution, remaining, k);
			solution = solution.substring(0, solution.length()-1);
			combination(solution, remaining, k);
		}
	}
	
				//create new strings to pass to the recursive method			
				
				//String  nextRemaining = remaining.substring(0, i) + remaining.substring(i+1);
				// remove ch from remaining
				



				//ADD CHAR TO SOLUTION
				//String nextSolution = solution + ch;


				//calls itself to continue recursion
				//permutation(nextSolution, nextRemaining);

			}
	

	public static void main(String [] args){
		//Checking if the args is empty
		if(args.length != 1){
			System.out.println("Usage: java Word yourword");
			return;
		}
		else{
			int k = 2;
			String word = new String(args[0]);

			String empty = new String("");

			permutation(empty, word);
		}

	}

}
