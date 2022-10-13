package statisticker;
public class EmailAlert implements IAlerter {

	boolean emailSent;
	@Override
	public void alert() {
		 emailSent = true;
		
	}
	@Override
	public void light() {
		// TODO Auto-generated method stub
		
	}}
