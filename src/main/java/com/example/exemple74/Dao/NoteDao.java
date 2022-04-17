package com.example.exemple74.Dao;

import com.example.exemple74.bean.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<Note,Long> {


}
