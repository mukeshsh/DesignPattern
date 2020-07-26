package com.nt.ext2;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CricketerProfileDTO;

public interface IccCricketerProfileFinder {
    public CricketerProfileDTO fetchCricketerById(CricketerIdDTO dto);
}
