public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int BodyMassIndex = service.calculate(80, 165, 10_000);
        System.out.println(BodyMassIndex);

        int BodyMassIndex1 = service.calculate(100, 185, 10_000);
        System.out.println(BodyMassIndex1);

        int BodyMassIndex2 = service.calculate(54, 160, 10_000);
        System.out.println(BodyMassIndex2);

        int BodyMassIndex3 = service.calculate(90, 186, 10_000);
        System.out.println(BodyMassIndex3);

        int BodyMassIndex4 = service.calculate(105, 197, 10_000);
        System.out.println(BodyMassIndex4);

        int BodyMassIndex5 = service.calculate(73, 165, 10_000);
        System.out.println(BodyMassIndex5);
    }
}
