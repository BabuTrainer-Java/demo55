package demo890;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String getHello()
	{
	return "hello Springboot ";	
	}
	
}
