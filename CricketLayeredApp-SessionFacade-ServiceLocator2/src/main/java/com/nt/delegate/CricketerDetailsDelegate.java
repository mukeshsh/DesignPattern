package com.nt.delegate;

import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;

public interface CricketerDetailsDelegate {
    public BatsmanProfileVO findCricketerDetails(BatsmanInputsVO ipVO);
}
