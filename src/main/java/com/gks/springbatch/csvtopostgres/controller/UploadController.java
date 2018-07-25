package com.gks.springbatch.csvtopostgres.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gks.springbatch.csvtopostgres.constants.UploadConstants;
@RestController
public class UploadController {
	
	
	@PutMapping(value = UploadConstants.UPLOAD_URI)
	public void uploadFile(@RequestParam("file") MultipartFile inputFile) {
		
	}

}
