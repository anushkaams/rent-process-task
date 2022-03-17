package com.ams.rentcloud.rentprocesstask.services;

import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {

    @Override
    public boolean validateDl(String dlNumber) {
        return dlNumber.length() > 5;
    }
}
