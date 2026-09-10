public class VehicleRentalPackage {

    private final VehicleType vehicleType;
    private final String pickupLocation;
    private final String returnLocation;
    private final int rentalDays;
    private final boolean insurance;
    private final boolean gps;
    private final boolean childSeat;
    private final boolean additionalDriver;

    public VehicleRentalPackage(
            VehicleType vehicleType,
            String pickupLocation,
            String returnLocation,
            int rentalDays,
            boolean insurance,
            boolean gps,
            boolean childSeat,
            boolean additionalDriver) {

        this.vehicleType = vehicleType;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.rentalDays = rentalDays;
        this.insurance = insurance;
        this.gps = gps;
        this.childSeat = childSeat;
        this.additionalDriver = additionalDriver;
    }

    @Override
    public String toString() {
        return "Vehicle Rental Package:\n" +
                "Vehicle: " + vehicleType +
                "\nPickup: " + pickupLocation +
                "\nReturn: " + returnLocation +
                "\nRental days: " + rentalDays +
                "\nInsurance: " + insurance +
                "\nGPS: " + gps +
                "\nChild seat: " + childSeat +
                "\nAdditional driver: " + additionalDriver;
    }
}
