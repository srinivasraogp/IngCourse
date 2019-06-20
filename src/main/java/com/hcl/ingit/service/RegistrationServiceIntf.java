package com.hcl.ingit.service;

import com.hcl.ingit.entiry.RegistrationRequestDTO;
import com.hcl.ingit.entiry.RegistrationResponseDTO;

public interface RegistrationServiceIntf {

	RegistrationResponseDTO registerUser(RegistrationRequestDTO registrationRequestDto);

}
