package br.com.bezeyur.math;

import br.com.bezeyur.exception.UnsuportedMathOperationException;

public class SimpleMath {
	
	public static Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}


	public static Double sub(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	public static Double div(Double numberOne, Double numberTwo) {
		if(numberOne == 0 || numberTwo == 0) {
			throw new UnsuportedMathOperationException("Division to 0.");
		}
		
		return numberOne / numberTwo;
	}

	public static Double mul(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	public static Double avg(Double numberOne, Double numberTwo) {
		return sum(numberOne,numberTwo) / 2;
	}
}
