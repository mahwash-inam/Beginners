import java.util.*;
import java.io.*;

 public class FamilyMember
{
public int noOfMALE;
public int noOfFEMALE;
public int noOfBABY;
public String season="Festival";

public FamilyMember(int MALE, int FEMALE, int BABY)
{
	this.noOfMALE=MALE;
	this.noOfFEMALE=FEMALE;
	this.noOfBABY=BABY;
}
}
 public interface stichingCharges
{
 public float MalePenguin=120.f;
 public float FemalePenguin=145.0f;
 public float BabyPenguine=70.f;
 
 public void festivalHike();
 public void discount();
 }
 
 public class Penguine extends FamilyMember implements stichingCharges
 {
 public float total;
 public void festivalHike()
 {
	float mCharge= ((MalePenguin*105)/100)*noOfMALE;
	float fCharge= ((FemalePenguin*107)/100)*noOfFEMALE;
	float bCharge=((BabyPenguine*103)/100)*noOfBABY;
	total=mCharge+fCharge+bCharge;
}	
      
public void discount()
{
 if(total>1000)
 {
	if(total>2000)
	{
	total=((total*75)/100);
	}
	total=((total*90)/100);
	}
	System.out.print(total);
}
	
}
public class PenguineDay
{
	public static void main(String args[])
	{
FamilyMember family= new FamilyMember(2,1,1);
Penguine ch= new Penguine();
ch.discount();
//System.out.print(t);

FamilyMember family1= new FamilyMember(3,4,1);
Penguine ch1= new Penguine();
ch1.discount();
//System.out.print(f);
}
}
	
	




