public class Solver {
	
	//fits?
	//recalculate priority
	//load up numbers from input
	//output 
	
	public static void main(String[] args){
		//Solver s = new Solver();
		//make puzzle
		//make 9 sub puzzles
		//make 9 rows and 9 columns
		SolutionSet s = new SolutionSet();
		String fileName="src/text.txt";
		s.readFile(fileName);
		
	}
	/*gameLoop(SolutionSet s) takes in a solutionset and then keeps on adding in new stuff until the solutionset is completed.
	 * gameLoop: SolutionSet -> End of Program
	 */
	public void gameLoop(SolutionSet s){
		boolean completed = s.getCompleted();
		while(!completed){
			
		}
		System.out.println("Completed");
		//print out the shit
		System.exit(0);
	}
	/*fits(SolutionSet s, int in) takes in a puzzle and checks if a certain number fits
	 * returns an integer if it fits or not. 
	 */
	
	/*checkNext()
	 * 
	 */
	
	/*slotsLeft(SolutionPart sP) takes in a solution part and then returns the number of integers that need to be filled
	 * numberLeft: SolutionPart -> Integer
	 */
	public int slotsLeft(SolutionPart sP){
		int counter=0;
		for(byte i=0;i<9;i++){
			if(sP.getNumbers(i))counter++;
		}
		return counter;
	}
	
	/*returnLastNumber(int []array) returns the value that needs to be filled in
	 * returnLastNumber: array of Integers -> Integer
	 */
	public int returnLastNumber(int []array){
		int retNum=45;
		for(byte i=0;i<9;i++)
			retNum-=array[i];
		return retNum;
	}
	
	public int howManyRemain(int []array){
		int retNum=0;
		for(byte i=0;i<9;i++){
			if(array[i]==0)retNum++;
		}
		return retNum;
	}
}
