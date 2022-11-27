package com.slipper.elviran.money_tracker.enums;

import lombok.Getter;

@Getter
public enum SpendingCategoryEnum {
    FOOD("food"),
    MEDICAL("Medical"),
    PETS("pets"),
    TAKE_OUT("take outs"),
    GROCERIES("Groceries"),
    TRAVELLING("Travelling"),
    ONLINE_SHOPPING("Online Shopping"),
    NON_ESSENTIAL("Non Essential");

    String label;
    private SpendingCategoryEnum(String label){
        this.label = label;
    }
}
