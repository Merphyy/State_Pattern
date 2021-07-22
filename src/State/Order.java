package State;

public class Order implements OrderState {
	private OrderState orderPaid;
	private OrderState orderSent;
	private OrderState orderReceived;
	private OrderState orderFinished;
	private OrderState state;

	public Order() {
		this.orderPaid = new PaidState(this);
		this.orderSent = new SentState(this);
		this.orderReceived = new ReceivedState(this);
		this.orderFinished = new FinishedState(this);
		this.state = new PaidState(this);
	}

	@Override
	public void paid() {
		// TODO Auto-generated method stub
		state.paid();

	}

	@Override
	public void sent() {
		// TODO Auto-generated method stub
		state.sent();
	}

	@Override
	public void received() {
		// TODO Auto-generated method stub
		state.received();
	}

	@Override
	public void finished() {
		// TODO Auto-generated method stub
		state.finished();
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public OrderState getOrderPaid() {
		return orderPaid;
	}

	public void setOrderPaid(OrderState orderPaid) {
		this.orderPaid = orderPaid;
	}

	public OrderState getOrderSent() {
		return orderSent;
	}

	public void setOrderSent(OrderState orderSent) {
		this.orderSent = orderSent;
	}

	public OrderState getOrderReceived() {
		return orderReceived;
	}

	public void setOrderReceived(OrderState orderReceived) {
		this.orderReceived = orderReceived;
	}

	public OrderState getOrderFinished() {
		return orderFinished;
	}

	public void setOrderFinished(OrderState orderFinished) {
		this.orderFinished = orderFinished;
	}

}
