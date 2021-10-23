package doorKnobInstl.main;

import doorKnobInstl.state.Context;
import doorKnobInstl.state.MainMenuStatus;

public class Home {
	public static void main(String[] args) {
		Context context = new Context();
		
		MainMenuStatus startUp = new MainMenuStatus();
		startUp.status(context);
	
	}
}


