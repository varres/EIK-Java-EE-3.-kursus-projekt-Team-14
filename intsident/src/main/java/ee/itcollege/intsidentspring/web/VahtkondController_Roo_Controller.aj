// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.Vahtkond;
import java.io.UnsupportedEncodingException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect VahtkondController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST)
    public String VahtkondController.create(@Valid Vahtkond vahtkond, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("vahtkond", vahtkond);
            addDateTimeFormatPatterns(uiModel);
            return "vahtkonds/create";
        }
        uiModel.asMap().clear();
        vahtkond.persist();
        return "redirect:/vahtkonds/" + encodeUrlPathSegment(vahtkond.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", method = RequestMethod.GET)
    public String VahtkondController.createForm(Model uiModel) {
        uiModel.addAttribute("vahtkond", new Vahtkond());
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/create";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String VahtkondController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("vahtkond", Vahtkond.findVahtkond(id));
        uiModel.addAttribute("itemId", id);
        return "vahtkonds/show";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String VahtkondController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            uiModel.addAttribute("vahtkonds", Vahtkond.findVahtkondEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Vahtkond.countVahtkonds() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("vahtkonds", Vahtkond.findAllVahtkonds());
        }
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String VahtkondController.update(@Valid Vahtkond vahtkond, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            uiModel.addAttribute("vahtkond", vahtkond);
            addDateTimeFormatPatterns(uiModel);
            return "vahtkonds/update";
        }
        uiModel.asMap().clear();
        vahtkond.merge();
        return "redirect:/vahtkonds/" + encodeUrlPathSegment(vahtkond.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", method = RequestMethod.GET)
    public String VahtkondController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("vahtkond", Vahtkond.findVahtkond(id));
        addDateTimeFormatPatterns(uiModel);
        return "vahtkonds/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String VahtkondController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Vahtkond.findVahtkond(id).remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/vahtkonds";
    }
    
    @ModelAttribute("vahtkonds")
    public Collection<Vahtkond> VahtkondController.populateVahtkonds() {
        return Vahtkond.findAllVahtkonds();
    }
    
    void VahtkondController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("vahtkond_alates_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("vahtkond_kuni_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    String VahtkondController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        }
        catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
