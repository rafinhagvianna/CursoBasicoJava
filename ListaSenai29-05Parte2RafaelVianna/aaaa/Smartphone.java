public class Smartphone {
    private String company;
    private String model;
    private int storageCapacity;
    public Smartphone(String company, String model, int storageCapacity) {
        this.company = company;
        this.model = model;
        this.storageCapacity = storageCapacity;

    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public String boostStorage(){


    }


}
