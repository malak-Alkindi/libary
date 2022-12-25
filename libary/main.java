package libary;

import java.util.HashMap;
import java.util.Scanner;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner longInput = new Scanner(System.in).useDelimiter("\n");
		boolean conditon = true;
		String check = "";
		int arrayListIndex = 0;
	
		boolean checkState = true;
	
		List<Book> books = new ArrayList<>();

		System.out.println("create object changing of class book ? y/n");
	check = sc.nextLine().toLowerCase();
			
		while (conditon) {

			while (checkState) {
			

				if (Errors.checkInput(check.equals("y"), check.equals("n"))) {

					if (check.equals("n")) {
						System.out.println("bye !!");
						conditon = false;
						checkState = false;
					
					} else {
					
						boolean checkResponseWord = true;

						books.add(new Book());
						books.get(arrayListIndex).setId(arrayListIndex);
						System.out.println();

						System.out.println("------------------------libary----------------------");
						System.out.println("enter the  book author name");

						Book booksList = books.get(arrayListIndex);
						booksList.setAuthor(sc.nextLine());

						System.out.println("enter the number of chapters in this book");
						booksList.assignNewChapter(sc.nextInt());

						for (int chapterIndex = 0; chapterIndex < booksList.chptr.length; chapterIndex++) {

							System.out.println("enter the number of porgraphs in chapter " + (chapterIndex + 1));
							booksList.chptr[chapterIndex].addToPorgrapghList(sc.nextInt());

							for (int pi = 0; pi < booksList.chptr[chapterIndex].PorgrapghList.size(); pi++) {
								boolean wordCheckState = true;
								int wordListIndex = 0;
								System.out.println("write syntax of the porgraph number (" + (pi + 1) + ") in chapter ("
										+ (chapterIndex + 1) + ")");
								booksList.chptr[chapterIndex].PorgrapghList.get(pi).setPorgrapghSyntax(longInput.next());
								sc.nextLine()		;
								System.out.println("enter the word type ");	
								booksList.chptr[chapterIndex].PorgrapghList.get(pi).addToWord();

								booksList.chptr[chapterIndex].PorgrapghList.get(pi).wordList.get(wordListIndex).setType(sc.nextLine());
								String responce="";
while(wordCheckState) {
	
	System.out.println("do you want to add new word type ?y/n");
								 responce=sc.next().toLowerCase();


	if(Errors.checkInput(responce.equals("y"), responce.equals("n"))){
	
	if(responce.equals("y")) {
		wordCheckState=true;
		wordListIndex++;
		System.out.println("enter the word type ");	
		booksList.chptr[chapterIndex].PorgrapghList.get(pi).addToWord();

		booksList.chptr[chapterIndex].PorgrapghList.get(pi).wordList.get(wordListIndex).setType(sc.next());
	

	}
	else {
		wordCheckState=false;
		checkResponseWord=false;
	}
	}else {
		System.out.print("(pls enter avalid input)");
	
	}
								}
}
							}

						
					
						System.out.println();
						System.out.println("----------------------------------------------");
						System.out.println("book number: " + (arrayListIndex + 1));

						System.out.println("book author :" + booksList.getAuther());

						System.out.println("number of chapter :" + booksList.chapterArryLength);
						for (int chapterIndex = 0; chapterIndex < booksList.chapterArryLength; chapterIndex++) {
							System.out.println();
							System.out.println("chapter(" + (chapterIndex + 1) + ")");

							System.out.println(
									"numebrs of porgrapghs   :" + booksList.chptr[chapterIndex].porgrapghIndex);
							for (int porgraphIndex = 0; porgraphIndex < booksList.chptr[chapterIndex].PorgrapghList.size(); porgraphIndex++) {
								System.out.println();
								System.out.println("   porgrapgh number(" + (porgraphIndex + 1) + ") :"
										+ booksList.chptr[chapterIndex].PorgrapghList.get(porgraphIndex)
												.getPorgrapghSyntax());
								System.out.println();
								
								
								String verpsList="";
							
								for(int y=0;y< booksList.chptr[chapterIndex].PorgrapghList.get(porgraphIndex).wordList.size();y++) {
									 verpsList=verpsList+(booksList.chptr[chapterIndex].PorgrapghList.get(porgraphIndex).wordList.get(y).getType())+", ";
								}
								System.out.println("   most accuring word type :"
										+ verpsList);
							}
						}
						System.out.println();
						System.out.println("----------------------------------------------");
						System.out.println("do you want add another book ? y or n ");
						check = sc.next().toLowerCase();
						arrayListIndex++;
					}
				} else {
					System.out.println("pls enter avalid input y or n");
					check = sc.nextLine().toLowerCase();
				
					
				}
			}

		}
		System.out.println();
		System.out.println(Errors.ANSI_PURPLE+"**************** libary report ******************");
		System.out.println();
		for (int i = 0; i < books.size(); i++) {
			System.out.println(Errors.ANSI_BLACK+"                      book number (" + (i + 1) + ")");
			System.out.println(Errors.ANSI_BLUE+"book author :" +Errors.ANSI_GREEN+ books.get(i).getAuther());
			System.out.println(Errors.ANSI_BLUE+"number of chapter:" +Errors.ANSI_GREEN+books.get(i).chptr.length);
			System.out.println();
			for (int chapterIndex = 0; chapterIndex < books.get(i).chptr.length; chapterIndex++) {
				
				System.out.println(Errors.ANSI_BLACK+"        chapter(" + (chapterIndex + 1) + ")"+Errors.ANSI_BLACK);
				System.out.println(Errors.ANSI_RED+"                    numebrs of porgrapghs   :"
						+ books.get(i).chptr[chapterIndex].PorgrapghList.size()+Errors.ANSI_BLACK);
				System.out.println();
				
				for (int pi = 0; pi < books.get(i).chptr[chapterIndex].PorgrapghList.size(); pi++) {
					String verpsList="";
					for(int y=0;y< books.get(i).chptr[chapterIndex].PorgrapghList.get(pi).wordList.size();y++) {
						 verpsList=verpsList+(books.get(i).chptr[chapterIndex].PorgrapghList.get(pi).wordList.get(y).getType())+", ";
					}
					System.out.println(Errors.ANSI_BLUE+"                    most accuring words type :"+
							Errors.ANSI_GREEN+ verpsList);
				
					System.out.print(Errors.ANSI_BLUE+"                    porgrapgh number(" + (pi + 1) + ") :"
						);
					System.out.println(Errors.ANSI_BLACK+books.get(i).chptr[chapterIndex].PorgrapghList.get(pi).getPorgrapghSyntax()+Errors.ANSI_RESET);
				}
			}
			System.out.println();
			System.out.println("----------------------------------------------");
		}

	}

}
