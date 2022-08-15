public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 60;
        int high = 175;
        int imd = service.calculate(mass);
        System.out.println(imd);
    }
}