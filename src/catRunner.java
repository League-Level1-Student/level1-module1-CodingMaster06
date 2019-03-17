
public class catRunner {
public static void main(String[] args) {
	Cat cat = new Cat("Tom");
	cat.meow();
	cat.printName();
	for (int i = 1; i < 10; i++) {
		cat.kill();
	}
	
}
}
