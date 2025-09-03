package Lession1.Example3;

import Lession1.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }

     // we have not made this extendable
    // on the scale of srp it is better code
    // design principals with respect to some reference frame


}