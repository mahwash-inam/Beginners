class Emp4
{
String name;

void get(String s1)
{
name=s1;
}
 
 void show()
 {
 System.out.println("Name:"+name);
 }
 
 public static void main(String...s)
{
 Emp4 w=new Emp4();
 System.out.println(w);
 w.name="lalu";
 w.show();
 
 Emp4 v= w;
 System.out.println(v);
 v.name="bhalu";
 System.out.println(w.name);
 }
 }