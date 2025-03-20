package com.example.college.service;

import com.example.college.entity.Subject;
import com.example.college.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject createSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id){
        Optional<Subject> subject = subjectRepository.findById(id);
        return subject.orElse(null);
    }

    public Subject updateSubject(Long id, Subject updatedSubject){
        if(subjectRepository.existsById(id)){
            updatedSubject.setId(id);
            return subjectRepository.save(updatedSubject);
        }
        return null;
    }

    public boolean deleteSubject(Long id){
        if(subjectRepository.existsById(id)){
            subjectRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
