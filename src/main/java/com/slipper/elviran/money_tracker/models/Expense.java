package com.slipper.elviran.money_tracker.models;

import com.slipper.elviran.money_tracker.enums.SpendingCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    Double amount;
    SpendingCategory category;
    List<Shop> shopList;
    Date date;
}
