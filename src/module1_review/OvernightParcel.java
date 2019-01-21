package module1_review;

public class OvernightParcel extends Parcel {
    private boolean requiresSignature;
    
    public OvernightParcel(String id, int weight, boolean requiresSignature) {
        super(id, weight);
        this.requiresSignature = requiresSignature;
    }
}
