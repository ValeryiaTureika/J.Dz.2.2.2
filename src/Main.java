public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int BodyMassIndex = service.calculate(80, 165, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex + "кг/м;  " + "Вес: 80 кг;  " + "Рост: 1,65 м");

        int BodyMassIndex1 = service.calculate(100, 185, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex1 + "кг/м;  " + "Вес: 100 кг;  " + "Рост: 1,85 м");

        int BodyMassIndex2 = service.calculate(54, 160, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex2 + "кг/м;  " + "Вес: 54 кг;  " + "Рост: 1,60 м");

        int BodyMassIndex3 = service.calculate(90, 186, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex3 + "кг/м;  " + "Вес: 90 кг;  " + "Рост: 1,86 м");

        int BodyMassIndex4 = service.calculate(105, 197, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex4 + "кг/м;  " + "Вес: 105 кг;  " + "Рост: 1,97 м");

        int BodyMassIndex5 = service.calculate(75, 165, 10_000);
        System.out.println("Индекс Массы Тела: " + BodyMassIndex5 + "кг/м;  " + "Вес: 75 кг;  " + "Рост: 1,65 м");
    }
}
