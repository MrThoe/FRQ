import java.util.ArrayList;

public class Delimeters {
	
	private String openDel;
	private String closeDel;
	public int theCount;
	
    public Delimeters(String openD, String closeD) {
    	openDel = openD;
    	closeDel = closeD;
    }
	
	public ArrayList<String> getDelimitersList(String[] tokens){
		//COMPLETE FOR PART A
		ArrayList<String> arrayOut = new ArrayList();
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i] == openDel || tokens[i] == closeDel) {
				arrayOut.add(tokens[i]);
			}
		}		
		return arrayOut;
	}
	
	public boolean isBalanced(ArrayList<String> delimeters) {
		int count = 0;
		for(int i = 0; i < delimeters.size(); i++) {
			if(delimeters.get(i).equals(openDel)) {
				System.out.println("OPEN");
				count++;
			} else {
				System.out.println("CLOSED");
				count--;
			}
			if(count < 0) {
				return false;
			}
		}
		if(count != 0) {
			return false;
		}
		return true;
	}
	
}
