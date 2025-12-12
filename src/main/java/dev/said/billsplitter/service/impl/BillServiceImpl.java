package dev.said.billsplitter.service.impl;

import dev.said.billsplitter.dto.request.BillSplitRequestDto;
import dev.said.billsplitter.dto.response.BillSplitResponseDto;
import dev.said.billsplitter.service.BillService;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    @Override
    public BillSplitResponseDto split(BillSplitRequestDto dto) {

        return null;
    }
}
