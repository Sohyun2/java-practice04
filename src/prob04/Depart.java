package prob04;

public class Depart extends Employee {

	private String department;
	
	public Depart(String name, int salary, String department) {
		super.setName(name);
		super.setSalary(salary);
		this.department = department;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름: %s\t 연봉: %d\t 부서: %s", super.getName(), super.getSalary(), department);
	}
}
