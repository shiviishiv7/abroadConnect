package com.example.AdmissionAboard.exceptionsHandler;
public class RecordNotFound extends Exception {
    public RecordNotFound(String addressNotFound) {
        super(addressNotFound);
    }
}
