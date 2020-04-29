package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage{
    @FindBy(linkText = "Account Summary")
    WebElement accountSummary;

    @FindBy(xpath = "//h2[text()='Cash Accounts']")
    WebElement cashAccounts;

    @FindBy(xpath = "//h2[text()='Investment Accounts']")
    WebElement investmentAccounts;

    @FindBy(xpath = "//h2[text()='Credit Accounts']")
    WebElement creditAccounts;

    @FindBy(xpath = "//h2[text()='Loan Accounts']")
    WebElement loanAccounts;

    @FindBy(xpath = "//th[text()='Credit Card']/following-sibling::th")
    WebElement creditAccountTableBalance;

    @FindBy(xpath = "//th[text()='Credit Card']/preceding-sibling::th")
    WebElement creditAccountTableAccount;

    @FindBy(xpath = "//th[text()='Credit Card']")
    WebElement creditAccountTableCredit;

   public List<String> creditAccountsTable(){
       List<WebElement> list = new ArrayList<>();
       list.add(creditAccountTableAccount);
       list.add(creditAccountTableCredit);
       list.add(creditAccountTableBalance);


       return BrowserUtilities.getTextFromWebElements(list);
   }




    public WebElement getCashAccounts(){
        return cashAccounts;
    }

    public WebElement getInvestmentAccounts(){
        return investmentAccounts;
    }

    public WebElement getCreditAccounts(){
        return creditAccounts;
    }

    public WebElement getLoanAccounts(){
        return loanAccounts;
    }








    public WebElement AccountSummaryIsDisplayed(){
        return accountSummary;
    }

   public String getpageTitle(){
        return driver.getTitle();
   }
}
