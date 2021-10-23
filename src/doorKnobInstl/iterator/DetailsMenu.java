package doorKnobInstl.iterator;

import doorKnobInstl.Carpenter1;
import doorKnobInstl.Carpenter2;
import doorKnobInstl.CustomerDetails;
import doorKnobInstl.PersonalDetails;

public class DetailsMenu {
	int numberOfItems = 0;
	PersonalDetails[] detailsMenu;
	
	public  DetailsMenu() {
		
		detailsMenu = new PersonalDetails[6];
		
		detailsMenu[0] = new CustomerDetails();
		detailsMenu[1] = new Carpenter1();
		detailsMenu[2] = new Carpenter2();
	}
	
	public Iterator createIterator() {
		return new DetailsMenuIterator(detailsMenu);
	}

}



