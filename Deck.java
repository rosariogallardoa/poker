//import java.util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cartasPoker = new ArrayList<>();
    private String[] listaValores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
    private String saltoLinea = "\n\r";

    public ArrayList<Card> getCartasPoker() {
        return cartasPoker;
    }


    //constructors
    public Deck(){
        //inicializa las cartasPoker negras
        creaCartasPalo("tréboles","negro");
        creaCartasPalo("picas","negro");

        //inicializa las cartasPoker rojas
        creaCartasPalo("corazones","rojo");
        creaCartasPalo("diamantes","rojo");

    }

    //functions
    public void shuffle() {
        //se crea un objeto random para usarlo de guía
        Random objetoRandom = new Random();

        //se ejecuta la función que ordena aleatoriamente de acuerdo con la guía
        Collections.shuffle(cartasPoker,objetoRandom);

        //se imprime mensaje
        System.out.println("Se mezcló el Deck");
    }

    public void head() {
        //se obtiene el tamanio del deck
        int cartasEnDeck = cartasPoker.size();

        //validando si hay cartas para mostrar
        if(cartasEnDeck==0) {
            System.out.println("El deck ya no tiene cartas");
            return;
        }

        //se obtiene la primera carta y se quita del deck
        Card primeraCarta = obtenerRemoverCarta(0);

        //se obtiene nuevamente el tamanio del deck
        cartasEnDeck = cartasPoker.size();

        //se imprime
        String cadena = String.format("%s%sQuedan {%d}",primeraCarta.toString(),saltoLinea,cartasEnDeck);
        System.out.println(cadena);
    }

    public void pick() {

        //se obtiene el tamanio del deck
        int cartasEnDeck = cartasPoker.size();

        //validando si hay cartas para mostrar
        if(cartasEnDeck==0) {
            System.out.println("El deck ya no tiene cartas");
            return;
        }

        //se crea un umero random para usarlo de guía de acuerdo al tamaño del deck
        int posicionCarta = (int)(Math.random()*cartasEnDeck + 1);

        //se obtiene la carta y remueve la carta
        Card carta = obtenerRemoverCarta(posicionCarta);

        //se obtiene nuevamente el tamanio del deck
        cartasEnDeck = cartasPoker.size();

        //se imprime
        String cadena = String.format("%s%sQuedan {%d}",carta.toString(),saltoLinea,cartasEnDeck);
        System.out.println(cadena);
    }

    public ArrayList<Card> hand() {
        int cartasEnMano = 5;
        int cartasEnDeck;
        String cadena="";

        //se inicializa el tamaño de la manode cartas
        ArrayList<Card> mano = new ArrayList<>(4);

        //se obtiene el tamanio del deck
        cartasEnDeck = cartasPoker.size();

        //validando si hay cartas para mostrar
        if(cartasEnDeck==0) {
            System.out.println("El deck ya no tiene cartas");
            return mano;
        }

        // mezcla las cartas
        mezclaDeck();

        //evalua si hay menos de 5 cartas que tome las restantes
        if(cartasEnDeck<5){
            cartasEnMano = cartasEnDeck;
        }

        // obtiene cartas y remueve
        int contador = 0;
        while(contador<cartasEnMano) {
            Card carta = obtenerRemoverCarta(0);
            //se imprime
            cadena = String.format("%s",carta.toString());
            System.out.println(cadena);
            //se agrega
            mano.add(carta);
            contador++;
        }

        //se obtiene nuevamente el tamanio del deck
        cartasEnDeck = cartasPoker.size();

        //se imprime
        cadena = String.format("Quedan {%d}",cartasEnDeck);
        System.out.println(cadena);
        return mano;
    }


    private void creaCartasPalo(String palo,String color){
        int cartasPorPalo = listaValores.length;
        for(int contador = 0; contador < cartasPorPalo; contador++){
            Card carta = new Card(palo, color, listaValores[contador]);
            cartasPoker.add(carta);
        }
    }
    private Card obtenerRemoverCarta(int posicion) {
        Card carta = cartasPoker.get(posicion);
        cartasPoker.remove(posicion);
        return carta;
    }

    private void mezclaDeck(){
        //se crea un objeto random para usarlo de guía
        Random objetoRandom = new Random();

        //se ejecuta la función que ordena aleatoriamente de acuerdo con la guía
        Collections.shuffle(cartasPoker,objetoRandom);
    }

}
