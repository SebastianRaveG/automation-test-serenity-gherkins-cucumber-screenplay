package com.uam.automation.tasks;

import com.uam.automation.userinterface.FormPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theFormPage(){
        return Task.where("{0} opens the form page",
                Open.browserOn().the(FormPage.class));
    }
}