package com.slipper.elviran.money_tracker.controllers;

import com.slipper.elviran.money_tracker.enums.SpendingCategoryEnum;
import com.slipper.elviran.money_tracker.models.Expense;
import com.slipper.elviran.money_tracker.models.Shop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class ExpenseController {

    @PostMapping
    public void addNewExpense(@RequestParam Double amount,
                              @RequestParam SpendingCategoryEnum category,
                              @RequestParam Shop shop,
                              @RequestParam(required = false) Date entryDateTime){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        log.info("Amount {}, category {}, shop {}, Date {}",
                amount, category, shop.getName(), formatter.format(entryDateTime));
    }

    @GetMapping
    public List<Expense> expenseList(){
        return new ArrayList<Expense>();
    }
}
