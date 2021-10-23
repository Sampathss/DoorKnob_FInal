package doorKnobInstl.factory;

import java.util.Scanner;

import doorKnobInstl.iterator.DetailsMenu;
import doorKnobInstl.iterator.PrintDetailsMenu;
import doorKnobInstl.state.Context;
import doorKnobInstl.state.MainMenuStatus;



public class MenuFactory {
	public void chooseMenu() {
		@SuppressWarnings("resource")
		Scanner usrInput = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Add Details\n"+
		"2) Home Screen" );
		
		
		int menuChoice = usrInput.nextInt();
		
		
		if(menuChoice ==1) {
			DetailsMenu detailsMenu = new DetailsMenu();
			PrintDetailsMenu prntdtlmnu = new PrintDetailsMenu(detailsMenu);
			
			prntdtlmnu.printMenu();
		}
		
		else {
			Context context = new Context();
			MainMenuStatus goHome = new MainMenuStatus();
			goHome.status(context);
		}
		
		
		

}
}