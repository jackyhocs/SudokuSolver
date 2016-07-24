import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solver {
	private final int LINES=9;
	private final int ARRAYLINES=8;
	//fits?
	//recalculate priority
	//load up numbers from input
	public void input(Puzzle p) throws FileNotFoundException{
		String mazePath = "src/text.txt";
		int[][]inputArr=new int[ARRAYLINES][ARRAYLINES];
		//assumes puzzle input is correct
		BufferedReader br=new BufferedReader(new FileReader(mazePath));
		Scanner scan = new Scanner(br);
		for(byte r=0;r<9;++r){
			for(byte c=0;c<9;++c){
				inputArr[r][c]=scan.nextInt();
			}
		}
		scan.close();
		for(byte r=0;r<9;++r){
			for(byte c=0;c<9;++c){
				System.out.println(inputArr[r][c]);
			}
		}
	}
	//output 
	void readFile(String fileName) {
		   
	}
	public static void main(String[] args) throws FileNotFoundException{
		/*Puzzle p = new Puzzle();
		Solver s = new Solver();
		s.input(p);*/
		//make puzzle
		//make 9 sub puzzles
		//make 9 rows and 9 columns
		Solver s = new Solver();
		String fileName="src/text.txt";
		s.readFile(fileName);
		
	}
	
}
