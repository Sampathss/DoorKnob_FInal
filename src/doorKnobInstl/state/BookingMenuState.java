package doorKnobInstl.state;

import doorKnobInstl.factory.MenuFactory;

public class BookingMenuState {
	public void status(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
	}

}
