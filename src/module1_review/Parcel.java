package module1_review;

public class Parcel {
    private String id;
    private int weight;
    private final int DEFAULT_WEIGHT = 10;
    
    public Parcel(String id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public Parcel(String id) {
        this.id = id;
        this.weight = DEFAULT_WEIGHT;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight < 0) {
            throw new Error("Invalid weight: it must be a positive integer");
        }
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Parcel) {
            Parcel p = ((Parcel) o);
            return id.equals(p.getId()) && weight == p.getWeight();
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "id: " + id + ", weight: " + weight;
    }
}
