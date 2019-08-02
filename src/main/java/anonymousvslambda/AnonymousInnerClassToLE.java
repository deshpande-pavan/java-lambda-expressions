package anonymousvslambda;

public class AnonymousInnerClassToLE {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("child Thread");
			}
		};

		new Thread(r).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
		}
	}
}
