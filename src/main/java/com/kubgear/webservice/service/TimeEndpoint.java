package com.kubgear.webservice.service;

import com.kubgear.webservice.GetTimeResponse;
import com.kubgear.webservice.GetTimeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;

/**
 * todo Document type TimeEndpoint
 */
@Endpoint
public class TimeEndpoint {
    private static final String NAMESPACE_URI = "http://webservice.kubgear.com";

    private TimeRepository timeRepository;

    @Autowired
    public TimeEndpoint(TimeRepository timeRepository){
        this.timeRepository = timeRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTimeRequest")
    @ResponsePayload
    public GetTimeResponse getTimeResponse(@RequestPayload GetTimeRequest getTimeRequest) throws DatatypeConfigurationException {
        GetTimeResponse response = new GetTimeResponse();

        response.setTime(timeRepository.getTime());
        return response;
    }
}
