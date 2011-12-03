// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.IntsidendiTyyp;
import ee.itcollege.intsidentspring.entities.Intsident;
import ee.itcollege.intsidentspring.entities.IsikIntsidendis;
import ee.itcollege.intsidentspring.entities.Objekt;
import ee.itcollege.intsidentspring.entities.ObjektIntsidendis;
import ee.itcollege.intsidentspring.entities.Piiriloik;
import ee.itcollege.intsidentspring.entities.Piiririkkuja;
import ee.itcollege.intsidentspring.entities.PiirivalvurIntsidendis;
import ee.itcollege.intsidentspring.entities.Vahtkond;
import ee.itcollege.intsidentspring.entities.VahtkondIntsidendis;
import ee.itcollege.intsidentspring.entities.VahtkondPiiriloigul;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new IntsidendiTyypConverter());
        registry.addConverter(new IntsidentConverter());
        registry.addConverter(new IsikIntsidendisConverter());
        registry.addConverter(new ObjektConverter());
        registry.addConverter(new ObjektIntsidendisConverter());
        registry.addConverter(new PiiriloikConverter());
        registry.addConverter(new PiiririkkujaConverter());
        registry.addConverter(new PiirivalvurIntsidendisConverter());
        registry.addConverter(new VahtkondConverter());
        registry.addConverter(new VahtkondIntsidendisConverter());
        registry.addConverter(new VahtkondPiiriloigulConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.IntsidendiTyypConverter implements Converter<IntsidendiTyyp, String> {
        public String convert(IntsidendiTyyp intsidendiTyyp) {
            return new StringBuilder().append(intsidendiTyyp.getKood()).append(" ").append(intsidendiTyyp.getNimetus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.IntsidentConverter implements Converter<Intsident, String> {
        public String convert(Intsident intsident) {
            return new StringBuilder().append(intsident.getKood()).append(" ").append(intsident.getNimetus()).append(" ").append(intsident.getToimumise_algus()).append(" ").append(intsident.getToimumise_lopp()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.IsikIntsidendisConverter implements Converter<IsikIntsidendis, String> {
        public String convert(IsikIntsidendis isikIntsidendis) {
            return new StringBuilder().append(isikIntsidendis.getAlates()).append(" ").append(isikIntsidendis.getKuni()).append(" ").append(isikIntsidendis.getKirjeldus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.ObjektConverter implements Converter<Objekt, String> {
        public String convert(Objekt objekt) {
            return new StringBuilder().append(objekt.getNimetus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.ObjektIntsidendisConverter implements Converter<ObjektIntsidendis, String> {
        public String convert(ObjektIntsidendis objektIntsidendis) {
            return new StringBuilder().append(objektIntsidendis.getAlates()).append(" ").append(objektIntsidendis.getKuni()).append(" ").append(objektIntsidendis.getKirjeldus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.PiiriloikConverter implements Converter<Piiriloik, String> {
        public String convert(Piiriloik piiriloik) {
            return new StringBuilder().append(piiriloik.getKood()).append(" ").append(piiriloik.getNimetus()).append(" ").append(piiriloik.getGPS_koordinaadid()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.PiiririkkujaConverter implements Converter<Piiririkkuja, String> {
        public String convert(Piiririkkuja piiririkkuja) {
            return new StringBuilder().append(piiririkkuja.getIsikukood()).append(" ").append(piiririkkuja.getEesnimi()).append(" ").append(piiririkkuja.getPerenimi()).append(" ").append(piiririkkuja.getSugu()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.PiirivalvurIntsidendisConverter implements Converter<PiirivalvurIntsidendis, String> {
        public String convert(PiirivalvurIntsidendis piirivalvurIntsidendis) {
            return new StringBuilder().append(piirivalvurIntsidendis.getAlates()).append(" ").append(piirivalvurIntsidendis.getKuni()).append(" ").append(piirivalvurIntsidendis.getKirjeldus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.VahtkondConverter implements Converter<Vahtkond, String> {
        public String convert(Vahtkond vahtkond) {
            return new StringBuilder().append(vahtkond.getKood()).append(" ").append(vahtkond.getNimetus()).append(" ").append(vahtkond.getAlates()).append(" ").append(vahtkond.getKuni()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.VahtkondIntsidendisConverter implements Converter<VahtkondIntsidendis, String> {
        public String convert(VahtkondIntsidendis vahtkondIntsidendis) {
            return new StringBuilder().append(vahtkondIntsidendis.getAlates()).append(" ").append(vahtkondIntsidendis.getKuni()).append(" ").append(vahtkondIntsidendis.getKirjeldus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.VahtkondPiiriloigulConverter implements Converter<VahtkondPiiriloigul, String> {
        public String convert(VahtkondPiiriloigul vahtkondPiiriloigul) {
            return new StringBuilder().append(vahtkondPiiriloigul.getAlates()).append(" ").append(vahtkondPiiriloigul.getKuni()).toString();
        }
        
    }
    
}
