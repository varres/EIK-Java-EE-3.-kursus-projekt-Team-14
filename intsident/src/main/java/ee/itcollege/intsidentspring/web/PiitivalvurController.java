package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.Piirivalvur;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piitivalvurs", formBackingObject = Piirivalvur.class)
@RequestMapping("/piitivalvurs")
@Controller
public class PiitivalvurController {
}
