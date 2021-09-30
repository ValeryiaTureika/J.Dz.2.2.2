public class BmiService {
    public int calculate(int bodyWeightInKg, int heightInCentimetersInCm) {
        int bodyMassIndex = (bodyWeightInKg * 10_000) / (heightInCentimetersInCm * heightInCentimetersInCm);
        return bodyMassIndex;
    }
}
