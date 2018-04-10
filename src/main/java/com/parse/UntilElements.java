package com.parse;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UntilElements{
    private static final String LOGIN_URL = "http://10.10.64.8:8082/grp/indexlis.jsp";
    //获得fraInterfacePage页面（如“报案登记页面”）
    private static HtmlPage fraInterfacePage = null;
    //最终操作页面
    public static HtmlPage finishPage = null;
    //页面需要添加的id
    public static List<String> list = new ArrayList<String>();
    //BrowserVersion.FIREFOX_45
    public static WebClient webClient = new WebClient(BrowserVersion.FIREFOX_52);
    public static List<FrameWindow> windows = null;

    public  void login(String name,String password,String station) throws IOException {
        webClient.getOptions().setJavaScriptEnabled(true);
        //忽略ssl认证
        webClient.getOptions().setUseInsecureSSL(true);
        //禁用Css，可避免自动二次请求CSS进行渲染
        webClient.getOptions().setCssEnabled(false);
        //运行错误时，不抛出异常
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        // 设置Ajax异步
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

        HtmlPage htmlPage = webClient.getPage(LOGIN_URL);
        webClient.waitForBackgroundJavaScript(3000);
        List<FrameWindow> window = htmlPage.getFrames();
        HtmlPage frameLoginPage = (HtmlPage) window.get(10).getEnclosedPage();
        System.out.print("------------------------------------"+frameLoginPage.asXml());
        //得到表单
        HtmlForm form = frameLoginPage.getFormByName("fm");
        //得到提交按钮 HtmlSubmitInput
        HtmlButtonInput button = form.getInputByName("submit2");
        //得到输入框HtmlTextInput
        HtmlTextInput usrCode = form.getInputByName("UserCode");
        HtmlPasswordInput userPassword = form.getInputByName("PWD");
        //输入内容
        usrCode.setValueAttribute(name);
        userPassword.setValueAttribute(password);

      //机构
        if(!station.equals("")){
            HtmlTextInput stationCode = form.getInputByName("StationCode");
            stationCode.setValueAttribute(station);
        }
        //点一下按钮
        HtmlPage nextPage = button.click();
        //webClient.waitForBackgroundJavaScript(10000);
        windows=window;
    }
    public void close(){
        webClient.close();
    }

    public void operateI(String uhead,String uleft,String jsp) throws IOException, InterruptedException {

            List<String> collectedAlerts = new ArrayList<String>();
            webClient.setAlertHandler(new CollectingAlertHandler(collectedAlerts));
            HtmlPage headPage = (HtmlPage) windows.get(4).getEnclosedPage();
            //获得"团险处理"按钮
            headPage.getAnchorByHref(uhead).click();
            //webClient.waitForBackgroundJavaScript(10000);
            HtmlPage fraMenuPage = (HtmlPage) windows.get(7).getEnclosedPage();
//            fraMenuPage.getElementsByTagName("li").get(4).click();
            //获得"新单管理"按钮
            fraMenuPage.getElementById(uleft).click();
            //获得"新单录入"按钮
            fraMenuPage.getAnchorByHref(jsp).click();
            //进入新单管理页面
            fraInterfacePage = (HtmlPage) windows.get(10).getEnclosedPage();


//            //点击"保存"按钮
//            HtmlPage page1 = webClient.getPage(page.getBaseURL());
//            webClient.waitForBackgroundJavaScript(3000);
//            HtmlPage xinDanPage = (HtmlPage)page1.getFrames().get(5).getEnclosedPage();
//            System.out.print(xinDanPage.asXml());
//            HtmlPage resposePage = xinDanPage.getElementByName("SaveCont").click();
//            if(resposePage.equals(xinDanPage)){
//                //获取alert
//                System.out.print("******"+collectedAlerts.get(collectedAlerts.size()-1));
//            }else{
//                //获取成功后页面信息
//                String contentTD = resposePage.getElementById("contentTD").asText();
//                System.out.println("******"+contentTD);
//            }



    }
    public void operateII() throws IOException {


        HtmlForm form1 = fraInterfacePage.getFormByName("fm");
        HtmlRadioButtonInput htmlRadioButtonInput = (HtmlRadioButtonInput)form1.getInputsByName("ScanMyInfoGridSel").get(1);
        HtmlButtonInput htmlButtonInput = (HtmlButtonInput)form1.getElementsByTagName("input").get(145);
        htmlRadioButtonInput.click();
        HtmlPage page = htmlButtonInput.click();
        webClient.waitForBackgroundJavaScript(3000);
        System.out.print(page.getBaseURL());
    }
    //报案管理
    public void report(String button,String select) throws IOException, InterruptedException {
        if(!select.equals("")||select==null){
            fraInterfacePage.getElementById(select).click();
        }
        fraInterfacePage.getElementById(button).click();
        //进入报案登记页面
        HtmlPage fraInterfacePage = (HtmlPage) windows.get(10).getEnclosedPage();

        list = fraInterfacePage.getTabbableElementIds();
        finishPage = fraInterfacePage;








    }



}