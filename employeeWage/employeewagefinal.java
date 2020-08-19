public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour;
			int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
public class CompanyEmpWage {

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		
		this.company = company;
		this.empRatePerHour = empRateHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		totalEmpWage = 0
	}
	
	pubic void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString() {
		return "Tatal Emp Wage for Company: " +company+" is: "+
			totalEmpWage;
	}
}
	public class EmpWageBuilder implements IComputerEmpWage {
		public static final int IS_PART_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		private int numOfCompany = 0;
		private LinkedList<CompanyEmpWage>companyEmpWageList;
		private Map<String,CompanyEmpWage> companyToEmpWageMap;
		
		public EmpWageBuilder() {
			companyEmpWageList = new LinkedList<>();
			companyToEmpWageMap = new HashMap<>();
		}
		
		public void addCompanyEmpWage(String Company, int empRatePerHour, int numOfWoringDays, int maxHoursPerMonth) {
			CompanyEmpWage companyEmpWage = new CompnayEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
			
			companyEmpWageList.add(companyEmpWage);
			companyToEmpWageMap.put(company, companyEmpWage);
		}
		
		public void computeEmpWage(){
			for (int i =0; i < companyEmpWageList.size(); i++) {
				companyEmpWage companyEmpWage =companyEmpWageList.get(i);
				companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
				System.out.println(companyEmpWage);
			}
}

public void computeEmpWage() {
	for {int i = 0; i < companyEmpWageList.size(); i++) {
		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		compEmpage.setTotalEmpWage(this.comuteEmpWage(companyEmpWage));
		Syster.out.println(compnayEmpWage));
	}
}
public void getTotalWage(String company) {
	return CompanyToEmpWageMap.get(company).totalEmpWage;
}
public int computeEmpWage(CompanyEmpWage companyEmpWage) 
public static void main(String[] args) {
	IComputeEmpWage empWageBuilder = new EmpWageBuilder();
	empWageBuilder.addCompanyEmpWage( company: "Beg", empRatePerHour: 20, numOfWorkingDays: 2, maxHoursPerMonth: 10);
	empWageBuilder.addCompanyEmpWage( company: "Reliance", empRatePerHour: 10, numOfWorkingDays: 4, maxHoursPerMonth: 20);
	empWageBuilder.computeEmpWage();
	Syatem.out.println("Total Wage for Beg Company: "+ empWageBuilder.getTotalWage( company: "Beg")};
	}
}