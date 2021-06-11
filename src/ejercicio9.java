import java.util.Scanner;
public class ejercicio9 {
    public  static void main(String args[])
    {
        //creando el ejercicio9
        ejercicio9 eje9 = new ejercicio9();
    }
    //entrada de datos
    Scanner entrada = new Scanner(System.in);
    //constructor
    public ejercicio9()
    {
        //logica
        System.out.println("Ingrese las dimensiones de las matrices a sumar: n*m");
        System.out.println("Recuerde que unicamente se pueden sumar matrices cuadradas!!! ");
        System.out.println("Matriz 1 Ingrese n");
        int n1 = entrada.nextInt();
        System.out.println("Matriz 1 Ingrese m");
        int m1 = entrada.nextInt();
        System.out.println("Matriz 2 ingrese n");
        int n2 = entrada.nextInt();
        System.out.println("Matriz 2 ingrese m");
        int m2 = entrada.nextInt();

        if((n1 == n2) && (m1 == m2))
        {
            int matriz1[][]=new int[n1][m1];
            int matriz2[][] = new int[n2][m2];
            int matrizSuma[][] = new int [n1][m1];
            System.out.println("Rellenando Matriz 1");
            rellenarMatrices(matriz1);
            System.out.println("Rellenando Matriz 2");
            rellenarMatrices(matriz2);
            matrizSuma=sumaMatrices(matriz1, matriz2, n1, m1);
            System.out.println("La primer matriz ingresada fue: ");
            mostrarMatriz(matriz1);
            System.out.println("");
            System.out.println("La segunda matriz ingresada fue");
            mostrarMatriz(matriz2);
            System.out.println("");
            System.out.println("y La suma de ambas fue: ");
            mostrarMatriz(matrizSuma);

        }else{
            System.out.println("Alguna matriz ingresada no es cuadrada Verificar! ");
        }
    }
    //rellena las matrices
    public int[][] rellenarMatrices(int mat[][])
    {
        for(int i =0; i < mat.length; i++)
        {
            for(int n = 0 ; n<mat.length ; n++)
            {
                System.out.println("Ingrese dato para la posicion: ("+(i+1)+" , "+(n+1)+")");
                mat[i][n] = entrada.nextInt();
            }
        }
        return mat;
    }
    //suma las dos matrices 
    public int [][] sumaMatrices(int mat1[][], int mat2[][], int N1, int M1)
    {
        int matrizSumada[][] = new int[N1][M1];
        for(int i = 0 ; i < N1 ; i++)
        { 
            for(int n=0 ; n< M1; n++)
            {
                matrizSumada[i][n]=mat1[i][n]+mat2[i][n];
            }
        }
        return matrizSumada;

    }
    //muestra las matrices 
    public void mostrarMatriz(int matrizMostrar[][])
    {
        for(int i = 0 ; i <matrizMostrar.length; i++)
        {
            for(int n = 0; n < matrizMostrar.length; n++)
            {
                System.out.println("posicion : ("+(i+1)+" , "+(n+1)+") =  "+matrizMostrar[i][n]);
            }
        }
    }

}
