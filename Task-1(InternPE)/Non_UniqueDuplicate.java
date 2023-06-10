public class Non_UniqueDuplicate {
    public static void main(String args[])
{
int a[]={1,9,2,7,4,5,2,5,7,4,8,9};
for(int i=0;i<a.length;i++){
   for(int j=i+1;j<a.length;j++){
       if(a[i]==a[j])
          {
          System.out.println("The non-unique duplicate elements in an array are:"+a[j]);
   }
}
}
}

}
