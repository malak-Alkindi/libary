package libary;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private int number;
	private String name;
	public int porgrapghIndex;
	Porgrapgh poergraoh = new Porgrapgh();
	List<Porgrapgh> PorgrapghList = new ArrayList<>();

	// ----------------------seters
	public void setNumber(int no) {
		this.number = no;
	}

	public void setName(String chName) {
		this.name = chName;
	}

	// ---------------------geters
	public int getNumber() {
		return this.number;
	}

	public String getName() {

		return name;
	}
	
	//--------------------methods
	public void addToPorgrapghList(int numbersOfPorgrap) {
		porgrapghIndex=numbersOfPorgrap;
		for(int i=0;i<numbersOfPorgrap;i++) {
		PorgrapghList.add(new Porgrapgh());
		}
	}
}
