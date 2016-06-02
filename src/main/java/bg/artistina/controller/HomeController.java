package bg.artistina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bg.artistina.model.User;
import bg.artistina.repository.UserRepository;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String home(Model model) {
        User user = userRepository.findOne(1);
        model.addAttribute("user", user);
        return "home";
    }
}
