/*passing 2 diff arguments to same construtor*/
class TwoOb{
static int p;
public static void main(String args[]){
TwoOb ob=new TwoOb(4,6);
TwoOb ob1=new TwoOb(7,8);
ob.add();
System.out.println(p);
  System.out.println(p);
}
public TwoOb(int a,int b)
{
int c=a*b;
System.out.println(c);
}
public void add()
{
int k=3;int l=5;
int j=k+l;
p=j;
}}
