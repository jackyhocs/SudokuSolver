import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SolutionSet {
	boolean completed;
	int numFilled;
	boolean slots[];
	int grid[][];
	private final int ARRAYLINES=8;
	
	public void setCompleted(boolean complete){
		this.completed=complete;
	}
	
	public boolean getCompleted(){
		return completed;
	}
	
	public SolutionSet(){
		numFilled=0;
		completed=false;
		//
		for(byte i=0;i<3;++i){
			for(byte j=0;j<3;++j){
				grid[i][j]=0;
			}
		}
	}
	
	public void fillSet(SolutionSet s, int arr[]){
		for(byte i=0;i<9;++i){
			int row = i%9;
			int col =i%3;
			grid[row][col]=arr[i];
		}
	}
	
	void readFile(String fileName) {
		BufferedReader br;
		Scanner scan;
		int[][]inputArr=new int[ARRAYLINES][ARRAYLINES];
		try {
			br = new BufferedReader(new FileReader(fileName));
			scan = new Scanner(br);
			for(byte i=0;i<9;++i){
				for(byte j=0;j<9;++j){
					inputArr[i][j]=Integer.parseInt(scan.next());
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
