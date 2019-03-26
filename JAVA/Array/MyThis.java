class MyThis
{
int x=10;
void show(MyThis this, int y)
{
System.out.println(this + "get");
System.out.println(this.x);
System.out.println(y);
}
public static void main(String args[])
{
MyThis mt = new MyThis();
System.out.println(mt+"main");
mt.get(16);

}
} 