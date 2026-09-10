public class VehicleRentalPackageBuilder {

    private VehicleType vehicleType;
    private String pickupLocation;
    private String returnLocation;
    private int rentalDays;
    private boolean insurance;
    private boolean gps;
    private boolean childSeat;
    private boolean additionalDriver;

    public VehicleRentalPackageBuilder setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleRentalPackageBuilder setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
        return this;
    }

    public VehicleRentalPackageBuilder setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
        return this;
    }

    public VehicleRentalPackageBuilder setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
        return this;
    }

    public VehicleRentalPackageBuilder addInsurance() {
        this.insurance = true;
        return this;
    }

    public VehicleRentalPackageBuilder addGps() {
        this.gps = true;
        return this;
    }

    public VehicleRentalPackageBuilder addChildSeat() {
        this.childSeat = true;
        return this;
    }

    public VehicleRentalPackageBuilder addAdditionalDriver() {
        this.additionalDriver = true;
        return this;
    }

    public VehicleRentalPackage build() {
        validate();

        return new VehicleRentalPackage(
                vehicleType,
                pickupLocation,
                returnLocation,
                rentalDays,
                insurance,
                gps,
                childSeat,
                additionalDriver
        );
    }

    private void validate() {
        if (vehicleType == null) {
            throw new IllegalStateException("Vehicle type is required.");
        }

        if (pickupLocation == null || pickupLocation.isBlank()) {
            throw new IllegalStateException("Pickup location is required.");
        }

        if (returnLocation == null || returnLocation.isBlank()) {
            throw new IllegalStateException("Return location is required.");
        }

        if (rentalDays <= 0) {
            throw new IllegalStateException(
                    "Rental days must be greater than zero."
            );
        }
    }
}