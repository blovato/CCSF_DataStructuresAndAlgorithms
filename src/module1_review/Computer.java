package module1_review;

public class Computer {
    private String brand;
    private String name;
    private String memory;
    
    Computer() {}
    Computer(String brand, String name, String memory) {
        this.brand = brand;
        this.name = name;
        this.memory = memory;
    }
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return brand + " " + name + " " + memory;
    }
}
