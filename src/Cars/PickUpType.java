package Cars;

public class PickUpType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
