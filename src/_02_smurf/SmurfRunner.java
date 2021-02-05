package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf ("Handy");
		Smurf papa = new Smurf ("Papa Smurf");
		Smurf smurfette = new Smurf ("Smurfette");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
}
