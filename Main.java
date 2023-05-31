import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deck cartas = new Deck();
        String cadenaFormato = "";

        System.out.println("Bienvenido se inicializan las cartas!!!!\n\r");

        ArrayList<Card> cartasNuevas = cartas.getCartasPoker();
        for (int i = 0; i < cartasNuevas.size(); i++) {
            cadenaFormato = String.format("carta %d: %s",(i+1),cartasNuevas.get(i).toString());
            System.out.println(cadenaFormato);
        }

        //System.out.println("Siguiente paso\n\r");
        cartas.shuffle();

        //se ejecuta el head
        System.out.println("");
        System.out.println("Se ejecuta el head");
        cartas.head();

        //se ejecuta el pick
        System.out.println("");
        System.out.println("Se ejecuta el pick");
        cartas.pick();

        //se ejecuta el hand
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el pick segunda vez
        System.out.println("");
        System.out.println("Se ejecuta el pick");
        cartas.pick();

        //se ejecuta el hand segunda vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el hand tercera vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el hand cuarta vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el hand quinta vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el hand sexta vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el pick tercera vez
        System.out.println("");
        System.out.println("Se ejecuta el pick");
        cartas.pick();

        //se ejecuta el hand septima vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();


        //se ejecuta el hand octava vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el pick cuarta vez
        System.out.println("");
        System.out.println("Se ejecuta el pick");
        cartas.pick();

        //se ejecuta el hand novena vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

        //se ejecuta el hand decima vez
        System.out.println("");
        System.out.println("Se ejecuta el hand");
        cartas.hand();

    }
}