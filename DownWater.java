package Abstr;

public class DownWater extends Transport {
    public DownWater(String type, String destination) {
        super(type, destination);
    }

    @Override
    public void runTypr() {
        System.out.println("подводный");
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        DownWater wr = (DownWater) obj;
        return this.getType() == wr.getType();
    }
}
