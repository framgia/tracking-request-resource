package framgia.co.edu.ftrr.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @PostMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/wsm-login")
    public String wsmLogin() {
        return "login";
    }

}
