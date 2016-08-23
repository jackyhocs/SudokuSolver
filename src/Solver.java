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
		/*
		 * Initialize 2D array with 81 empty grids (nx = 9, ny = 9)
 Fill in some empty grid with the known values
 Make an original copy of the array
 Start from top left grid (nx = 0, ny = 0), check if grid is empty
 if (grid is empty) {
   assign the empty grid with values (i)
   if (no numbers exists in same rows & same columns same as (i) & 3x3 square (i) is currently in)
     fill in the number
   if (numbers exists in same rows & same columns same as (i) & 3x3 square (i) is currently in)
     discard (i) and repick other values (i++)
 }
 else {
   while (nx < 9) {
     Proceed to next row grid(nx++, ny)
     if (nx equals 9) {
       reset nx = 1
       proceed to next column grid(nx,ny++)
       if (ny equals 9) {
         print solution
       }
     }
   }
 }
		 */
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
