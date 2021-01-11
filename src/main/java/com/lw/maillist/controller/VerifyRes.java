package com.lw.maillist.controller;

import com.alibaba.fastjson.annotation.JSONField;

public class VerifyRes {
    @JSONField(name = "email")
    private String email;

    @JSONField(name = "status")
    private int status;

    @JSONField(name = "status_description")
    private String statusDescription;

    @JSONField(name = "smtp_code")
    private int smtpCode;

    @JSONField(name = "smtp_log")
    private String smtpLog;

    public VerifyRes(String email, int status, String statusDescription, int smtpCode, String smtpLog){
        super();
        this.email = email;
        this.status = status;
        this.statusDescription = statusDescription;
        this.smtpCode = smtpCode;
        this.smtpLog = smtpLog;
    }

    public int getStatus() {
        return status;
    }
}
