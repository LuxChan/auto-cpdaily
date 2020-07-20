package com.neoniou.daily.constant;

/**
 * @author Neo.Zzj
 * @date 2020/6/22
 */
public interface DailyApi {

    String SWU_INDEX = "http://authserverxg.swu.edu.cn/authserver/login" +
            "?service=https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/getStuSignInfosInOneDay";

    String SWU_LOGIN = "http://authserverxg.swu.edu.cn/authserver/login;sessionId" +
            "?service=https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/getStuSignInfosInOneDay";

    String GET_MESSAGE = "https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/getStuSignInfosInOneDay";

    String GET_FORM = "https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/detailSignInstance";

    String SUBMIT_FORM = "https://swu.cpdaily.com/wec-counselor-sign-apps/stu/sign/submitSign";
}
