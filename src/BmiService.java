public class BmiService {

    public int calculate(int mass) {
        int high = 170;
        int imd = mass / high;
        return imd;
    }
}
