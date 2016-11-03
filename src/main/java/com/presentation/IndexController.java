package com.presentation;

import com.domain.Book;
import com.domain.Reader;
import com.repository.ReaderRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by dragana.nikolovska on 10/31/2016.
 */
@Controller
@RequestMapping("/")
@AllArgsConstructor
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public @ResponseBody String index(){
        LOGGER.info("GET Request for index page");
        return "home";
    }


}
