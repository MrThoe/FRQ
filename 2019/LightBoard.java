import java.util.*;

public class LightBulb {
		private boolean[][] lights;
				
		public LightBulb(int numRows, int numCols) {
			lights = new boolean[numRows][numCols];
			for(int i = 0; i < numRows; i++) {
				for(int j = 0; j < numCols; j++) {
					if(Math.random()*100<=40) {
						lights[i][j] = true;
					}					
				}
			}
		}
		public boolean evaluateLight(int row, int col) {
			int count = 0;
			for(int i=0; i < lights[0].length; i++) {
				if(lights[row][i]) {
					count++;
				}
			}
			if(lights[row][col]) { //Condition 1
				if(count%2 == 0) {
					return false;
				}
			} else if(count%3 == 0) {  //Condition 2
				return true;
			} 
			return lights[row][col];   //Condition  3	
		}
}
