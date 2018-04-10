package com.main;

import com.model.ClickTopMenu7;
import com.model.Menu;
import com.parse.Until;
import com.parse.UntilElements;
import redis.clients.jedis.Jedis;

import java.io.IOException;

public class HtmlUnitMain {
    public static void main (String[] args){
        try {
            Jedis js = new Jedis("localhost");
            js.auth("123456");
            UntilElements untilElements = new UntilElements();
            Menu menu = new Menu();
            Until until = new Until();
            ClickTopMenu7 clickTopMenu7 = new ClickTopMenu7();
            //用户登录
            untilElements.login("002","001"," ");
            //得到测试页面
//            untilElements.operateI(menu.getHead7(),clickTopMenu7.getLeftMenuId32());//新单录入

            //报案登记../g_claim/LLClaimReportAppInput.jsp
            String[] arg = {"../g_claim/LLClaimReportAppInput.jsp","reportNew","ReportConfirm","SelfLLClaimReportGridSel6"};//报案
            String[] arg1 = {"../g_claim/LLClaimCaseAppInput.jsp","AddCase","OverCase"};//立案
            untilElements.operateI(menu.getHead7(),clickTopMenu7.getLeftMenuId29(),arg[0]);//报案管理
            //reportEnter进入报案  reportNew 新增报案  SelfLLClaimReportGridSel6选择公共池中一条数据
            untilElements.report(arg[1],"");
//            String res = until.dele();

            //调取报文
            String casepackage = "BA3";
            until.relate(casepackage);
            //页面提交
            String res1 = until.alertAndPage(arg[2]);
            System.out.println("提交数据结果："+res1);
            until.file(res1);
            untilElements.close();
        } catch (IOException e) {
        } catch (InterruptedException e) {
        }

    }
}