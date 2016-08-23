import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SudokuSolver {

    final static int SUDOKUCONST=9;

    public static void main(String[] args) {

        SudokuSolver s = new SudokuSolver();
        String fileName ="src/text.txt";
        /*int baseGrid[][]={ { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, //

                { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, //

                { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, //

                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, //

                { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, //

                { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, //

                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, //

                { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, //

                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };*/
        int baseGrid[][]=new int[9][9];
        baseGrid=readFile(fileName);
        s.solve(baseGrid, 0, 0);
    }

    static int[][] readFile(String fileName) {
		BufferedReader br;
		Scanner scan;
		int[][]inputArr=new int[SUDOKUCONST][SUDOKUCONST];
		try {
			br = new BufferedReader(new FileReader(fileName));
			scan = new Scanner(br);
			for(byte i=0;i<9;++i){
				for(byte j=0;j<9;++j){
					inputArr[i][j]=Integer.parseInt(scan.next());
				}
			}
			scan.close();
			return inputArr;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
    
    public void solve(int[][] baseGrid, int row, int col){

        int copy[][]= gridDup(baseGrid);

        if( row > 8 ){
            System.out.println( "Solution found" ) ;
            printPuzzle(copy);
            System.exit(0);
        }

        if( copy[row][col] != 0 ){
            findNext( copy,row, col ) ;
        }else {
            for( int num = 1; num < 10; num++ ){
                if(doesItFit(copy,col,row,num)){
                    copy[row][col] = num ;
                    findNext(copy, row, col);
                }
            }

 
            // No valid number was found
            copy[row][col] = 0 ;
        }
    }


    void findNext(int[][] baseGrid,int row, int col){

        if(col==8){
            solve(baseGrid, row+1,0);
        }else{
            solve(baseGrid,row,col+1);
        }
    }


    int [][] gridDup(int src[][]){

        int [][] copy=new int [SUDOKUCONST][SUDOKUCONST];
        
        for(byte i=0;i<SUDOKUCONST;i++){
            for(byte j=0;j<SUDOKUCONST;j++){
                copy[i][j]=src[i][j];
            }
        }
        return copy;
    }
 

    private void printPuzzle(int[][] baseGrid){
    	
        for(byte i=0;i<SUDOKUCONST;i++){
            for(byte j=0;j<SUDOKUCONST;j++){
                System.out.print(baseGrid[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
 

    private boolean doesItFit(int[][] baseGrid,int col, int row, int value){
        //checks if value exists in the same column
        for(byte i=0;i<SUDOKUCONST;i++)
            if(baseGrid[i][col]==value)
                return false;

        //checks if value exists in the same row
        for(byte j=0;j<SUDOKUCONST;j++)
            if(baseGrid[row][j]==value)
                return false;

        //checks if value exists in the same mini 3x3 grid
        int lowerX=3*(col/3);
        int lowerY=3*(row/3);
        int highX=lowerX+2;
        int highY=lowerY+2;

        for(int y =lowerY;y<highY;y++)
            for(int x=lowerX;x<highX;x++)
                if(baseGrid[y][x]==value)
                    return false;

        return true;
    }
}