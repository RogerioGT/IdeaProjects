public class TestGameHomeWork {
    public static void main(String[] args) {

        //Datos del Jugador
        String jugador = "Rogeriovski";
        String jugadorLastName = " Martinovski";
        String fullName = jugador + jugadorLastName;

        short edad = 31;
        long puntos = 0L;
        char rango = 'E';

        //Botin
        int $monedasOro = 5;
        int vidas = 8;

        System.out.println("Play Name: " + fullName + ", Players' Age: " + edad + ", Player Start points: " + puntos + ", Player Rank: " + rango);
        System.out.println("Player Gold: " + $monedasOro + ", Player Lives: " + vidas);

        vidas++;
        vidas++;
        System.out.println("Vidas Ganadas " + vidas);
        vidas--;
        vidas--;
        vidas--;
        vidas--;
        System.out.println("Vidas Restantes " + vidas);

        //Sumar puntos
        puntos = puntos + 900800700600500400L;
        rango = 'A';

        System.out.println("Player Rank: " + rango);
        System.out.println("Player Full Name: " + fullName + ", Player Age: " + edad + ", Vidas Final: " + vidas + ", Player Final Gold: " + $monedasOro + ", Player points: " + puntos + ", Player Rank: " + rango);


    }
}
