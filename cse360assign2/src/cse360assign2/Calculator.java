/* Matthew Holguin
 * 406
 * Simulates the operations of a calculator
 * 
 */
package cse360assign2;

// Testing Git

//contains the functions for calculator operations
public class Calculator {

	//keeps track of total value
	private int total;
	
	//history string used to keep track of history operations
	private String historyString;
	
	//calculator constructor that initiates the total value
	public Calculator () {
		total = 0;  // not needed - included for clarity
		historyString = "0";
	}
	
	//gets the total value
	public int getTotal () {
		return total;
	}
	
	//adds value to total
	public void add (int value) {
		total = total + value;
		historyString = historyString + " + " + value;
	}
	
	//subtracts value from total
	public void subtract (int value) {
		total = total - value;
		historyString = historyString + " - " + value;
	}
	
	//multiplies total by value
	public void multiply (int value) {
		total = total * value;
		historyString = historyString + " * " + value;
	}
	
	//divides total by value
	public void divide (int value) {
		if(value == 0) {
			total = 0;
			historyString = historyString + " / 0";
		}
		else {
			total = total / value;
			historyString = historyString + " / " + value;
		}
	}
	
	//gets history of past operations used
	public String getHistory () {
		return historyString;
	}
}
