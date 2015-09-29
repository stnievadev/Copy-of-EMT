
import java.util.HashMap;

public class EMT {

	private HashMap<Integer, AbstractVehicle> vehicles = new HashMap<>();
	
	public void addVehicle(AbstractVehicle vehicle) {
		Integer line = vehicle.getLine();
		
		vehicles.put(line, vehicle);
		vehicles.get(line).drive();
	}
	
	public void removeVehicle(AbstractVehicle vehicle) {
		Integer line = vehicle.getLine();
		
		vehicles.get(line).stop();
		vehicles.remove(line);
	}
	
	public HashMap<Integer, AbstractVehicle> getVehicles() {
		return vehicles;
	}
}
