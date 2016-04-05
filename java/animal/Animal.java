package animal;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Behaviour man = new Behaviour();
		man.sounding();
		man.walking();
		Human woman = new Human();
		woman.sounding("Beeee");
	}

}
