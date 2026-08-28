package AbstarctionExample;

public class Task implements Calculator {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	public static void main(String[] args) {

		Calculator a=new Task();
		a.add(10,20);

	}
}



