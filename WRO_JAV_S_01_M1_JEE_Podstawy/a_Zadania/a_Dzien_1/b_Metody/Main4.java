public class Main4 {

	static String createName(String name, String surname, String nickname) {
		return name+ " \"" + nickname + "\" " + surname;	
	}
    public static void main(String[] args) {
       System.out.println(createName("John", "Doe", "JD")); 

    }
}
