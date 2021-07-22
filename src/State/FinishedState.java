package State;

public class FinishedState implements OrderState{
	private final Order order ;

	public FinishedState(Order order) {
		this.order = order;
	}
	
	@Override
	public void paid() {
		// TODO Auto-generated method stub
		System.out.println(" Error! Cannto go to Paid state.");
	}

	@Override
	public void sent() {
		// TODO Auto-generated method stub
		System.out.println(" Error! Cannto go to Sent state.");
	}

	@Override
	public void received() {
		// TODO Auto-generated method stub
		System.out.println(" Error! Cannto go to Received state.");
	}

	@Override
	public void finished() {
		// TODO Auto-generated method stub
		System.out.println("This is Finished state.");
	}

}
