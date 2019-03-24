
public class jamesBond {
	public static void main(String[] args) {
		jamesBond jb = new jamesBond();
		Vault v = new Vault(365);
		int a = jb.findCode(v);
		System.out.println(a);

	}

	private int findCode(Vault v) {
		boolean b1 = false;
		for (int i = 0; i <= 100000; i++) {
			if (i == v.secretCode) {

				b1 = true;

			}

		}
		if (b1 == true) {
			System.out.println(v.secretCode);
			return v.secretCode;
		} else {
			return -1;
		}

	}
}
