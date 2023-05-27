package ecr.web.app.shared.dto;

import java.io.Serializable;

public class FileDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  static String UPLOAD_DIRECTORY ;

	public  String getUPLOAD_DIRECTORY() {
		return UPLOAD_DIRECTORY;
	}

	public  void setUPLOAD_DIRECTORY(String uPLOAD_DIRECTORY) {
		UPLOAD_DIRECTORY = uPLOAD_DIRECTORY;
	}
public FileDTO(){}
}
