package dev.said.billsplitter.controller;

import dev.said.billsplitter.dto.request.BillSplitRequestDto;
import dev.said.billsplitter.dto.response.BillSplitResponseDto;
import dev.said.billsplitter.service.BillService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/bills")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class BillController {

    BillService billService;

    @PostMapping("splitting")
    public ResponseEntity<BillSplitResponseDto> split(@RequestBody BillSplitRequestDto dto) {
        return ResponseEntity.ok(billService.split(dto));
    }
}
