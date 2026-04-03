package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentReportManager {

    private static final String reportDir = System.getProperty("user.dir")+"/test-output/Reports/ndosiAutomation.html";

    private static ExtentReports extentReports;

    private static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentReports(){

        extentReports  = new ExtentReports();

        extentSparkReporter = new ExtentSparkReporter(new File(reportDir));

        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Ndosi Automation");

        extentSparkReporter.config().setTheme(Theme.STANDARD);

        extentSparkReporter.config().setReportName("Ndosi Automation");

        extentReports.setSystemInfo("OS",System.getProperty("OS.name"));

        extentReports.setSystemInfo("Execution Machine",System.getProperty("user.name"));

        return extentReports;
    }
}

