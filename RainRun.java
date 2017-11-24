package Abstr;

public class RainRun extends Transport {
    public RainRun(String type, String destination) {
        super(type, destination);
    }

    @Override
    public void runTypr() {
        System.out.println("железнодорожный");
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
        RainRun wr = (RainRun) obj;
        return this.getType() == wr.getType();
    }
}
