
public class SolutionSet {
	boolean completed;
	int numFilled;
	boolean slots[];
	int grid[][];
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
}
