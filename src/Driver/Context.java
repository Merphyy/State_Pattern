package Driver;

import State.Order;

public class Context {
	public static void demo() {
		Order order = new Order();
		order.paid();
		order.sent();
		order.received();
		order.finished();
	}
}
