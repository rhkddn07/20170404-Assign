package sys;

public class Q1student {

	String college;
	int stuNum;
	
	public void prtInfo() {
		System.out.println("�а� : "+ this.college);
		System.out.println("�й� : "+ this.stuNum);
	}
	
	public static void main(String[] args) {
		
		Q1student stu = new Q1student();
		stu.college = "��ǻ�� ���� ���а�";
		stu.stuNum = 20131603;
		stu.prtInfo();

	}

}
