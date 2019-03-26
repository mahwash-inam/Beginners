class Empcons
{
int sal;
Empcons(Empcons this)
{
this.sal=15000;
return this;
}
public static void main(String...s)
{
Empcons e1= new Empcons();
}
}