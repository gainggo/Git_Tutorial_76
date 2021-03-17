@Controller 
public class UserController {
	
	// 로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login() {
		logger.info("url ==> login.do");
		return "user/login";
	}

	// insert
	@RequestMapping("/user/insert.do")
	public String insert() {
		logger.info("url ==> insert.do");
		return "user/insert";
	}

	// update
	@RequestMapping("/user/update.do")
	public String update() {
		logger.info("url ==> update.do");
		return "user/update";
	}

	// delete
	@RequestMapping("/user/delete.do")
	public String delete() {
		logger.info("url ==> delete.do"):
		return "user/delete";
	}

}