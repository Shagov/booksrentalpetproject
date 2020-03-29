package com.shahov.cdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class SessionService {

    private HttpSession httpSession;


    @Autowired
    public void setHttpSession(HttpSession httpSession) {
        this.httpSession = httpSession;
    }
}
