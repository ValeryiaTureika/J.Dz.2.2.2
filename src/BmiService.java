public class BmiService {
    public int calculate(int bodyWeightInKg, int heightInCentimeters, int transferToKg) {
        int bodyMassIndex = (bodyWeightInKg * transferToKg) / (heightInCentimeters * heightInCentimeters);
        return bodyMassIndex;
    }
}
