package pl.coderslab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.dao.TweetDao;
import pl.coderslab.entity.Tweeter_tweet;


@Controller
public class TweetController {

	@Autowired
	TweetDao tweetDao;
	
	@GetMapping("/tweet/{id}")
	public String findTweet(@PathVariable long id){
		Tweeter_tweet tweeter_tweet = tweetDao.findById(id);
		return "user/list";
}
//	@GetMapping("/user/search-tweets/{start}")
//	public String findStart(@PathVariable String start){
//		Tweeter_tweet tweeter_tweet = tweetDao.getListStart()
	

@RequestMapping(value = "/tweet/add", method = RequestMethod.POST)
	public	String	tweetAdd(Model	model)	{
	Tweeter_tweet tweeter_tweet  =	new	Tweeter_tweet();
		model.addAttribute("tweeter_tweet",	tweeter_tweet);
				return	"user/success";
	
}
}
