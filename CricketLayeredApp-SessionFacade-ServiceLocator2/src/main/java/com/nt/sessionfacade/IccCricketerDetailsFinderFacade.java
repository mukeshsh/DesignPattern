package com.nt.sessionfacade;

import com.nt.dto.BatsmanInputsDTO;
import com.nt.dto.BatsmanProfileDTO;

public interface IccCricketerDetailsFinderFacade {
    public BatsmanProfileDTO getCricketerDetails(BatsmanInputsDTO ipDTO);
}
