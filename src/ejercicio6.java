import java.util.Scanner;
public class ejercicio6 {
    public static void main(String args[])
    {
        ejercicio6 t = new ejercicio6();
    }
    int arre[][]= new int[3][3];
    int arrD[][] = new int[3][3];

    public ejercicio6()
    {
        hacerArreglo();
        duplicarArr(arre);
        System.out.println("Mostraremos los valores del arreglo principal");
        System.out.println("");
        mostrarArrN();
        System.out.println("");
        System.out.println("Ahora mostraremos los datos duplicados ");
        System.out.println("");
        mostrarArrD();
        System.out.println("");
    }

    public void hacerArreglo()
    {
        arre[0][0]=5;
        arre[0][1]=14;
        arre[0][2]=21;
        arre[1][0]=6;
        arre[1][1]=2;
        arre[1][2]=7;
        arre[2][0]=13;
        arre[2][1]=4;
        arre[2][2]=6;
    }

    public int[][] duplicarArr(int[][] arre)
    {
        for(int i = 0 ; i< arre.length; i++)
        {
            for(int n =0 ; n<arre.length; n++){
                arrD[i][n]=2*arre[i][n];
            }
        }
        return arrD;
    }

    public void mostrarArrD()
    {
        for(int i = 0 ; i< arrD.length; i++)
        {
            for(int n =0 ; n<arrD.length; n++){
                System.out.println("El arreglo duplicado es el siguiente: ");
                System.out.println("posicion ("+i+" , "+n+" ) = "+arrD[i][n]);
            }
        }

    }

    public void  mostrarArrN()
    {
        for(int i = 0 ; i< arre.length; i++)
        {
            for(int n =0 ; n<arre.length; n++){
                System.out.println("El arreglo  es el siguiente: ");
                System.out.println("posicion ("+i+" , "+n+" ) = "+arre[i][n]);
            }
        }
    }
}
