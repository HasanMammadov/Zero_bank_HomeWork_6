package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDef {

    AccountSummaryPage accountSummaryPage =new AccountSummaryPage();
    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) {
        Assert.assertEquals(string,accountSummaryPage.getpageTitle());
    }

    @Then("Account summary page should have to following account types")
    public void account_summary_page_should_have_to_following_account_types(List<String> dataTable) {
        Assert.assertEquals(dataTable,accountSummaryPage.accountSummaryPageAccountTypes());

    }


    @Then("credit accounts table must have following tables")
    public void credit_accounts_table_must_have_following_tables(List<String> dataTable) {

        Assert.assertEquals(dataTable,accountSummaryPage.creditAccountsTable());

    }






}
