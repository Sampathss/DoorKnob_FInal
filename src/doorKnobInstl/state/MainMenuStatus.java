package doorKnobInstl.state;

import java.util.Scanner;


public class MainMenuStatus implements State {

	@Override
	public void status(Context context) {
		@SuppressWarnings("resource")
		Scanner usrInput = new Scanner(System.in);
		
		System.out.print("--------DoorKnob Installation Guide-----\n" + 
		"1) Book Carpenter \n" + 
		"2) Instruction Manual \n" + 
	
		"3) Log Out\n");
		
		System.out.print("");

		int Doorkbinpt = usrInput.nextInt();
		
		if(Doorkbinpt ==1) {
			BookingMenuState bookCarpenter = new BookingMenuState();
			bookCarpenter.status(context);
		}
		
		if(Doorkbinpt ==2) {
			DoorKnobStates states = new DoorKnobStates();

			System.out.println(states);
			states.insertLatch();
			System.out.println(states);
			states.affix();
			System.out.println(states);
			states.secureKnob();
			System.out.println(states);

			states.test();

			System.out.println(states);


			states.refinish();
			System.out.println(states);
		}
		
		else {
			System.exit(0);
		}
		context.setState(this);
	}
		
	

	@Override
	public void insertLatch() {
		
	}

	@Override
	public void affix() {
		
	}

	@Override
	public void secureKnob() {
		
	}

	@Override
	public void test() {
		
	}

	@Override
	public void refinish() {
		
	}

}
