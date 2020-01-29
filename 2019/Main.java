import java.util.ArrayList;

public class FRQ_2019 {

	
	public static void main(String[] args) {
		// FRQ #3
		
		Delimeters d = new Delimeters("(", ")");
		String[] tokens = {"(", "(", ")", "{", "}", ")"};
		ArrayList<String> ourList = d.getDelimitersList(tokens);	
		System.out.println(d.isBalanced(ourList));
	}

}
