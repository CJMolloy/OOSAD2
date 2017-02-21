package Classes;

public class CategoryB implements SalaryCalculator {

	double salesAmt;
	double baseSal;
	final static double commission = 0.02;
	
	public CategoryB(double sa, double base){
		baseSal = base;
		salesAmt = sa;
	}



	public double getSalary() {
		// TODO - implement CategoryB.getSalary
		throw new UnsupportedOperationException();
		return (baseSalary + (commission * salesAmt));
	}

}
