public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bodyMassIndex = service.calculate(80, 165, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex + "кг/м;  " + "Вес: 80 кг;  " + "Рост: 1,65 м");

        int bodyMassIndex1 = service.calculate(100, 185, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex1 + "кг/м;  " + "Вес: 100 кг;  " + "Рост: 1,85 м");

        int bodyMassIndex2 = service.calculate(54, 160, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex2 + "кг/м;  " + "Вес: 54 кг;  " + "Рост: 1,60 м");

        int bodyMassIndex3 = service.calculate(90, 186, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex3 + "кг/м;  " + "Вес: 90 кг;  " + "Рост: 1,86 м");

        int bodyMassIndex4 = service.calculate(105, 197, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex4 + "кг/м;  " + "Вес: 105 кг;  " + "Рост: 1,97 м");

        int bodyMassIndex5 = service.calculate(75, 165, 10_000);
        System.out.println("Индекс Массы Тела: " + bodyMassIndex5 + "кг/м;  " + "Вес: 75 кг;  " + "Рост: 1,65 м");
    }
}
