class SingleDuplicate{
public static void main(String args[])
{
int a[]={8,2,4,5,2,5,4,4,1,6,8,9,2,2};
outer:
for(int i=0;i<a.length;i++){
   for(int j=i+1;j<a.length;j++){
       if(a[i]==a[j])
          {
          System.out.println("The single duplicate element in an array is:"+a[j]);
          break outer;
}
}
}
}
}
