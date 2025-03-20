package com.example.college.service;

import com.example.college.entity.Professor;
import com.example.college.entity.Student;
import com.example.college.entity.Subject;
import com.example.college.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor createProfessor(Professor professor) {
        // Ensure subjects are linked correctly
        if (professor.getSubjects() != null) {
            for (Subject subject : professor.getSubjects()) {
                subject.setProfessor(professor);
            }
        }

        // Ensure students are linked correctly
        if (professor.getStudents() != null) {
            for (Student student : professor.getStudents()) {
                student.setProfessor(professor);
            }
        }

        return professorRepository.save(professor);
    }


    public List<Professor> getAllProfessors(){
        return professorRepository.findAll();
    }

    public Professor getProfessorById(Long id){
        Optional<Professor> professor = professorRepository.findById(id);
        return professor.orElse(null);
    }

    public Professor updateProfessor(Long id, Professor updatedProfessor){
        if(professorRepository.existsById(id)){
            updatedProfessor.setId(id);
            return professorRepository.save(updatedProfessor);
        }
        return null;
    }

    public boolean deleteProfessor(Long id){
        if (professorRepository.existsById(id)){
            professorRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
