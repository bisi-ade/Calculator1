package calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		Calc.setOperandOne(10.5);
		Calc.setOperaion("/");
		Calc.setOperandTwo(10.0);
		
		Calc.performOperation();
		
		Calc.setOperandOne(10.5);
		Calc.setOperaion("+");
		Calc.setOperandTwo(10.0);
		Calc.performOperation();
		
		Calc.setOperandOne(10.5);
		Calc.setOperaion("-");
		Calc.setOperandTwo(10.0);
		Calc.performOperation();
		
		Calc.setOperandOne(10.5);
		Calc.setOperaion("*");
		Calc.setOperandTwo(10.0);
		Calc.performOperation();

		

	}

}
