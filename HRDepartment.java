package assignment;

public class HRDepartment extends SuperDepartment{
    public String departmentName;
    public String getTodaysWork;
    public String getWorkDeadline;
    public String doActivity;
    
    @Override
    public String getdepartmentName() {
        return "HR Department";
    }

    @Override
    public String getGetTodaysWork() {
        return "Fill today's timesheet and mark your attendance";
    }

    @Override
    public String getGetWorkDeadline() {
        return "Complete by EOD";
    }
    
    public String getdoActivity() {
        return "team Lunch";
    }
}
