public class Main {
    public static void main(String[] args) {
        RentalDirector director = new RentalDirector();

        VehicleRentalPackage familyRental =
                director.createFamilyRental();

        System.out.println("=== FAMILY RENTAL ===");
        System.out.println(familyRental);

        System.out.println();

        VehicleRentalPackage customRental =
                new VehicleRentalPackageBuilder()
                        .setVehicleType(VehicleType.BIKE)
                        .setPickupLocation("AITU")
                        .setReturnLocation("EXPO")
                        .setRentalDays(2)
                        .addGps()
                        .build();

        System.out.println("=== CUSTOM RENTAL ===");
        System.out.println(customRental);
    }
}
