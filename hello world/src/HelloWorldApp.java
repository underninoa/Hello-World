public class HelloWorldApp{
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Hello \"World\""); // / �� �ѱ��� ����
		System.out.println("Hello World!".replace("World", "job")); // replace ���� ��ü
		
		double a = (double)1;
		String b = Integer.toString(1);
		System.out.println(b.getClass());
		
		System.out.println(a);
	}
}