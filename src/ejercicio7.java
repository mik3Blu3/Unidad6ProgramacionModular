import java.util.Scanner;
import java.util.Random;
public class ejercicio7 {
    public static void main(String args[])
    {
        //crea el nuevo ejercicio7
        ejercicio7 ej7 = new ejercicio7();
    }
    //declaraciones
    Scanner entrada = new Scanner(System.in);
    Random random = new Random();
    int sumaDatos = 0;
    int ran = 0;
    //declarando el array
    int array[][]=new int[4][3];
    public ejercicio7()
    {
        //logica
        for(int i =0 ; i<4; i++)
        {
            for(int n = 0 ; n < 3 ; n++)
            {
                ran = generarRandom();
                insertarNumRandom(ran, i, n);
            }
        }
        System.out.println("Los datos almacenados en la matriz son: ");
        System.out.println("");
        mostrarArregloNumerosA();
        int sumaTotal =  mostrarSumaFila();
        System.out.println("");
        System.out.println("La suma de los datos de las filas pares es: "+sumaTotal);
    }
    //genera un random
    public int generarRandom()
    {   
        int numRan = random.nextInt(555);
        return numRan;
    }
    //inserta los numeros aleatorios en la matriz
    public void insertarNumRandom(int ran, int i, int n)
    {
        array[i][n]=ran;
    }
    //muestra la matriz
    public void mostrarArregloNumerosA ()
    {
        for(int i =0; i<4; i++)
        {
            for(int n = 0 ; n < 3 ; n++)
            {
                System.out.println("posicion ("+(i+1)+" , "+(n+1)+") es :"+array[i][n]);
            }
        }

    }
    //realiza la suma de las filas pares
    public int  mostrarSumaFila()
    {
        for(int i =0; i<4; i++)
        {
            for(int n = 0 ; n < 3 ; n++)
            {
                if((i== 1) || (i ==3)){
                    sumaDatos = (sumaDatos+array[i][n]);
                }                
            }
        }
        return sumaDatos;
    }
}
