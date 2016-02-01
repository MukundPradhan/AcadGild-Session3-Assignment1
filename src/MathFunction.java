
public class MathFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num=4;
		
		
		MathFunction.sqrt(num);
		
		
		MathFunction.cbrt(num);
		
		
	}
	
	static  void sqrt(double no){
		System.out.println("The square root of " + no + " is : " + java.lang.Math.sqrt(no)  );
	}

	static void cbrt(double no){
	System.out.println("The cube root of " + no + " is : " + java.lang.Math.cbrt(no));
	
	}

}
