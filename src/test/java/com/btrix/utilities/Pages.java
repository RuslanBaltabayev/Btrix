package com.btrix.utilities;

import com.btrix.pages.ActiveStream.ActiveStreamPages;
import com.btrix.pages.Login.LoginPages;

public class Pages {

    private LoginPages loginPages;
    private ActiveStreamPages activeStreamPages;

    public LoginPages loginPage(){
        if(loginPages ==null){
            loginPages =new LoginPages();
        }
        return loginPages;
    }

    public ActiveStreamPages activeStreamPages(){
        if(activeStreamPages==null){
            activeStreamPages=new ActiveStreamPages();
        }
        return activeStreamPages;
    }
}
