package libary;

public class Book {
	private String author;
	private String type;
	private Integer id;
int chapterArryLength;

	Chapter[] chptr ;

	Chapter[] assignNewChapter(int r) {
		chapterArryLength=r;
	 chptr = new Chapter[r];

		for (int i = 0; i < chptr.length; i++) {
			chptr[i] = new Chapter();

		}
		return chptr;
	}
	Chapter[] getChapterArray() {
		return chptr;
	}
	// ---------------------------------seters
	public void setAuthor(String name) {
		author = name;

	};

	public void setBookType(String bookType) {

		type = bookType;
	};

	public void setId(int idNo) {
		id = idNo;
	}

	// ---------------------------------geters
	public String getAuther() {
		if (author == null) {
			return Errors.valueNotAssigned();
		} else {
			return author;
		}
	};

	public String getType() {

		if (type == null) {
			return Errors.valueNotAssigned();
		} else {
			return type;
		}
	};

	public void checkId(int idNo) {
		if (this.id == null) {
			Errors.valueNotAssigned();
		} else {
			this.getId();
		}
	}

	public int getId() {

		return this.id;
	}

}// class book close bracket
