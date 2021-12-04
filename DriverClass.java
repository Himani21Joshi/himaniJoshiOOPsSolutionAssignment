package assignment;

public class DriverClass 
{
    public static void main(String []args)
    {
        System.out.println("Welcome to Admin Department");
        AdminDepartment ad = new AdminDepartment();
        System.out.println(ad.getGetTodaysWork());
        System.out.println(ad.getGetWorkDeadline());
        System.out.println(ad.getIsTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to HR Department");
        HRDepartment hd = new HRDepartment();
        System.out.println(hd.getdoActivity());
        System.out.println(hd.getGetTodaysWork());
        System.out.println(hd.getGetWorkDeadline());
        System.out.println(hd.getIsTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to Tech Department");
        TechDepartment td = new TechDepartment();
        System.out.println(td.getGetTodaysWork());
        System.out.println(td.getGetWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.getIsTodayAHoliday());
        System.out.println();
    }
}
