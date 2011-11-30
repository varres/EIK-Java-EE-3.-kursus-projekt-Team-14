// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.intsidentspring.web;

import ee.itcollege.intsidentspring.entities.IntsidendiLiik;
import ee.itcollege.intsidentspring.entities.Intsident;
import ee.itcollege.intsidentspring.entities.Objekt;
import ee.itcollege.intsidentspring.entities.Piiriloik;
import ee.itcollege.intsidentspring.entities.Vahtkond;
import ee.itcollege.intsidentspring.entities.VahtkondIntsidendis;
import java.lang.String;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(new IntsidendiLiikConverter());
        registry.addConverter(new IntsidentConverter());
        registry.addConverter(new ObjektConverter());
        registry.addConverter(new PiiriloikConverter());
        registry.addConverter(new VahtkondConverter());
        registry.addConverter(new VahtkondIntsidendisConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.IntsidendiLiikConverter implements Converter<IntsidendiLiik, String> {
        public String convert(IntsidendiLiik intsidendiLiik) {
            return new StringBuilder().append(intsidendiLiik.getKood()).append(" ").append(intsidendiLiik.getNimetus()).append(" ").append(intsidendiLiik.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.IntsidentConverter implements Converter<Intsident, String> {
        public String convert(Intsident intsident) {
            return new StringBuilder().append(intsident.getKood()).append(" ").append(intsident.getNimetus()).append(" ").append(intsident.getToimumise_algus()).append(" ").append(intsident.getToimumise_lopp()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.ObjektConverter implements Converter<Objekt, String> {
        public String convert(Objekt objekt) {
            return new StringBuilder().append(objekt.getNimetus()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.PiiriloikConverter implements Converter<Piiriloik, String> {
        public String convert(Piiriloik piiriloik) {
            return new StringBuilder().append(piiriloik.getKood()).append(" ").append(piiriloik.getNimetus()).append(" ").append(piiriloik.getGPS_koordinaadid()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.VahtkondConverter implements Converter<Vahtkond, String> {
        public String convert(Vahtkond vahtkond) {
            return new StringBuilder().append(vahtkond.getNimetus()).append(" ").append(vahtkond.getKommentaar()).toString();
        }
        
    }
    
    static class ee.itcollege.intsidentspring.web.ApplicationConversionServiceFactoryBean.VahtkondIntsidendisConverter implements Converter<VahtkondIntsidendis, String> {
        public String convert(VahtkondIntsidendis vahtkondIntsidendis) {
            return new StringBuilder().append(vahtkondIntsidendis.getKirjeldus()).append(" ").append(vahtkondIntsidendis.getKommentaar()).toString();
        }
        
    }
    
}
