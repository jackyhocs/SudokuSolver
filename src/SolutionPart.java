
public class SolutionPart {
	boolean numbers[];
	int partFilled;
	
	public SolutionPart(){
		
	}
	
	public boolean getNumbers(int i){
		return this.numbers[i-1];
	}
	
	public void setNumbers(int i){
		this.numbers[i-1]=true;
	}
}
