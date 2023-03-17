package com.jvm.repo;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportclass {

	public static void repo(String passrepor) {
	
         
		// mention the target folder location file
		File f = new File("C:\\Users\\Bharathi\\eclipse-workspace\\Mavencucum\\src\\test\\resources");
		  
		// add details to the report using configuration
		Configuration c = new Configuration(f, "facebook");
		c.addClassifications("browser", "chrome");
		c.addClassifications("bharathi", "pass");
		
		
		//add Json file path into list<string>
		List<String> l = new LinkedList<String>();
		
		l.add(passrepor);
		
		// Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(l, c);
		
		// using the created object call generate report 
		r.generateReports();
		
	}

	
	
	
	
}
