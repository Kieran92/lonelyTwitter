package ca.ualberta.cs.lonelytwitter;

public abstract class AbstractClassA {
	private int numba;
	
	public  AbstractClassA(int t){
		numba  = t;
	}
	
	public int getNum(){
		return numba;
	}
	
	
	public void setNum(int numba){
		this.numba = numba ;
		}
	abstract public int addten(int number);
	
}
