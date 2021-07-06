package siniflar.maasHesapla;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Mehmet", 5000, 47, 2021);
		
		employee.tax();
		employee.bonus();
		employee.raiseSalary();
		System.out.println("Adı :" + employee.name +
				"\nMaaşı : " + employee.salary +
				"\nÇalışma Saati : " + employee.workHours + 
				"\nBailangıc Yılı : " + employee.hireYear + 
				"\nVergi : " + employee.vergi + 
				"\nBonus : " + employee.bonusSalary + 
				"\nMaaş Artışı : " + employee.raiseSalary + 
				"\nVergi ve Bonuslarla birlikte Maaşı : " + (employee.salary - employee.vergi + employee.bonusSalary ) +
				"\nToplam Maaş : " + (employee.salary - employee.vergi + employee.bonusSalary + employee.raiseSalary));

	}

}
