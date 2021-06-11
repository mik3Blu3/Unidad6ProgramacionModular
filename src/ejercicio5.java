import java.util.Scanner;
public class ejercicio5 {
    public static void main(String args[])
    {
        ejercicio5 t =new ejercicio5();
    } 

    Scanner entrada = new Scanner(System.in);
    int posicion =0;
    int promedioAux =0;
    int contadorPromedio =0;

    public ejercicio5()
    {
        int MaR[]= new int[100];
        int nuevoArr[] = new int[100];
        System.out.println("Crearemos la matriz");
        nuevoArr = crearArreglo();
        System.out.println("");
        System.out.println("Ahora ingrese los datos");
        MaR=rellenarArreglo(nuevoArr);
        System.out.println("");
        System.out.println("Buscaremos el promedio: ");
        buscarPromedio(MaR);
    }
    public int[] crearArreglo()
    {
        int arrCreado[]= new int[100];
        return arrCreado;
    }
    public int[]  rellenarArreglo(int arr[])
    {
        int matrizRellenada[] = new int[100];
        for(int i = 0 ; i < arr.length ; i++)
        {   
            do
            {
                System.out.println("Ingrese el dato para la posicion "+(i+1)+" : ");
                int entradaAux=entrada.nextInt();
                matrizRellenada[i]=entradaAux;
                posicion++;
            }while(entradaAux != -50);
        }
    return matrizRellenada;
    }
    public void buscarPromedio(int m[])
    {
        for(int i = 0; i< posicion ; i++)
        {
            promedioAux = promedioAux+m[i];
            contadorPromedio++;
        }
        System.out.println("El promedio de los datos sin contar el -50 es: ");
        System.out.println((promedioAux/contadorPromedio));
    }
}
