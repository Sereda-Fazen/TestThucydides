package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Server.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")

public class TestAuth extends BeforeClass {

    @ManagedPages(defaultUrl = "https://agrisoftlive.com/")

    public Pages pages;

    @WithTag("Test")
    @Test
    public void Test()  {



        enterLogin.enterLogin("vbuvac");
        enterPass.enterPass("Password1");
        clickLogin.clickLogin();
        assertLocation.assertLocation();

    }


}



