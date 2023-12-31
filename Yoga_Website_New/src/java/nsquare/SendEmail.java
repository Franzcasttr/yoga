/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nsquare;
import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.SingleThreadModel;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import nsquares.SendMail;
public class SendEmail extends HttpServlet {

    @SuppressWarnings("null")
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String insert="fail";
        Connection con = null;
        long connected;
        OutputStream out = null;
         PreparedStatement stmt, stmt1, stmt2, stmt3, stmt4, stmt5, stmt6 = null;
        ResultSet rs, rs1, rs2, rs3, rs4, rs5, rs6 = null;
        ResourceBundle bundle = ResourceBundle.getBundle("SelectResource");
        HttpSession session=request.getSession();
        try {
            try {
                String url = bundle.getString("URL");
                String username = bundle.getString("username");
                String password = bundle.getString("password");
                Class.forName(bundle.getString("Driver"));
                con = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println(e);
            }
             
            String currdate = "";
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(date);
            String time = new SimpleDateFormat("h:mm a").format(new Date());
            String dt = strDate + " " + time;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int yr = year % 100;
            String user="";
          
//            if(session.getAttribute("user")!=null){
//                user=session.getAttribute("user").toString();
//            }else{
//                 RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
//            rq.forward(request, response);
//            }
           String loc = request.getParameter("count");
String  data ="";
System.out.println("val1 :"+loc);

String buffer = "";

try{
    
   
     /*========================Email Sending Section==========================================*/
                String to_email = "",fname = "";
                
                to_email = "samarpanayogashala@gmail.com";
                
                String smtp = "smtp.gmail.com",port_no="587",email1="nsquaresoftwares@gmail.com",pwd="evntboqdmcucdxyg";
                    
                 
                
                String body = fname+", "+"<br><br>"+"New message arrived from website contact page"+"<br><br>"+"<br><br>";
                
                String sig = "Thanks & Regards,"+"<br>"+"Team Smarpana Yogashala";
                String subject = "New Message Arrived from Contact Us Page";
                String temp1 = "";
                
                temp1 = fname+"Dear Smarpana Yogashala Team,"+"<br><br>"+"Please go through the below details for new request arrived from website"+"<br><br>"+"Name :"+loc.split("nagsnn")[0]+"<br><br>"+"Mobile "+loc.split("nagsnn")[1]+"<br><br>"+"Email :"+loc.split("nagsnn")[2]+"<br><br>"+"Message :"+loc.split("nagsnn")[3]+"<br><br>"+sig;
//                temp1 = fname+", "+"<br><br>"+"As per your request click on below link to change password.."+"<br><br>"+" 'http://13.58.43.206/stichmatetest/online_pwd_change?mob="+loc+"' Click here to reset your password"+"<br><br>"+sig;
                //System.out.println("temp1 is "+temp1);
                try {
             
             SendMail.sendhrEmail(to_email, subject, temp1, port_no, smtp, email1,pwd,"");
             //SendMailHtml.sendhrEmail(to_email, subject, temp1, port_no, smtp, email1, pwd, "");
             
             insert = "mpass";
            } catch (Exception ex) {
                insert = "mfail";
            }
    
    
   
   buffer = "done";
   
}catch(Exception ex){
    //buffer = "undone";
    //con.rollback();
    System.out.println("Ajax Fetch Exception :"+ex);//155223  
}
      
response.getWriter().println(buffer); 
        }
        catch (Exception e) {
            throw new ServletException("Exception in Excel Sample Servlet", e);
        } finally {
            if (out != null) {
                out.close();
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
       
        
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.doGet(request, response);
    }
}
