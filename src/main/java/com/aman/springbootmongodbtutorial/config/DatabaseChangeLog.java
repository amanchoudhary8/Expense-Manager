package com.aman.springbootmongodbtutorial.config;

import com.aman.springbootmongodbtutorial.model.Expense;
import com.aman.springbootmongodbtutorial.model.ExpenseCategory;
import com.aman.springbootmongodbtutorial.repository.ExpenseRepository;
import com.github.cloudyrock.mongock.ChangeLog;
import io.mongock.api.annotations.ChangeUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.aman.springbootmongodbtutorial.model.ExpenseCategory.*;


@ChangeUnit(order="001",id="seedDatabase", author = "aman")
public class DatabaseChangeLog {

    public void seedDatabase(ExpenseRepository expenseRepository){
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("Movie Tickets", ENTERTAINMENT, BigDecimal.valueOf(40)));
        expenseList.add(createNewExpense("Dinner", RESTAURANT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Netflix", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Gym", MISC, BigDecimal.valueOf(20)));
        expenseList.add(createNewExpense("Internet", UTILITIES, BigDecimal.valueOf(30)));

        expenseRepository.insert(expenseList);
    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal amount) {
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseAmount(amount);
        expense.setExpenseCategory(expenseCategory);
        return expense;
    }
}
