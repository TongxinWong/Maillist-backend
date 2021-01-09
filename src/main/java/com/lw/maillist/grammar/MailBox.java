package com.lw.maillist.grammar;

/**
 * @program: maillist
 * @author: LJ
 * @create: 2021-01-09 22:25
 **/
public class MailBox {
    public String mailAddress;
    public boolean isError;

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public void setError(boolean error) {
        isError = error;
    }
}
