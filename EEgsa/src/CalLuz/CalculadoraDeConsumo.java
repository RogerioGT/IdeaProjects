package CalLuz; //Coded by Rogerio Martinez
import java.util.Scanner;
class CalculadoraDeConsumo {
    public static void main(String[] args) {
        long kwh;
        double fijo =10.368820;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa el consumo del mes: ");
        kwh=sc.nextLong();
        double cargos=0;
            if(kwh<299)
                cargos=kwh*1.232760;
            else if(kwh<300)
                cargos=100*1.232760+(kwh-100)*2;
            else if (kwh>301)
                cargos=100*1.257705+200 *2+(kwh-300)*3;
        System.out.println("Consumo sin IVA: Q" + cargos + fijo);
        double energiaSinIVA=cargos+fijo;
        System.out.println("Cargo fijo + energia sin IVA: Q" + energiaSinIVA);
        double $cargosConIVA= energiaSinIVA + (energiaSinIVA*.12);
        System.out.println("Cargos Con IVA: Q" +$cargosConIVA);
        double tasaMunicipal=energiaSinIVA*.1;
        System.out.println("Tasa Municipal: Q"+tasaMunicipal);
        double total= $cargosConIVA+tasaMunicipal;
        System.out.println("Total de factura: Q" + total);
    }
}
