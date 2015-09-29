

public abstract class AbstractVehicle {

	private int line;
	private boolean accelerate;
	private Passenger passengers[];
	private int currentIndex;

	public AbstractVehicle(int line) {
		// TODO Auto-generated constructor stub
		this.line = line;
	}
	
	protected AbstractVehicle(int line, int maxPassengers) {
		this(line);
		passengers = new Passenger[maxPassengers];
	}
	
	public int getLine() {
		return line;
	}
	
	public boolean isAccelerate() {
		return accelerate;
	}
	
	protected void setAccelerate(boolean accelerate) {
		this.accelerate = accelerate;
	}

	public Passenger[] getPassengers() {
		return passengers;
	}
	
	public void leave(int seat) throws IndexOutOfBoundsException {
		currentIndex--;
		
		try {
			passengers[seat] = null;
		} catch (IndexOutOfBoundsException e) {
			throw e;
		}
	}
	
	public void travel(Passenger passenger) throws MaximumPassengersAddedException {
		currentIndex++;
		
		try {
			if (currentIndex < getPassengers().length) {
				passengers[currentIndex] = passenger;
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			throw new MaximumPassengersAddedException();
		}
	}
	
	public abstract void drive();
	
	public abstract void stop();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractVehicle [line=" + line + ", accelerate=" + accelerate + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (accelerate ? 1231 : 1237);
		result = prime * result + line;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractVehicle)) {
			return false;
		}
		AbstractVehicle other = (AbstractVehicle) obj;
		if (accelerate != other.accelerate) {
			return false;
		}
		if (line != other.line) {
			return false;
		}
		return true;
	}
}
