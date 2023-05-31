

public class Card {

    private String palo;
    private String color;
    private String valor;

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }

    public void setPalo(String palo){
        this.palo = palo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    //constructors
    public Card(){

    }

    public Card(String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String cadenaFormateada = String.format("{%s},{%s},{%s}", palo, color, valor);
        return cadenaFormateada;
    }
}
