package com.hcl.ingit.service;

import com.hcl.ingit.dto.LoginResDTO;

public interface LoginService {

	LoginResDTO validateLogin(Long studentId);
}
