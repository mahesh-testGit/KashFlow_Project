package Ui_Steps;

import ui_Objects.BaseClass;
import ui_Objects.LoginUiObjects;

public class LoginUiSteps extends BaseClass {

    public LoginUiObjects loginUiObjects;

   public LoginUiSteps()
    {
      loginUiObjects = new LoginUiObjects(driver);
    }




}
