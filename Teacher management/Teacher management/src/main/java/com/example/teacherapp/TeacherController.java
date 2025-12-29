package com.example.teacherapp;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/teachers")
@CrossOrigin
public class TeacherController {

    private List<Teacher> teachers = new ArrayList<>();
    private int currentId = 1;

    // CREATE
    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        teacher.setId(currentId++);
        teachers.add(teacher);
        return teacher;
    }

    // READ
    @GetMapping
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // UPDATE
    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable int id, @RequestBody Teacher updatedTeacher) {
        for (Teacher t : teachers) {
            if (t.getId() == id) {
                t.setSubject(updatedTeacher.getSubject());
                t.setName(updatedTeacher.getName());
                return t;
            }
        }
        return null;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteTeacher(@PathVariable int id) {
        teachers.removeIf(t -> t.getId() == id);
        return "Deleted Successfully";
    }
}
