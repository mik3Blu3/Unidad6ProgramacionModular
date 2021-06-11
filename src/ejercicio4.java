import java.util.Scanner;
import java.util.Random;
public class ejercicio4 {
    public static void main(String args[])
    {
        ejercicio4 m = new ejercicio4();
    }
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();
    final int longitud = 10;
    int arrayNumeros[] =  new int[longitud];
    int distancia=0;
    int numeroMayor=0;
    int numAleatorio =0;
    public  ejercicio4()
    {
        for(int i = 0 ; i < arrayNumeros.length ; i++)
        {
            insertarDatos(i);
            mostrarDatos(i);
        }
        int numeroMayorReal = buscarDatoMayor();
        System.out.println("");
        System.out.println("El numero mayor encontrado es: "+numeroMayorReal);
        System.out.println("");
        mostrarDistancia(numeroMayorReal);
    }
    public void insertarDatos(int i)
    {
        numAleatorio = random.nextInt(100);
        arrayNumeros[i] = numAleatorio;
    }
    public void mostrarDatos(int i)
    {   
        int numero = i+1;
        System.out.println("El dato en la posicion # "+numero+ " es "+arrayNumeros[i]);
    }
    public int buscarDatoMayor()
    {
        int numeroMayor = arrayNumeros[0];
        for(int i = 0; i< arrayNumeros.length ; i++)
        {
            if(arrayNumeros[i] > numeroMayor)
            {
                numeroMayor = arrayNumeros[i];
            }
        }
        return numeroMayor;
    }
    public void mostrarDistancia(int numeroMayor)
    {
        for(int i =0 ; i< arrayNumeros.length ; i++ )
        {   
            distancia = numeroMayor-arrayNumeros[i];
            System.out.println("La distancia entre "+arrayNumeros[i]+" y el numero mayor : "+numeroMayor+" es "+distancia);
        }
    }
}
