package CabInvoiceGenerator;

public class CabInvoiceGenerator {

	private static final int COST_PER_TIME = 1;
	private static final double COST_PER_KM = 10;
	private static final double MINIMUM_FARE = 5;
	/**
	 * Calculate Fare
	 * Given Distance and Time The Invoice Generator should return the total fare of the Journey
	 * Cost 10 per Km + Rs 1 Per Minute	and Minimum Fare - Rs. 5
	 * @param distance
	 * @param time
	 * @return total fare
	 */
	public double calculateFare(double distance, int time) {
		return Math.max(MINIMUM_FARE,distance * COST_PER_KM + time * COST_PER_TIME);
	}

}
