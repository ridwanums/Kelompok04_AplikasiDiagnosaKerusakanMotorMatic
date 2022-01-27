package com.codelabs.syncrecyleandtab

class Category (val name : String, vararg item: Item) {

    val listOfItem : List<Item> = item.toList()
}