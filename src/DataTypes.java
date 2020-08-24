public class DataTypes {
    public static void main(String[] args) {
        // Datos de tipo Numericos
        byte nB = 127;
        short nS = 32767;
        int nI = 2147483647;
        long nL = 9223372036854775807L;
        float nF = 3.40282346638528860F;
        double nD = 1.79769313486231570;

        // Inferencia de tipo
        var  salary = 1000; //int
        var  pension = salary*0.03; //double
        var totalSalary = salary-pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Hector BecMe";
        System.out.println("EMPLOYEE: " + employeeName + "\nSALARY: $" + totalSalary);
    }
}
