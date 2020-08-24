public class Casting {
    public static void main(String[] args) {

        // en un añor ubicaste 30 perros
        // cual fue la productividad mensual

        double uD = 30.0;
        double mD = 12.0;
        double monthlyDogsD = uD/mD;
        System.out.println(monthlyDogsD);

        // Cast a int, trunca parte flotante
        System.out.println((int) monthlyDogsD);

        int uI = 30;
        int mI = 12;
        int monthlyDogsI = uI/mI;
        System.out.println(monthlyDogsI);

        // cast a double
        System.out.println((double) monthlyDogsI);
        System.out.println((double) uI/mI);



    }
}
