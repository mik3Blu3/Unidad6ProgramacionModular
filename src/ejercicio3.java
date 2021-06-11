import java.util.Scanner;
public class ejercicio3 {
    public static void main(String args[])
    {
        ejercicio3 T = new ejercicio3();
    }
    final int cantidadNumeros=8;
    Scanner entrada = new Scanner(System.in);
    int arrayNum[]= new int[cantidadNumeros];
    boolean numeroAbuscar;

    public ejercicio3()
    {
        System.out.println("Bienvenido primero le solicitamos 8 numeros enteros");
        insertarDatos();
        System.out.println("Ingrese el dato a confirmar si se encuentra entre los ingresados o no (true/false)");
        int eleccionNumero = entrada.nextInt();
        boolean N = buscarNumero(eleccionNumero);
        System.out.println("valor: "+N);
    }
    public void insertarDatos()
    {
        for (int i = 0 ; i < arrayNum.length; i++) {
            int posicionReal = i+1;
            System.out.println("Ingrese el dato # "+posicionReal);
            arrayNum[i] = entrada.nextInt();
        }
    }
    
    public boolean buscarNumero(int numero)
    {
        for(int i =0 ; i< arrayNum.length; i++)
        {
            //comprobando si aparece en algun espacio
            if(arrayNum[i] == numero)
            {
               numeroAbuscar = true;
            }
            if(arrayNum[i] != numero){
                numeroAbuscar = false;
            }
        }return numeroAbuscar ;
    }
}

