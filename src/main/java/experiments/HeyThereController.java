package experiments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeyThereController {

    @RequestMapping("/")
    public String index(){
        return "Experimental setup!";
    }

}
