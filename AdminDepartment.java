package assignment;

public class AdminDepartment extends SuperDepartment{
    public String departmentName;
    public String getTodaysWork;
    public String getWorkDeadline;
    
    @Override
    public String getdepartmentName() {
        return "Admin Department";
    }
    
    @Override
    public String getGetTodaysWork() {
        return "Complete your documents Submission";
    }
    
    @Override
    public String getGetWorkDeadline() {
        return "Complete by EOD";
    }    
}
