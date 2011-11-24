package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.Bear;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "bears", formBackingObject = Bear.class)
@RequestMapping("/bears")
@Controller
public class BearController {
}
