package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.IntsidendiLiik;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "intsidendiliiks", formBackingObject = IntsidendiLiik.class)
@RequestMapping("/intsidendiliiks")
@Controller
public class IntsidendiLiikController {
}
