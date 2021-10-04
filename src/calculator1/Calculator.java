package calculator1;

// Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	
	public Calculator() {
		
	}
	public Calculator(double operandOne, double operandTwo,  String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
		
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void setOperaion(String operation) {
		this.operation = operation;
	}
	
	
	
//	Have logic for adding and subtracting
	public void performOperation() {
		if(operation == "+") {
			System.out.println(operandOne+operandTwo);
		} else if(operation == "-") {
			System.out.println(operandOne-operandTwo);
		} else if(operation == "/") {
			System.out.println(operandOne/operandTwo);
		} else if(operation == "*") {
			System.out.println(operandOne*operandTwo);
	}
	}

}
