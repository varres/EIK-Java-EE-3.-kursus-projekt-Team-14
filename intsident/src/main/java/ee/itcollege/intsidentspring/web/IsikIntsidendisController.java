package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.IsikIntsidendis;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "isikintsidendises", formBackingObject = IsikIntsidendis.class)
@RequestMapping("/isikintsidendises")
@Controller
public class IsikIntsidendisController {
}
