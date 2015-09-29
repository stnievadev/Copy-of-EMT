

public class Metro extends AbstractVehicle {
	
	private boolean leverOn;
	
	public Metro(int line) {
		super(line, Constants.MAX_METRO_PASSENGER);
		// TODO Auto-generated constructor stub
	}	
	
	public boolean isLeverOn() {
		return leverOn;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		leverOn = true;
		
		setAccelerate(true);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		leverOn = false;
		
		setAccelerate(false);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Metro [leverOn=" + leverOn + ", toString()=" + super.toString() + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (leverOn ? 1231 : 1237);
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
		if (!(obj instanceof Metro)) {
			return false;
		}
		Metro other = (Metro) obj;
		if (leverOn != other.leverOn) {
			return false;
		}
		return true;
	}
}
