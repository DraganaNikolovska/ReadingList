package com.presentation;

import com.domain.Reader;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Dragana.Nikolovska on 11/2/2016.
 */
@RequestMapping("/")
@AllArgsConstructor
@Controller
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

 /*   @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@ModelAttribute(value = "reader")Reader reader){
        LOGGER.debug("post Logged in.");
        LOGGER.info("post info - logged in");
        System.out.println(reader);
        return "readingList";
    }*/
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String getLogin(Model model){
        LOGGER.info("GET Request for login");
        model.addAttribute("reader", new Reader());
        return "login";
    }

}
