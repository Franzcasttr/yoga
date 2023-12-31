/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nsquare;


import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.sql.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@SuppressWarnings("deprecation")
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.servlet.*;
import javax.servlet.http.HttpSession;

public class YogaRetreatKerala extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String insert = "fail";
        Connection con = null;
        long connected;
        OutputStream out = null;
        PreparedStatement stmt, stmt1, stmt2, stmt3, stmt4, stmt5, stmt6, stmt7,stmt8,stmt9 = null;
        ResultSet rs, rs1, rs2, rs3, rs4, rs5, rs6,rs7,rs8,rs9 = null;
   //     ResourceBundle bundle = ResourceBundle.getBundle("SelectResource");
        HttpSession session = request.getSession();
        try {
//            try {
//                String url = bundle.getString("URL");
//                String username = bundle.getString("username");
//                String password = bundle.getString("password");
//                Class.forName(bundle.getString("Driver"));
//                con = DriverManager.getConnection(url, username, password);
//            } catch (Exception e) {
//                System.out.println("Database Connection Error" + e);
//            }

            String currdate = "";
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(date);
            String time = new SimpleDateFormat("h:mm a").format(new Date());
            String dt = strDate + " " + time;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int yr = year % 100;
            String user = "";

//             if(session.getAttribute("user")!=null){
//                user=session.getAttribute("user").toString();
//                session.setAttribute("user", user);
//            }else{
//                 RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
//            rq.forward(request, response);
//            }

//            int uid =0;
//            stmt = con.prepareStatement("select id from users where username='"+user+"'");
//            rs = stmt.executeQuery();
//            if(rs.next()){
//                uid = rs.getInt("id");
//            }
            
          
            
            
            RequestDispatcher rq = request.getRequestDispatcher("YogaRetreatKerala.jsp");
                rq.forward(request, response);
        } catch (Exception e) {
            throw new ServletException("Exception in  Servlet", e);
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
