package kr.narp.myapp1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {
	
	@RequestMapping("/upload.do")
	public String upload(MultipartHttpServletRequest multipartRequest, HttpServletRequest request) {
		
		// id, name
		Map map=new HashMap(); // (KEY, VALUE)
//		String id = multipartRequest.getParameter("id");
//		String name = multipartRequest.getParameter("name");
		// Enumeration -> 나열, 열거형
		Enumeration<String> e = multipartRequest.getParameterNames(); // id, name
		while(e.hasMoreElements()) {
			String name =e.nextElement(); // id
			String value=multipartRequest.getParameter(name);
//			System.out.println(name+":"+value);
			map.put(name, value);
		}
		
		// 파일을 담고 있는 파라메터 읽어오기
		Iterator<String> it=multipartRequest.getFileNames(); // 파일이름이 아니라 -> 파라메터 이름(file1, file2...)
		
		return "";
	}
}
