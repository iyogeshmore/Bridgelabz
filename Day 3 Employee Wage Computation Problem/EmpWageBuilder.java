package Bridgelabz;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final int numOfCompany = 0;
    private final LinkedList<CompanyEmpWage> companyEmpWageList = new LinkedList();
    private final Map<String, CompanyEmpWage> companyToEmpWageMap = new HashMap();

    public EmpWageBuilder() {
    }

    public void addCompanyEmpWage(String var1, int var2, int var3, int var4) {
        CompanyEmpWage var5 = new CompanyEmpWage(var1, var2, var3, var4);
        this.companyEmpWageList.add(var5);
        this.companyToEmpWageMap.put(var1, var5);
    }

    public void computeEmpWage() {
        for(int var1 = 0; var1 < this.companyEmpWageList.size(); ++var1) {
            CompanyEmpWage var2 = this.companyEmpWageList.get(var1);
            var2.setTotalEmpWage(this.computeEmpWage(var2));
            System.out.println(var2);
        }

    }

    public int getTotalWage(String var1) {
        return this.companyToEmpWageMap.get(var1).totalEmpWage;
    }

    public int computeEmpWage(CompanyEmpWage var1) {
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;

        while(var3 <= var1.maxHoursPerMonth && var4 < var1.numOfWorkingDays) {
            ++var4;
            int var5 = (int)Math.floor(Math.random() * 10.0D) % 3;
            byte var6;
            switch(var5) {
                case 1:
                    var6 = 4;
                    break;
                case 2:
                    var6 = 8;
                    break;
                default:
                    var6 = 0;
            }

            var3 += var6;
            System.out.println("Day#: " + var4 + " Emp Hr: " + var6);
        }

        return var3 * var1.empRatePerHour;
    }

    public static void main(String[] var0) {
        EmpWageBuilder var1 = new EmpWageBuilder();
        var1.addCompanyEmpWage("TCS", 20, 10, 10);
        var1.addCompanyEmpWage("Infosys", 10, 8, 20);
        var1.computeEmpWage();
        System.out.println("Total Wage for TCS Company: " + var1.getTotalWage("TCS"));
        System.out.println("Total Wage for Infosys Company: " + var1.getTotalWage("Infosys"));
    }
}
