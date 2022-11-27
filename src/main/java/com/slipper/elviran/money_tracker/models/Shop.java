package com.slipper.elviran.money_tracker.models;

import com.slipper.elviran.money_tracker.enums.SpendingCategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    String name;
    SpendingCategoryEnum category;
    Integer visitingAmount;
}
