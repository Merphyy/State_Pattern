package State;

public class PaidState implements OrderState{
	private final Order order ;

	public PaidState(Order order) {
		this.order = order;
	}
	
	@Override
	public void paid() {
		// TODO Auto-generated method stub
		System.out.println("This is Paid state.");
	}

	@Override
	public void sent() {
		// TODO Auto-generated method stub
		order.setState(order.getOrderSent());
		System.out.println("This is Sent state.");
		
	}

	@Override
	public void received() {
		// TODO Auto-generated method stub
		System.out.println(" Error! Cannto go to Received state.");
		
	}

	@Override
	public void finished() {
		// TODO Auto-generated method stub
		System.out.println(" Error! Cannto go to Finished state.");
	}

}
