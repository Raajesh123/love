package org.dem;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReport {
public static void getjvmreport(String Json) {
	File f=new File("All Report\\Jvm Report");
Configuration c=new Configuration(f, "Hotwire");
c.addClassifications("Application", "Hotwire");
c.addClassifications("Platform", "Chromebrowser");
c.addClassifications("os", "Windows 10");
List <String>l = new ArrayList();
l.add(Json);
ReportBuilder r = new ReportBuilder(l, c);
Reportable r2 = r.generateReports();

}
}
