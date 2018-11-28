package com.lifebuds.backingbean;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.lifebuds.domain.UploadImage;
import com.lifebuds.service.ServiceFactory;

public class Image_Backingbean {

	String subject = null;
	String subjectName = null;
	String detail = null;
	String detailName = null;

	public String processRequest(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("in image backingbean");
		String command = null;
		String path = null;

		command = "addpicture";
		if (command.equals("addpicture")) {
			System.out.println(request.getParameter("file"));
			File file;
			int maxFileSize = 5000 * 1024;
			int maxMemSize = 5000 * 1024;
			// ServletContext context = pageContext.getServletContext();

			String filePath = "E:/project/workspace/LIFE_BUDS/WebContent/UploadedFile/";

			// Verify the content type
			String contentType = request.getContentType();

			if ((contentType.indexOf("multipart/form-data") >= 0)) {

				DiskFileItemFactory factory = new DiskFileItemFactory();
				// maximum size that will be stored in memory
				factory.setSizeThreshold(maxMemSize);
				// Location to save data that is larger than maxMemSize.
				factory.setRepository(new File("c:\\temp"));

				// Create a new file upload handler
				ServletFileUpload upload = new ServletFileUpload(factory);
				// maximum file size to be uploaded.
				upload.setSizeMax(maxFileSize);
				try {
					// Parse the request to get file items.
					List fileItems = upload.parseRequest(request);
					/* ****** */

					// Process the uploaded file items
					Iterator i = fileItems.iterator();

					/*
					 * out.println("<jsp:forward page=\"../Traffic/admin.jsp\">")
					 * ;
					 */
					while (i.hasNext()) {
						FileItem fi = (FileItem) i.next();
						/* ******* */System.out.println("fileIem=" + fi);
						if (!fi.isFormField()) {
							// Get the uploaded file parameters .. alll
							// parrameters are available in this file part
							// iteeratioln
							String fieldName = fi.getFieldName();
							String fileName = fi.getName();

							System.out.println(fieldName + "*** " + fileName);

							Date date = new Date();
							Long pat = date.getTime();
							fileName = pat.toString();
							fileName = fileName + ".jpg";
							path = fileName;

							path = fileName;

							boolean isInMemory = fi.isInMemory();
							long sizeInBytes = fi.getSize();
							// Write the file
							if (fileName.lastIndexOf("\\") >= 0) {
								file = new File(filePath
										+ fileName.substring(fileName
												.lastIndexOf("\\")));
							} else {
								file = new File(filePath
										+ fileName.substring(fileName
												.lastIndexOf("\\") + 1));
							}
							fi.write(file);

						}
						if (fi.isFormField())// accessing values from the form
												// fields input boxes
						{
							String fieldName = fi.getFieldName();
							String fileName = fi.getName();

							if (fieldName.equals("detail")) {
								detail = fi.getString();
								System.out.println(detail);
							}

						}

					}
					UploadImage aware = new UploadImage();
					aware.setDesc(detail);
					aware.setImagepath(path);
					System.out.println(aware.toString() + ".........");

					ServiceFactory.getInsertServiceImpl().insertImage(aware);

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			return "../Life/admin.jsp";

		}

		return command;
	}

}
