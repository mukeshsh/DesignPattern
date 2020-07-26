package com.nt.ext1;

import com.nt.dto.CricketerIdDTO;

public interface IccCricketerIdFinder {
  public CricketerIdDTO fetchIdDetailsByName(String name);
}
