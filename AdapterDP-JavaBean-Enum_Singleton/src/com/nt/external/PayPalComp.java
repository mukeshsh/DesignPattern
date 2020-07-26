package com.nt.external;

import com.nt.dto.CardInfoDTO;

public interface PayPalComp {
  public String doPayment(CardInfoDTO dto);
}
