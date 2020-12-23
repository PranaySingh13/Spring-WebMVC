package com.gk.controller;

import java.io.FileOutputStream;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String showUploadForm() {
		return "uploadForm";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ModelAndView uploadFiles(@RequestParam MultipartFile[] file) {
		String status = "";
		try {
			for (MultipartFile multipartFile : file) {
				String fileName = multipartFile.getOriginalFilename();
				byte[] fileContent = multipartFile.getBytes();// converting file into byte array
				FileOutputStream fos = new FileOutputStream("F:/" + fileName);
				fos.write(fileContent);// write ary.length bytes from the byte array to the file output stream.
				status = "Success";
			}
		} catch (Exception e) {
			status = "Failure";
		}

		return new ModelAndView("status", "status", status);
	}
}
