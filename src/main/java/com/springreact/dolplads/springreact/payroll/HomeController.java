package com.springreact.dolplads.springreact.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dolplads on 07/06/2017.
 */
@Controller
public class HomeController {

    /**
     * View resolver will map to src/main/resources/templates/index.html
     *
     * @return index as the name of the template
     */
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
