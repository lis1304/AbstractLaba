package Abstr;

public class AirRun extends Transport implements Cloneable{
    public AirRun(String type, String destination) {
        super(type, destination);
    }

    @Override
    public void runTypr() {
        System.out.println("воздужный");
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
        AirRun wr = (AirRun) obj;
        return this.getType() == wr.getType();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
