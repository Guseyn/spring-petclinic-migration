package org.springframework.samples.petclinic.system;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ConfigurationProperties("app")
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }
}
