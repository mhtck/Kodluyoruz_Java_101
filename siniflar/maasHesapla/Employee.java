package siniflar.maasHesapla;


public class Employee {
	
	String name;
	float salary;
	int workHours;
	int hireYear;
	float vergi;
	float bonusSalary;
	float raiseSalary;
	
	public Employee(String name, float salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	void tax() {
		if(this.salary > 1000) {
			this.vergi = (float) (this.salary * 0.03);
		}
	}
	
	void bonus() {
		if(this.workHours > 40) {
			this.bonusSalary = (float) ((this.workHours - 40) * 30);
		}
	}
	
	void raiseSalary() {
		int workYear = 2021 - this.hireYear;
		if(workYear < 10) {
			raiseSalary = (float) (this.salary * 0.1);
		}else if(workYear > 9 && workYear < 20) {
			raiseSalary = (float) (this.salary * 0.3);
		}else if(workYear > 19) {
			raiseSalary = (float) (this.salary * 0.5);
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ ", vergi=" + vergi + ", bonusSalary=" + bonusSalary + "]";
	}
	
	
	
}
