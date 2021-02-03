package in.balamt.java.springboot.jsp.formsubmission;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeedbackController {

	static Logger logger = Logger.getLogger(FeedbackController.class.getName());

	@GetMapping("")
	public String indexView() {
		return "index";
	}

	@RequestMapping("/feedbackForm")
	public String saveFeedback(@RequestParam("feedback") String feedback) {
		logger.info("Data from Feedback form is = " + feedback);
		return "index";
	}

	@RequestMapping("/feedbackForm1")
	public String saveAndDisplayFeedback(Model model, @RequestParam("feedback") String feedback) {
		logger.info("Data to feedback.jsp is = " + feedback);
		model.addAttribute("feedbackData", feedback);
		return "feedback";
	}

}
