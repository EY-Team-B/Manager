package controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import model.Reports;
import service.ReportsServices;

@RestController
//@RequestMapping("file")
public class MyController {
	
	@Autowired
	private ReportsServices services;
//	@GetMapping("/")
//	public String welcome() {
//		System.out.println("Welcome");
//		return "Welcome to console";
//	}
	@PostMapping
	public Reports uploadReport(@RequestParam("file") MultipartFile file) throws IOException{
		return services.store(file);
	}
	@GetMapping("/{id}")
	public Reports getReport(@PathVariable String id) {
		return services.getReportById(id);
	}
	@GetMapping("/list")
	public List<Reports> getReportsList(){
		return services.getReportsList();
	}
}
