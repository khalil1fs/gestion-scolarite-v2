package com.example.exemple74.ws.rest.provided.facade.admin;

import com.example.exemple74.Dao.NoteDao;
import com.example.exemple74.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin/note")
public class NoteRestAdmin {
    @Autowired
    private NoteService noteService;


}
