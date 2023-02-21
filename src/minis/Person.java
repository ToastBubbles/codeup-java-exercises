package minis;

public class Person  implements Location{
    protected String location;
    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
