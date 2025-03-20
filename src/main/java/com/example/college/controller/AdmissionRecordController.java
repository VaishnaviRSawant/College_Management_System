package com.example.college.controller;

import com.example.college.entity.AdmissionRecord;
import com.example.college.service.AdmissionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admission-records")
public class AdmissionRecordController {

    @Autowired
    private AdmissionRecordService admissionRecordService;

    // API to create a new admission record
    @PostMapping
    public ResponseEntity<AdmissionRecord> createAdmissionRecord(@RequestBody AdmissionRecord admissionRecord) {
        AdmissionRecord newAdmissionRecord = admissionRecordService.createAdmissionRecord(admissionRecord);
        return new ResponseEntity<>(newAdmissionRecord, HttpStatus.CREATED);
    }
}
