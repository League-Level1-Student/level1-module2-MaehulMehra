package _06_tea_party;
/**
 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
 * George Orwell is a man, so say “Hello Mr. Orwell”. 
 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
 **/

public class TeaParty {
	public String welcome (String name, boolean isWoman, boolean isKnighted) {
		String greeting = "Hello " ;
		if (isWoman) {
			if (isKnighted) {
				greeting = greeting + "Lady ";
			}
			else {
				greeting = greeting + "Ms. "; 
			}
		}
		else {
			if (isKnighted) {
				greeting = greeting + "Sir ";
			}
			else {
				greeting = greeting + "Mr. ";
			}
		}
		greeting = greeting + name;
        return greeting;
    }
}
