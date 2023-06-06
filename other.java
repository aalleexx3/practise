package Tree;

public class other {
   public static void doublecount(double input){
       String tostring=String.valueOf(input);
       String[] splitted=tostring.split("\\.");
       if(splitted[1].length()==1&&splitted[1].equals("0"))
           System.out.println("0");
       else
       System.out.println(splitted[1].length());
   }

   public static boolean ArrayCheck(String[] arr1,String[] arr2 ){
       int counter=0;
       for(int i=0;i< arr2.length;i++){
           for (int j=0;j< arr1.length;j++){
               if(arr2[i].equals(arr1[j]))
                   counter++;
           }
       }
       if (counter== arr2.length)
           return true;
       else return false;
   }

   public static void ArrayMerge(int[] arr1, int[] arr2){
       int[] arr3 = new int[arr1.length+ arr2.length];
       int x=arr1.length-1;
       for(int i=0;i<arr1.length;i++ ){
           arr3[i]=arr1[i];
       }
       for(int i=0;i<arr2.length;i++){
           x++;
           arr3[x]=arr2[i];
       }
       for(int i=0;i< arr3.length;i++){
           for(int j=0;j< arr3.length;j++){
               if(arr3[i]<arr3[j]){
                   int y=arr3[i];
                   arr3[i]=arr3[j];
                   arr3[j]=y;
               }

           }
       }
       for (int i:arr3)
           System.out.print(i);

   }





    public static void main(String[] args) {
      doublecount(42.0);
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
      ArrayMerge(arr1,arr2);
        System.out.println();


    }
}
