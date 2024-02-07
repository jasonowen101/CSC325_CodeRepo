import java.util.ArrayList;

public class Startup {
	private ArrayList<String> locationCells;
	private void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}
	private String checkYourself (String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				} else {
				result = "hit";
			}
		}
		return result;
	}
}
				
