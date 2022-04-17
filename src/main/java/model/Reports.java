package model;

import javax.persistence.Entity;
import javax.persistence.Lob;

import org.springframework.data.annotation.Id;

@Entity
public class Reports {
	@Id
	private String id;
	private String filename;
	private String filetype;
	
	@Lob
	private byte[] data;
	
	public Reports() {
		
	}

	public Reports(String id, String filename, String filetype, byte[] data) {
		super();
		this.id = id;
		this.filename = filename;
		this.filetype = filetype;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
}
