package libary;

import java.util.ArrayList;
import java.util.List;

public class Porgrapgh {
	private int length;
	private int number;
   private String porgrapghSyntax;

	Word word = new Word();
	List<Word> wordList = new ArrayList<>();
	
//--------------------seters
	public void setLength(int pLength) {
		this.length = pLength;
	}

	public void setNumber(int pLines) {
		this.number = pLines;
	}

	public void setPorgrapghSyntax(String porgrapghSyntax) {
		this.porgrapghSyntax = porgrapghSyntax;
	}
//--------------------geters
	public int getLength() {
		return this.length;
	}

	public int getNumber() {
		return this.number;
	}
	
	public String getPorgrapghSyntax() {
	return porgrapghSyntax;
}

//-----------------prograpgh methods
	void comment() {
	}
	void addToWord() {
		wordList.add(new Word());
	}
}
