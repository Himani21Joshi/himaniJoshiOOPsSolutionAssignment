package assignment;

public class TechDepartment  extends SuperDepartment
{
    public String departmentName;
    public String getTodaysWork;
    public String getWorkDeadline;
    public String getTechStackInformation;
    
    @Override
    public String getdepartmentName() {
        return "Tech Department";
    }
    
    @Override
    public String getGetTodaysWork() {
        return "Complete coding of module 1";
    }
    
    @Override
    public String getGetWorkDeadline() {
        return "Completed by EOD";
    }
    
    public String getTechStackInformation() {
        return "Core Java";
    }
}

