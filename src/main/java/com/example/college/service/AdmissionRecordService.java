package com.example.college.service;

import com.example.college.entity.AdmissionRecord;
import com.example.college.repository.AdmissionRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdmissionRecordService {

    @Autowired
    private AdmissionRecordRepository admissionRecordRepository;

    public AdmissionRecord createAdmissionRecord(AdmissionRecord admissionRecord){
        return admissionRecordRepository.save(admissionRecord);
    }
}
