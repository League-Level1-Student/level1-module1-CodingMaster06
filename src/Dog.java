
public class Dog {
int numberOfToys;
int Age;
String Name = "Charlie";
boolean isSleeping;
String Toys;
boolean leash;

void walk(boolean leash, boolean isSleeping) {
	if (isSleeping == true) {
		System.out.println("Oh no " + Name + " is asleep");
	} 
	if (isSleeping == false) {
		if (leash == true) {
			System.out.println(Name + " is ready for a walk");
		} 
		if (leash == false) {
			System.out.println("We need to get the leash for " + Name + ".");
		}
	}
}
void fetch(int numberOfToys, String Toys) {
	if (numberOfToys <= 5) {
		System.out.println(Name + ", fetch the " + Toys);
	} else {
		System.out.println("Oh no! " + Name + " can't fetch the " + Toys + "!");
	}
}
public static void main(String[] args) {
	
	
}
}
