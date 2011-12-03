package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.PiirivalvurIntsidendis;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piirivalvurintsidendises", formBackingObject = PiirivalvurIntsidendis.class)
@RequestMapping("/piirivalvurintsidendises")
@Controller
public class PiirivalvurIntsidendisController {
}
