package Classes;

public class CategoryA implements SalaryCalculator {


double baseSal;
double OT;

public CategoryA(double base, double over){
baseSal = base;
OT = over;

}

	public double getSalary() {
		// TODO - implement CategoryA.getSalary
		throw new UnsupportedOperationException();
		return (baseSal * OT);
	}

}
