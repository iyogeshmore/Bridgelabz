package Bridgelabz;

public interface IComputeEmpWage2 {
    void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
    void computeEmpWage();
    int getTotalWage(String company);
}
