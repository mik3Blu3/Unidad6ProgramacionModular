import java.util.Scanner;
public class ejercicio1 {
    
    public static void main(String args[])
    {
        ejercicio1 N = new ejercicio1();
    }
    int elementos[] = new int[5];
    Scanner entrada = new Scanner(System.in);
    public ejercicio1()
    {
        for (int i = 0 ; i<5 ; i++){
            pedirValor(i);
        }

        for(int i =0; i < 5 ; i++)
        {
            mostrarDatos(i);
        }
    }

    public void mostrarDatos(int numero)
    {   
        System.out.println("El indice es "+numero+ " el valor es "+elementos[numero]);
    }
    public void pedirValor(int numero)
    {
        System.out.println("Ingrese el valor NO. "+numero);
        elementos[numero] = entrada.nextInt();
    }
}
