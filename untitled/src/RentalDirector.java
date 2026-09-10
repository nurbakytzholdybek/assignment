public class RentalDirector {

    public VehicleRentalPackage createBasicRental() {
        return new VehicleRentalPackageBuilder()
                .setVehicleType(VehicleType.CAR)
                .setPickupLocation("Astana City Center")
                .setReturnLocation("Astana City Center")
                .setRentalDays(1)
                .build();
    }

    public VehicleRentalPackage createFamilyRental() {
        return new VehicleRentalPackageBuilder()
                .setVehicleType(VehicleType.VAN)
                .setPickupLocation("Astana Airport")
                .setReturnLocation("Astana Airport")
                .setRentalDays(5)
                .addInsurance()
                .addGps()
                .addChildSeat()
                .build();
    }

    public VehicleRentalPackage createBusinessRental() {
        return new VehicleRentalPackageBuilder()
                .setVehicleType(VehicleType.CAR)
                .setPickupLocation("Astana Airport")
                .setReturnLocation("Astana City Center")
                .setRentalDays(3)
                .addInsurance()
                .addGps()
                .addAdditionalDriver()
                .build();
    }
}
