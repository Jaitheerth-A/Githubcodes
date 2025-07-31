import java.util.*;
class worker
{
   static float hourlywage;
   private final int empno;
   private int hours;
   private double pay;

   worker(int empno,int hours)
   {
     this.empno=empno;
     this.hours=hours;
     pay=calc(hours);
    }

   double calc(int hours)
   {
     this.hours=hours;
     if(hours<40)
     {pay+=(hours*hourlywage);}
else{pay+=(hours-40)*hourlywage*1.5;pay+=hourlywage*40;}
      return pay;
   }
    static void setHourlyWage(float hw)
    {
      while(true){
      hourlywage=hw;
       if(hw<0){System.out.println("Hourly wage cannot be negative!");}
       else{break;}
       }
    }

   static void show(worker w[])
   {
    System.out.println("EMPLOYEE\t\tPAY\t\tHOURS");
    for(worker a:w)
    {System.out.println(a.empno+"\t\t"+a.pay+"\t\t"+a.hours);}
    }

}
public class wage
{
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in);)
        {
            int n;System.out.print("Enter number of employees:");
            n=sc.nextInt();
            int empno,h;float hw;
            System.out.print("Enter hourly wage:");hw=sc.nextFloat();
            worker.setHourlyWage(hw);
            worker a[]=new worker[n];
            System.out.println("Enter details of employees:");
            for(int i=0;i<n;i++)
            {
             System.out.print("Enter employee number:");empno=sc.nextInt();
             System.out.print("Enter number of hours of work(this week):");h=sc.nextInt();
             a[i]=new worker(empno,h);
            }
            worker.show(a); 
        }
    }
}