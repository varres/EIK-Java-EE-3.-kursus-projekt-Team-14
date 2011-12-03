package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.Piiririkkuja;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "piiririkkujas", formBackingObject = Piiririkkuja.class)
@RequestMapping("/piiririkkujas")
@Controller
public class PiiririkkujaController {
}
