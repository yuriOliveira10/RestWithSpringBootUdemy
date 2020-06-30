package br.com.bezeyur.math;

import org.springframework.stereotype.Service;

import br.com.bezeyur.exception.UnsuportedMathOperationException;

@Service
public class SimpleMath {
	
	public  Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}


	public  Double sub(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	public  Double div(Double numberOne, Double numberTwo) {
		if(numberOne == 0 || numberTwo == 0) {
			throw new UnsuportedMathOperationException("Division to 0.");
		}
		
		return numberOne / numberTwo;
	}

	public  Double mul(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	public  Double avg(Double numberOne, Double numberTwo) {
		return sum(numberOne,numberTwo) / 2;
	}
}
