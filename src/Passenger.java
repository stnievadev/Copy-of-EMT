public class Passenger {

	private String name;
	private Ticket ticket;
	
	public Passenger(String name, Ticket ticket) {
		super();
		this.name = name;
		this.ticket = ticket;
	}

	public String getName() {
		return name;
	}

	public Ticket getTicket() {
		return ticket;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", ticket=" + ticket + "]";
	}
}
