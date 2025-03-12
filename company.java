public class company
{
Static String companyName = "TCS";
String employeeName;
Company(String myemployee)
{
this.employeeName=myemployeeName;
}
void display()
{
System.out.println("company:"+companyName);
System.out.println("employee:"+employeeName);
}
public static void main(String args[])
{
company c1 = new  company("Priya");
company c2 = new  company("gokulam");
c1.display();
c2.display();
companyName="TechSys";
c1.display();
c2.display();
}
}
