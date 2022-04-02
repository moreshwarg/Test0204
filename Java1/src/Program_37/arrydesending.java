package Program_37;
public class arrydesending{
public static void main(String[]arg){
int a[]={10,12,12,1,34,44};
int t=0;
int length = a.length;
for (int i=0;i<length-1;i++){
  for (int j= i+1;j<length-1;j++){
     if (a[i]>a[j]){
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
System.out.println(a[i]);
}
}}
