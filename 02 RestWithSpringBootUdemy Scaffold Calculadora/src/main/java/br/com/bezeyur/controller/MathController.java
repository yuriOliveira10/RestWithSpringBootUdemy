package br.com.bezeyur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bezeyur.converters.NumericConverter;
import br.com.bezeyur.exception.UnsuportedMathOperationException;
import br.com.bezeyur.math.SimpleMath;

@RestController
public class MathController {
	
	@Autowired
	private SimpleMath math;
	
	@Autowired
	private NumericConverter numConverter;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!numConverter.isNumeric(numberOne) || !numConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double sum = math.sum(numConverter.convertToDouble(numberOne),numConverter.convertToDouble(numberTwo));
		
		return sum;	
	}

	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!numConverter.isNumeric(numberOne) || !numConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double sub = math.sub(numConverter.convertToDouble(numberOne),numConverter.convertToDouble(numberTwo));
		
		return sub;	
	}
	
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!numConverter.isNumeric(numberOne) || !numConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double mul = math.mul(numConverter.convertToDouble(numberOne),numConverter.convertToDouble(numberTwo));
		
		return mul;	
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!numConverter.isNumeric(numberOne) || !numConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double div = math.div(numConverter.convertToDouble(numberOne),numConverter.convertToDouble(numberTwo));
		
		return div;	
	}
	
	@RequestMapping(value="/avg/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double avg(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!numConverter.isNumeric(numberOne) || !numConverter.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double avg = math.avg(numConverter.convertToDouble(numberOne),numConverter.convertToDouble(numberTwo));
		
		return avg;	
	}
	
	@RequestMapping(value="/sqr/{number}", method=RequestMethod.GET)
	public Double sqr(@PathVariable("number") String number) throws Exception {
		if(!numConverter.isNumeric(number)) {
			throw new UnsuportedMathOperationException("Please set a numeric value.");
		}
		
		Double sqr = (Double) Math.sqrt(numConverter.convertToDouble(number));
		
		return sqr;	
	}
	
}
