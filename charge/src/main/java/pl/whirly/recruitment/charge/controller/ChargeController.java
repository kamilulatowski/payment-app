package pl.whirly.recruitment.charge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.whirly.recruitment.charge.model.ChargeOrder;
import pl.whirly.recruitment.charge.service.ChargeService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/charges")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @GetMapping("/process")
    public String processCharge(@RequestParam String userId, @RequestParam BigDecimal amountNet, @RequestParam String currency) {
        return String.valueOf(chargeService.processCharge(new ChargeOrder(userId, amountNet, currency)));
    }
}
