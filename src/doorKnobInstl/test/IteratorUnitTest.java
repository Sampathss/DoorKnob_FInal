package doorKnobInstl.test;

import doorKnobInstl.*;
import doorKnobInstl.iterator.DetailsMenu;
import doorKnobInstl.iterator.Iterator;

@SuppressWarnings("unused")
public class IteratorUnitTest {
	public static void main(String[] args) {
		DetailsMenu detailsMenu = new DetailsMenu();
		Iterator iterator = detailsMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
