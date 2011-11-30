package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.VahtkondIntsidendis;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "vahtkondintsidendises", formBackingObject = VahtkondIntsidendis.class)
@RequestMapping("/vahtkondintsidendises")
@Controller
public class VahtkondIntsidendisController {
}
