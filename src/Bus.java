

public class Bus extends AbstractVehicle {

	private int gasoline;
	
	public Bus(int line, int gasoline) {
		super(line, Constants.MAX_BUS_PASSENGER);
		this.gasoline = gasoline;
	}

	public int getGasoline() {
		return gasoline;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		if (gasoline > 0) {
			setAccelerate(true);
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		setAccelerate(false);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bus [gasoline=" + gasoline + ", toString()=" + super.toString() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + gasoline;
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Bus)) {
			return false;
		}
		Bus other = (Bus) obj;
		if (gasoline != other.gasoline) {
			return false;
		}
		return true;
	}
}
