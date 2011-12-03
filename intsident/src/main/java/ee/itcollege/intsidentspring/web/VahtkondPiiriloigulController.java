package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.VahtkondPiiriloigul;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vahtkondpiiriloiguls", formBackingObject = VahtkondPiiriloigul.class)
@RequestMapping("/vahtkondpiiriloiguls")
@Controller
public class VahtkondPiiriloigulController {
}
