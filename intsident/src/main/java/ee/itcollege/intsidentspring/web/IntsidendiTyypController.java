package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.IntsidendiTyyp;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "intsidendityyps", formBackingObject = IntsidendiTyyp.class)
@RequestMapping("/intsidendityyps")
@Controller
public class IntsidendiTyypController {
}
