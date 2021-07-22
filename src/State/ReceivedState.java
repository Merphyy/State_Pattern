package State;

public class ReceivedState implements OrderState{
	private final Order order ;

	public ReceivedState(Order order) {
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
		System.out.println("This is Received state.");
	}

	@Override
	public void finished() {
		// TODO Auto-generated method stub
		order.setState(order.getOrderFinished());
		System.out.println("This is Finished state.");
	}

}
