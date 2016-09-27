package java.model;

public class AdwareModel
{
	/*Variables to complement the model!*/
	private int number;
	private double value;
	private String words;
	private boolean isValid;
	
	/*Getters to complement your variables!*/
	public String getWords(){
		return words;
	}
	public int getNumber(){
		return number;
	}
	public double getValue(){
		return value;
	}
	public boolean isValid(){
		return isValid;
	}
	
	/*Setters to complement your getters!*/
	public void setWords(String words){
		this.words = words;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public void setValue(double value){
		this.value = value;
	}
	public void setValid(boolean isValid){
		this.isValid = isValid;
	}
	
}