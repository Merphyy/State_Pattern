package State;

public interface OrderState {
	public void paid();
	public void sent();
	public void received();
	public void finished();
	
}
