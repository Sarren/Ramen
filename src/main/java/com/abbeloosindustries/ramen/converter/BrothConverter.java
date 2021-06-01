package com.abbeloosindustries.ramen.converter;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.services.BrothService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Set;

import static java.lang.Long.parseLong;

@Component
public class BrothConverter implements Converter<String, Broth> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BrothConverter.class);

    @Autowired
    private BrothService brothService;

    @Override
    public Broth convert(String brothType) {
        //System.out.println("Adding broth with id " + brothId + " type " + brothService.findById(id).getType());
        LOGGER.error("converter executed");
        Broth broth = brothService.findBrothByType(brothType);
        LOGGER.error(brothType);
        LOGGER.error(brothService.findById(1L).toString());
        return broth;
    }
}
