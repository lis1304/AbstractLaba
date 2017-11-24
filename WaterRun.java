package Abstr;

public class WaterRun extends Transport {
    public WaterRun(String type, String destination) {
        super(type, destination);
    }

    @Override
    public void runTypr() {
        System.out.println("водный");
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
        WaterRun wr = (WaterRun) obj;
        return this.getType() == wr.getType();
    }
}
