package com.parse;

import com.gargoylesoftware.htmlunit.CollectingAlertHandler;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.exolab.castor.xml.Unmarshaller;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Until {
    //实体类名
    public static String className = "printdata3.CaseReport";
    private static int flag = 0;
    private static int index = 1;
    private static String method ="";
    public static int i = 1;


    //保存报案
    public static String attributeBA1(Object o){
        String response1 = "";
        try {
            addValue(o);
            //点击"保存报案"按钮
            response1 = alertAndPage("ReportSave");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response1;
    }
    //新增客户
    public static String attributeBA2(Object o){
        String response2 = "";
        try {
            addValue(o);
            //点击"新增"按钮
            List<String> collectedAlerts = new ArrayList<String>();
            UntilElements.webClient.setAlertHandler(new CollectingAlertHandler(collectedAlerts));
            HtmlPage page = UntilElements.finishPage.getElementByName("CustomerAdd").click();
            response2 = alertAndPage("CustomerAdd");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response2;
    }
    //新增事件(需要模拟选择一条消息)
    public static String attributeBA3(Object o){
        String response3 = "";
        try {
            //选择一个客户
            UntilElements.finishPage.getElementById("CustomerListGridSel0").click();
            addCheckValue(o);
            //点击"新增事件"按钮
            response3 = alertAndPage("AddCase");
            clearCheck(o);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response3;
    }
    //删除
    public String dele(){
        String dele = "";
        try {
            dele = alertAndPage("ReportDelete");
//            UntilElements.finishPage.getElementById("").click(); 返回上个页面
        } catch (IOException e) {

        } catch (InterruptedException e) {

        }
        return dele;
    }

    //立案
    //保存
    public static String attributeLA1(Object o){
        String response1 = "";
        try {
            addValue(o);
            //点击"保存"按钮
            response1 = alertAndPage("AcceptSave");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response1;
    }
    public static String attributeLA2(Object o){
        String response2 = "";
        try {
            addValue(o);
            //点击"新增"按钮
            response2 = alertAndPage("CustomerAdd");
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response2;
    }
    public static String attributeLA3(Object o){
        String response3 = "";
        try {
            //选择一个客户
            UntilElements.finishPage.getElementById("CustomerListGridSel0").click();
            addCheckValue(o);
            //点击"新增事件"按钮
            response3 = alertAndPage("CaseAdd");
            clearCheck(o);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return response3;
    }

   //关联给付责任
   public static String attributeLA4(Object o){
        String response3 = "";
        try {
            //选择一个客户
            UntilElements.finishPage.getElementById("EventlistGridSel0").click();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return response3;
    }

    //将报文中值反射到页面(没有checkbox)
    public static void addValue(Object o) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("com.print."+className);
        Field[] fields = clazz.getDeclaredFields();//根据Class对象获得属性 私有的也可以获得
        for (Field f : fields) {
            System.out.println(f.getName());//打印每个属性的类型名字
            String attributeName = f.getName().substring(1,f.getName().length()).toLowerCase();
            for(String lis:UntilElements.list){
                if ((lis.toLowerCase()).equals(attributeName)) {
                    Method method = clazz.getMethod(("get" + lis));
                    String value = (String) method.invoke(o);
                    DomElement domElement = UntilElements.finishPage.getElementByName(lis);
                    domElement.setAttribute("value", value);
                    System.out.println(value);
                    break;
                }
            }
        }
    }
    //将报文中值反射到页面(有checkbox)
    public static void addCheckValue(Object o) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        Class clazz = Class.forName("com.print." + className);
        Field[] fields = clazz.getDeclaredFields();//根据Class对象获得属性 私有的也可以获得
        for (Field f : fields) {
            System.out.print(f.getName());//打印每个属性的类型名字
            String attributeName = f.getName().substring(1, f.getName().length()).toLowerCase();
            if (attributeName.equals("claimtype")) {
                Method method = clazz.getMethod("getClaimType");
                String value = (String) method.invoke(o);
                List<DomElement> list = UntilElements.finishPage.getElementsByName("ClaimType");
                for (DomElement e : list) {
                    String string = e.getAttribute("value");
                    if (value.contains(string)) {
                        e.click();
                    }
                }
            } else {
                for (String lis : UntilElements.list) {
                    if ((lis.toLowerCase()).equals(attributeName)) {
                        Method method = clazz.getMethod("get" + lis);
                        String value = (String) method.invoke(o);
                        DomElement domElement = UntilElements.finishPage.getElementByName(lis);
                        domElement.setAttribute("value", value);
                        domElement.setTextContent(value);
                        System.out.println(value);
                        break;
                    }
                }
            }
        }
    }
    //获取响应alert或页面的值
    public static String alertAndPage(String button) throws IOException, InterruptedException {
        Thread.sleep(1000);
        List<String> collectedAlerts = new ArrayList<String>();
        UntilElements.webClient.setAlertHandler(new CollectingAlertHandler(collectedAlerts));
        ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
        PrintStream cacheStream = new PrintStream(baoStream);
        PrintStream oldStream = System.out;
        System.setOut(cacheStream);
        HtmlPage page = UntilElements.finishPage.getElementByName(button).click();
        String message = baoStream.toString();
        if(message.indexOf("parent.fraInterface.afterSubmit")!=-1){
            message = message.split("parent.fraInterface.afterSubmit")[2];
            message = message.split("\",\"")[1];
        }
        message = "<-- " + message + " -->";
        System.setOut(oldStream);
        String result ="";
        if(page.equals(UntilElements.finishPage)){
            //获取alert
            result = "<-- " + collectedAlerts.get(collectedAlerts.size()-1) + " -->";
        }else{
            //获取成功后页面信息
            result = message;

        }
        return result;
    }
    //清除复选框
    public static void clearCheck(Object o) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        Class clazz = Class.forName("com.print." + className);
        Field[] fields = clazz.getDeclaredFields();//根据Class对象获得属性 私有的也可以获得
        for (Field f : fields) {
            System.out.print(f.getName());//打印每个属性的类型名字
            String attributeName = f.getName().substring(1, f.getName().length()).toLowerCase();
            if (attributeName.equals("claimtype")) {
                Method method = clazz.getMethod("getClaimType");
                String value = (String) method.invoke(o);
                List<DomElement> list = UntilElements.finishPage.getElementsByName("ClaimType");
                for (DomElement e : list) {
                    String string = e.getAttribute("value");
                    if (value.contains(string)) {
                        e.click();
                    }
                }
            }
        }
    }


    //报文动作关联
    public void relate(String packageName){
        Jedis js = new Jedis("localhost");
        js.auth("123456");
        if(flag==0){
            index = Integer.parseInt(packageName.split("\\D+")[1]);//确定是第几个文件中的报文，需要执行几步
            method = packageName.replace(index+"","");//确定是哪个理赔流程
        }
        File file =new File("D:\\理赔\\"+packageName);
        Object obj = null;
        //返回报文的结果
        String res = "";
        List lis = new ArrayList();
        try {
                        if(index==i){
                            className = js.get(packageName);
                            for(String f:file.list()){
                                obj = bodyBeen("D:\\理赔\\"+packageName+"\\"+f);
                                res = select(i,obj);
                                file(f+"测试结果为:"+res);
                                System.out.println(f+"------"+res);
                                Thread.sleep(2000);
                }
            }else{
                            className = js.get(method+i);
                            obj = bodyBeen("D:\\理赔\\"+method+i+"\\正例.xml");
                            res = select(i,obj);
                            file(method+i+"准备结果为:"+res);
                            Thread.sleep(2000);
                            i++;
                            flag=1;
                            relate(method+i);
            }
        } catch (InterruptedException e) {

        }
    }
    public Object bodyBeen(String tXMLFileName){
        //将回传xml文件解析成javabean
        String s ="";
        Object obj = new Object();
        try {
            File tXMLFile = new File(tXMLFileName);
            InputStreamReader isr = new InputStreamReader(new FileInputStream(tXMLFile));
            BufferedReader br = new BufferedReader(isr);
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null) {
                s+=lineTxt;
            }
            byte[] tbyte = s.getBytes();
            ByteArrayInputStream tBais = new ByteArrayInputStream(tbyte);
//            Unmarshaller tUnmarshaller = new Unmarshaller(Body.class);
            Class clazz = Class.forName("com.print."+className);
            Unmarshaller tUnmarshaller = new Unmarshaller(clazz);
            tUnmarshaller.setValidation(false);
            obj = tUnmarshaller.unmarshal(new InputStreamReader(tBais));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return obj;
    }
    public void file(List<String> lis){
        try {
            FileOutputStream os = new FileOutputStream(new File("D:\\理赔\\执行结果.xml"),true);
            for(String str:lis){
                byte[] bytes = str.getBytes();
                os.write(bytes);
                os.write("\r\n".getBytes());
            }
            os.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
    public void file(String str){
        try {
                FileOutputStream os = new FileOutputStream(new File("D:\\理赔\\执行结果.xml"),true);
                byte[] bytes = str.getBytes();
                os.write(bytes);
                os.write("\r\n".getBytes());
                os.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
    public static String select(int index,Object o){
        String re = "";
        if(method.equals("BA")&&index==1){
            re = attributeBA1(o);
        }else if(method.equals("BA")&&index==2){
            re = attributeBA2(o);
        }else if(method.equals("BA")&&index==3){
            re = attributeBA3(o);
        }else if(method.equals("LA")&&index==1){
            re = attributeLA1(o);
        }else if(method.equals("LA")&&index==2){
            re = attributeLA2(o);
        }else if(method.equals("LA")&&index==3){
            re = attributeLA3(o);
        }
        return re;
    }


    public static void main(String[] args){

        int t =(int) 3.89;
        t %=2;
        System.out.print(t);



    }

}