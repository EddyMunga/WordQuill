package com.eddy.wordquill.controllers;

import com.eddy.wordquill.QuillsRepository;
import com.eddy.wordquill.models.Quill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuillsController {

    @Autowired
    QuillsRepository repo;

    @GetMapping("/quills")
    public List<Quill> getAllQuills() {
        return repo.findAll();
    }

}
