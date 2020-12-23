package com.gk.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DownloadController {

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public String showDownloadPage() {
		return "downloadPage";
	}

	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public void download(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("APPLICATION/OCTET-STREAM");
		File file = new File("C:\\Users\\acer\\Pictures\\SuperNova SideView.jpg");
		FileInputStream fis = new FileInputStream(file);
		String fileName = file.getName();
		response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
		OutputStream os = response.getOutputStream();
		int value = fis.read();
		while (value != -1) {
			os.write(value);
			value = fis.read();
		}
		fis.close();
		os.close();
	}
}
