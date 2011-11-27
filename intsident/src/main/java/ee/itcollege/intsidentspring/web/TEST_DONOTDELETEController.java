package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.TEST_DONOTDELETE;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "test_donotdeletes", formBackingObject = TEST_DONOTDELETE.class)
@RequestMapping("/test_donotdeletes")
@Controller
public class TEST_DONOTDELETEController {
}
