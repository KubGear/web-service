package com.kubgear.webservice.service;

import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Calendar;

/**
 * todo Document type TimeRepository
 */
@Component
public class TimeRepository {
    public Calendar getTime() throws DatatypeConfigurationException {
       return Calendar.getInstance();
    }
}
