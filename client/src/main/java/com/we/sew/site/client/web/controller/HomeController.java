package com.we.sew.site.client.web.controller;

import com.we.sew.site.client.web.WebUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vladyslav_Yemelianov
 */
@Controller
public class HomeController {

    @RequestMapping(value = {WebUtil.Mapping.ROOT, WebUtil.Mapping.HOME}, method = RequestMethod.GET)
    public String home() {

        return WebUtil.View.HOME;
    }
}
