class Insertionsort
{
 public static int[] insertionSort(int a[])
 {
   int n = a.length;//n=5;
    for (int i = 1; i < n; i++)//.=>i=1-(1<5)-----------------------------------------..=>i=2-(2<5)----------------------------------------------------...=>i=3-(3<5)------------------------------------------------------------------------------------....=>i=4-(4<5)
     { 
       int key = a[i];//---------.=>key=(40)a[1]--------------------------------------..=>key=30a[2]---------------------------------------------------...=>key=(20)a[3]---------------------------------------------------------------------------------....=>key=(10)a[4]
       int j;
for(j=i-1;j>=0&&a[j]>key;j--)//--.=>j=0-(0>=0&&50>40)[T]-..=>j=-1-(0>=0)[F]------------.=>j=1-(1>=0&&50>30)[T]..=>j=0-(0>0&&50>30)[T]...=>j=-1(-1>=0)[F]-.=>j=2-(2>=0&&50>20)[T]..=>j=1-(1>-0&&40>20)[T]...=>j=0(0>=0&&30>20)[T]...=>j=-1-(1>=0)[F]---------.=>j=3-(3>=0&&50>10)[t]
       { 
        a[j+1] = a[j];//--------.=>a[1]=(50)a[0]---------------------------------------.=>a[2]=(50)a[1]-------..=>a[1]=(40)a[0]--------------------------.=>a[3]=(50)a[2]-------..=>a[2]=(40)a[1]-------...=>a[1]=()a[0]------------------------------------.=>a[4]=()a[3]
       } 
    a[j+1] = key;//------------------------------------------------------.=>a[0]=(40)key-----------------------------------------------..=>a[0]=(30)key------------------------------------------------------------------------ ...=>a[0]=(20)key
     } 
  return a;
 }
public static void main(String[] args) 
 {
  int[] a1 = {50,40,30,20,10};//{50,50,30,20,10}-----------------------.{40,50,30,20,10}.{40,50,50,20,10}---..{40,40,50,20,10}-------...{30,40,50,20,10}---.{30,40,50,50,10}-----..{30,40,40,50,10}------...{30,30,40,50,10}-----------------...{20,30,40,50,10}
  //.........{ 0, 1, 2, 3, 4}---{ 0, 1, 2, 3, 4}-----------------------.{ 0, 1, 2, 3, 4}.{ 0, 1, 2, 3, 4}---..{ 0, 1, 2, 3, 4}-------...{ 0, 1, 2, 3, 4}---.{ 0, 1, 2, 3, 4}-----..{ 0, 1, 2, 3, 4}------...{ 0, 1, 2, 3, 4}-----------------...{ 0, 1, 2, 3, 4}
  //.........{ j i(k)       }---{ j            }-----------------------.{    j i(k)    }.{ j  i         }---..{              }-------...{       j i(k) }-=-.{    j         }-----..{ j            }------...{ j            }-----------------...{         j i(k)}
  int[] res=insertionSort(a1);
  for(int i=0;i<res.length;i++)//......printing array
  {
   System.out.println(res[i]);
  }
 }
}