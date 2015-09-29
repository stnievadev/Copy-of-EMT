

public class Ticket {

	private int tickets;
	
	public int getTickets() {
		return tickets;
	}
	
	public int use() {
		return --tickets;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ticket [tickets=" + tickets + "]";
	}
}
