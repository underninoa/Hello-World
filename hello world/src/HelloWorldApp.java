public class HelloWorldApp{
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Hello \"World\""); // / 뒤 한글자 무시
		System.out.println("Hello World!".replace("World", "job")); // replace 문자 교체
		
		double a = (double)1;
		String b = Integer.toString(1);
		System.out.println(b.getClass());
		
		System.out.println(a);
	}
}