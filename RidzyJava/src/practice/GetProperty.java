package practice;

public class GetProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current directory path: ");
		System.out.println(System.getProperty("user.dir"));

		System.out.println("java.version");
		System.out.println(System.getProperty("java.version"));

		System.out.println("java.vendor: ");
		System.out.println(System.getProperty("java.vendor"));

		System.out.println("java.vendor url: ");
		System.out.println(System.getProperty("java.vendor.url"));

		System.out.println("java path: ");
		System.out.println(System.getProperty("java.class.path"));
	}

}
