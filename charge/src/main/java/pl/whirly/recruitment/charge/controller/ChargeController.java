package pl.whirly.recruitment.charge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.whirly.recruitment.charge.model.ChargeOrder;
import pl.whirly.recruitment.charge.service.ChargeService;

@RestController
@RequestMapping("/charges")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @GetMapping("/process")
    public String processCharge(@RequestBody ChargeOrder chargeOrder) {
        return String.valueOf(chargeService.processCharge(chargeOrder));
    }
}
