
public class Vault {
	int secretCode;

	public Vault(int setCode) {
		this.secretCode = setCode;
	}

	public static void main(String[] args) {
		Vault v = new Vault(365);

		boolean b = v.tryCode(365);
		System.out.println(b);

	}

	private boolean tryCode(int i) {
		if (i == 365) {

			System.out.println("You opened the vault!");
			return true;
		} else {
			System.out.println("Try again!");
			return false;
		}

	}
}
