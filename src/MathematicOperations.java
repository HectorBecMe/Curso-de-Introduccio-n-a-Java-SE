public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // Constantes
        System.out.println(Math.PI);
        System.out.println(Math.E);

        // Redondeos
        System.out.println(Math.ceil(x)); // Arriba
        System.out.println(Math.floor(x)); // Abajo

        // Exponente
        System.out.println(Math.pow(x, y));

        // Maximo
        System.out.println(Math.max(x, y));

        // Raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo de radio = y
        // pi *r2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area de una esfera de radio = y
        // 4 * pi * r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // Volumen de una esfera de radio = y
        // (4/3) * pi * r3
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
