import java.util.ArrayList;
import java.util.List;


class BuildingOwner extends User {
    private List<Building> ownedBuildings;

    public BuildingOwner(String name, String contactDetails) {
        super(name, contactDetails);
        this.ownedBuildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        ownedBuildings.add(building);
    }

    public List<Building> getOwnedBuildings() {
        return ownedBuildings;
    }
}


