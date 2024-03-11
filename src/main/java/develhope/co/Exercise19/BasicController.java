package develhope.co.Exercise19;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {
    private String devName = "Giulio";
    @GetMapping
    public String getDevName(){
        return devName;
    }
}
