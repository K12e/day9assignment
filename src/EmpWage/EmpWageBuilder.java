package EmpWage;

public class EmpWageBuilder{
	
	public static final int parttime=1;
	public static final  int isfulltime=2;
	public static final int emprateperhr=20;
	public static final int totalworkingdays=2;
	public static final int  maxhrsinmonth=10;
	
	public static int computeEmpWage() {
		int emphrs=0,totalemphrs=0,totalworkingdays=0;
		while(totalemphrs<= maxhrsinmonth && totalworkingdays < totalworkingdays)
		{
			totalworkingdays++;
			int empcheck=(int) Math.floor(Math.random()* 10)%3;
			switch(empcheck)
			{
			case parttime:
				emphrs=4;
				break;
			case isfulltime:
				emphrs=8;
				break;
			default:
				emphrs=0;
				}
			totalemphrs+=emphrs;
			System.out.println(" "+ totalworkingdays +" emp hr" +emphrs);
		}
		int totalempwage=totalemphrs * emprateperhr;
		System.out.println("total emp wage "+totalempwage);
		return totalempwage;
		}
	public static void main(String[] args) {
		computeEmpWage();
	}
}
