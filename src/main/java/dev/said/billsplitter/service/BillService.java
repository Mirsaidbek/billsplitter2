package dev.said.billsplitter.service;

import dev.said.billsplitter.dto.request.BillSplitRequestDto;
import dev.said.billsplitter.dto.response.BillSplitResponseDto;

public interface BillService {
    BillSplitResponseDto split(BillSplitRequestDto dto);
}
