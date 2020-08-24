public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;

        lives = lives - 1;
        System.out.println(lives); // 4

        lives --;
        System.out.println(lives); // 3

        lives ++;
        System.out.println(lives); // 4

        // Operador posfijo
        // Gana un regalo por fanar una vida
        int gift = 100 + lives ++;
        System.out.println(gift);
        System.out.println(lives);

        // Operador posfijo
        // Gana un regalo por fanar una vida
        gift = 100 + ++ lives;
        System.out.println(gift);
        System.out.println(lives);






    }
}
