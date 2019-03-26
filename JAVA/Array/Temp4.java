class Temp4{
int x=10;
void show(int y)
{
System.out.println(this.x);
System.out.println(y);
}
public static void main(String...s)
{
Temp4 r=new Temp4();
r.show(20);
System.out.println(r.x);
}
}