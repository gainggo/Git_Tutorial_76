@Controller 
public class UserController {
	
	// 로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("url ==> login.do");
		return "user/login";
	}
}