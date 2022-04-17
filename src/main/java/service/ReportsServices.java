
package service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import dao.ReportsRepository;
import model.Reports;

@Service
public class ReportsServices {

	@Autowired
	ReportsRepository repo;
	public Reports store(MultipartFile file) throws IOException {
		String fileName = file.getOriginalFilename();
		Reports fileDb = new Reports(UUID.randomUUID().toString(), fileName, file.getContentType(), file.getBytes());
		return repo.save(fileDb);
	}
	public Reports getReportById(String id) {
		Optional<Reports> reportOptional=repo.findById(id);
		if(reportOptional.isPresent()) {
			return reportOptional.get();
		}
		return null;	
	}
	public List<Reports> getReportsList(){
		return repo.findAll();
	}
}
