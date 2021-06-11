import java.util.Scanner;
import java.util.Random;
public class ejercicio2 {
    public static void main(String args[])
    {
        ejercicio2 n = new ejercicio2();
    }

    int numeros[] = new int[10];
    Scanner entrada = new Scanner(System.in);
    Random ran = new Random();
    int numeroMayor =0;
    int cantMayorRepetido = 0;
    public ejercicio2()
    {
        for(int i =0 ; i<numeros.length; i++)
        {
            int numeroAleatorio = generarAleatorio();
            insertarAleatorio(numeroAleatorio, i);
            mostrarDatos(i);
        }
        int numeroMayorReal = buscarMayor();
        System.out.println("El numero mayor es: "+numeroMayorReal);
        int repeticiones = buscarRepetidoMayor(numeroMayorReal);
        System.out.println("La cantidad de veces que se repite el numero mayor es de: "+repeticiones);
    }

    public int generarAleatorio()
    {
        //genera un numero aleatorio y lo devuelve
        int numaleatorio = ran.nextInt(99);
        return numaleatorio;   
    }
    public void insertarAleatorio(int numaleatorio, int posicion)
    {
        numeros[posicion]=numaleatorio;
    }
    public void mostrarDatos(int numeroCasilla)
    {
        int casillaReal = numeroCasilla+1;
        System.out.println("la casilla numero "+casillaReal+" tiene el dato "+numeros[numeroCasilla]);
    }
    public int buscarMayor()
    {
        int numeroMayor = numeros[0];
        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] > numeroMayor)
            {
                numeroMayor = numeros[i];
            }
        }
    return numeroMayor;
    }
    public int buscarRepetidoMayor(int numeroMayor)
    {
        for(int i = 0; i< numeros.length; i++)
        {
            if(numeros[i] == numeroMayor)
            {
                cantMayorRepetido = cantMayorRepetido+1;
            }
        }
        return cantMayorRepetido;
    }
}
