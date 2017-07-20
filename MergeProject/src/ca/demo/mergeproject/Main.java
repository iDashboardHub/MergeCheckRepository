package ca.demo.mergeproject;

public class Main {
	public static void main(String[] args){
		/*Test data = new Test();*/
		displayGreeting();
		/*data.display();*/
	}

	private static void displayGreeting(){
		int data[]={-1,0,4,42,100};
		for(int i:data){
	System.out.println("Hello::"+data[i]);
	System.out.println("Hello::"+i);
		}
	}
}