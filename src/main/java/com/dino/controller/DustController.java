package com.dino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dino.dto.DustVO;
import com.dino.service.DustService;

@Controller
public class DustController {

    @Autowired
    private DustService dustService;

    @GetMapping("/dust")
    public String dustList(Model model) {
        List<DustVO> list = dustService.fetchDustList();
        model.addAttribute("dustList", list);
        return "dust/dustList";  //views/dust/dustList.jsp
    }
}
