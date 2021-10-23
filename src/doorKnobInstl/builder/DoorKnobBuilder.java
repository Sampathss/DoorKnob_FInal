package doorKnobInstl.builder;

import java.util.ArrayList;
import java.util.List;

import doorKnobInstl.DoorKnob;

public abstract class DoorKnobBuilder {
	protected String name;
	protected List<String> tools = new ArrayList<String>();
	public abstract DoorKnobBuilder addScrews();
	public abstract DoorKnobBuilder addLatch();
	public abstract DoorKnobBuilder addDoorKnob();
	public abstract DoorKnobBuilder addDrillingMachine();
	public abstract DoorKnobBuilder addScrewDriver();
	public abstract DoorKnobBuilder addHammer();
	public abstract DoorKnobBuilder addWoodenBlock();


	public DoorKnob build() {
		DoorKnob  doorKnob = new DoorKnob();
		doorKnob.setName(this.name);
		doorKnob.addTools(tools);
		return doorKnob;
	}

}


