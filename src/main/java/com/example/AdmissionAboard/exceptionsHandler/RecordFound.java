package com.example.AdmissionAboard.exceptionsHandler;
public class RecordFound extends Exception {
    public RecordFound(String addressNotFound) {
        super(addressNotFound);
    }
}
