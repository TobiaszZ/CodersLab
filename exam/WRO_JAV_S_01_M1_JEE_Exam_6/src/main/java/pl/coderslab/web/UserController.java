package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.dao.TweetDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.entity.Tweeter_tweet;
import pl.coderslab.entity.Tweeter_user;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	
	@GetMapping("/user")
	public String showList(Model model){
		model.addAttribute("tweeter_user", userDao.getList());
		return "user/list";
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public	String	userAdd(Model	model)	{
	Tweeter_user tweeter_user 	=	new	Tweeter_user();
		model.addAttribute("tweeter_user",	tweeter_user);
				return	"user/success";
}
	@RequestMapping(value = "user/delete/{id}",  method = RequestMethod.GET)
	public String deleteUser(@PathVariable long id) {
		Tweeter_user tweeter_user  = userDao.findById(id);
		userDao.delete(tweeter_user);
		return "redirect: ../list";
	}
	@GetMapping("/user/edit/{id}")
	public String editBurger(Model model, @PathVariable long id){
		Tweeter_user tweeter_user = userDao.findById(id);
		model.addAttribute("tweeter_user", tweeter_user);
		return "user/list";
}
}