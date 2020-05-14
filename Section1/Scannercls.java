import java.util.Scanner;

class Scannercls
{
    public static void main(String[] args)

     {
     	Scanner in = new Scanner(System.in);

        System.out.println("enter ur id");
     	int id=in.nextInt();

        System.out.println("enter ur name");
        String name=in.next();

        System.out.println("enter ur mob number");
        long mob=in.nextLong();

        System.out.println("enter ur mark");
        double agg=in.nextDouble();


        System.out.println("enter ur array size");

        int size=in.nextInt();

        int array[]= new int[size];    // Array Declaration and Creation:

        System.out.println();

        for(int i=0;i<array.length;i++)
        {
            System.out.println("enter the array "+i);
 
            array[i]=in.nextInt();
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]);
        }
    }

}