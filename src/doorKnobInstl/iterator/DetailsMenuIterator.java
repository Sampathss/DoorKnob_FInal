package doorKnobInstl.iterator;

import doorKnobInstl.PersonalDetails;

public class DetailsMenuIterator implements Iterator{
	PersonalDetails[] detailsMenu;
	int position;
	
	public DetailsMenuIterator(PersonalDetails[] detailsMenu) {
		this.detailsMenu = detailsMenu;
	}
	
	public boolean hasNext() {
		if(position > detailsMenu.length || detailsMenu[position] == null) {
			return false;
		}
		else return true;
	}

	public PersonalDetails next() {
		
		PersonalDetails detailsMenustatus = (PersonalDetails) detailsMenu[position];
		position = position +1;
		
		return detailsMenustatus;
	}

}


