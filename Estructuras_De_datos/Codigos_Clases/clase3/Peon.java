package Estructuras_De_datos.Codigos_Clases.clase3;
import java.util.Random;

public class Peon extends Pieza
{
    Random rand = new Random();
    int blindaje;
    boolean primerMovimiento = true;

    Peon(String nombre, String color, int posC, int posE)
    {
        super(nombre, color, posC, posE);
        this.blindaje = rand.nextInt(4);
    }

    
}