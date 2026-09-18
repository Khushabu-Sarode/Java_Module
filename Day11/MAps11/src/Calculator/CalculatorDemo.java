package Calculator;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator<Integer> c1 = new Calculator<>(10,20);
        System.out.println("sum = " + c1.add());
	}

}
