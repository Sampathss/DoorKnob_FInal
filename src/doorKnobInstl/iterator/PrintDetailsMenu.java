package doorKnobInstl.iterator;

import doorKnobInstl.PersonalDetails;

public class PrintDetailsMenu {
	DetailsMenu detailsMenu;
	PersonalDetails personalDetails;
	
	public PrintDetailsMenu(DetailsMenu detailsMenu) {
		this.detailsMenu = detailsMenu;
	}
	
	public void printMenu() {
		Iterator iterateDetailsMenu = detailsMenu.createIterator();
		printMenu(iterateDetailsMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------DETAILS MENU-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			PersonalDetails  personalDetails= (PersonalDetails) iterator.next();
			  
			  System.out.print(personalDetails.getPersonName() + "\t");
			  System.out.print(personalDetails.getEmail() + "\t");

			  System.out.print(personalDetails.getMobileNum()+"\t");
			  System.out.print(personalDetails.getSlot() + "\t");

			  System.out.println(" $"+personalDetails.getCost()+"\n");
			
		}
		 
	}
}


