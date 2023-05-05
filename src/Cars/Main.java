package Cars;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickUpType(), new DieselType());
        VehicleAd mercedesAd = new VehicleAd("Mercedes", "85", new CarType(), new SedanType(), new PetrolType());
        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, mercedesAd});
        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println("---------------------------");
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        System.out.println("---------------------------");
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
        System.out.println("---------------------------");
    }
}
