public class UpdatingVariables {
    public static void main(String[] args) {
        int salary= 1000;

        //bono $200.00
        salary = salary + 200;
        System.out.println(salary);

        //pension: $50.00 (descuento)
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra: $30.00 c/u
        //Comida: $45 (descuento)
        salary = salary + ( 30*2) -45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Hector";
        employeeName = employeeName + " BecMe";
        System.out.println(employeeName);
    }
}
