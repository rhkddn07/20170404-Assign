package sys;

public class Q2student {

	private String college;
	private int stuNum;
	
	public void setter(String col, int num) {
		this.college = col;
		this.stuNum = num;
	}
	
	public void getter() {
		System.out.println("�а� : "+ this.college);
		System.out.println("�й� : "+ this.stuNum);
	}
	
	
	public static void main(String[] args) {
		
		Q2student stu = new Q2student();
		stu.setter("��ǻ�� ���� ���а�", 20131603);
		stu.getter();

	}

}