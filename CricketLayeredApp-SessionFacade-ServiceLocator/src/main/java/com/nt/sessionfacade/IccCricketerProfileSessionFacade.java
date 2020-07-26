package com.nt.sessionfacade;

import com.nt.dto.CricketerProfileDTO;

public interface IccCricketerProfileSessionFacade {
   public CricketerProfileDTO delegate(String name);
}
