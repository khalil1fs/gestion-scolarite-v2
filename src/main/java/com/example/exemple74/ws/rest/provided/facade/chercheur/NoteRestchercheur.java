package com.example.exemple74.ws.rest.provided.facade.chercheur;

import com.example.exemple74.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/chercheur/note")
public class NoteRestchercheur {
    @Autowired
    private NoteService noteService;
}
