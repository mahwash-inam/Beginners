// From jdk 1.8 we can define this by ourself.

class Temp3
{
int x=10;
void get(Temp3 this, int y)
{
System.out.println(this+ "get");
System.out.println(this.x);
System.out.println(y);
}
public static void main(String...st)
{
Temp3 t1= new Temp3();
System.out.println(t1+ "main");
t1.get(20);

}
}