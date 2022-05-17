public class UpdatingVars {
    public static void main(String[] args){

        int salary = 1000;

        int bono = 200;
        int pension = 50;
        int horas = 30*2;
        int comida = -45;

        int total = salary + bono + pension + horas + comida;

        System.out.println("Tu total balance es " + salary+bono+pension+horas+comida);
        System.out.println("Tu total balance es " + (salary+bono+pension+horas+comida));
        System.out.println(total);
        System.out.println(salary + 1000);

    }
}
