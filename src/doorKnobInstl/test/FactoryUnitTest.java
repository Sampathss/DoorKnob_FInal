package doorKnobInstl.test;

import doorKnobInstl.*;
import doorKnobInstl.factory.MenuFactory;
import doorKnobInstl.state.Context;

@SuppressWarnings("unused")
public class FactoryUnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		MenuFactory testFactory = new MenuFactory();
		testFactory.chooseMenu();

	}
}
