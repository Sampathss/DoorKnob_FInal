package doorKnobInstl.state;

public interface State {
	public void status(Context context);

	public void insertLatch();
	public void affix();
	public void secureKnob();
	public void test();
	public void refinish();
		
}
