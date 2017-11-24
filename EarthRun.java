package Abstr;

public class EarthRun extends Transport {
    public EarthRun(String type, String destination) {
        super(type, destination);
    }

    @Override
    public void runTypr() {
        System.out.println("наземный");
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
        EarthRun wr = (EarthRun) obj;
        return this.getType() == wr.getType();
    }
}
