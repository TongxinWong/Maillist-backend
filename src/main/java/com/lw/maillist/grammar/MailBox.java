package com.lw.maillist.grammar;

/**
 * @program: maillist
 * @author: LJ
 * @create: 2021-01-09 22:25
 **/
public class MailBox {
    public String mailAddress;
    public String userName;
    public String domain;
    public boolean isError;
    public boolean isValid;

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
