/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import admin.AdminPanel;
import gettersetter.RegisterModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepak
 */
public class DbOperations 
{
    public static boolean login(String email1, String pass1)
    {
        boolean status=false;
        try
        {
            Connection con=dbcon.DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from register where email=? and password=?");
            ps.setString(1, email1);
            ps.setString(2, pass1);
            
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static boolean register(RegisterModel reg)
    {
        boolean status=false;
        try
        {
            Connection con=DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
            
            ps.setString(1, reg.getName());
            ps.setString(2, reg.getEmail());
            ps.setString(3, reg.getPassword());
            ps.setString(4, reg.getGender());
            ps.setString(5, reg.getPhoneno());
            ps.setString(6, reg.getModule());
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                status=true;
            }
            else
            {
                status=false;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return status;
    }
    
    public static ResultSet showAllEmpsData()
    {
        ResultSet rs = null;
        try
        {
            Connection con=DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from register where module='Employee'");
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    public static ResultSet getSelectedEmployee(String email)
    {
        ResultSet rs = null;
        try
        {
            Connection con=DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("select * from register where email=?");
            ps.setString(1, email);
            
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return rs;
    }
    
    public static int updateEmpDetails(RegisterModel reg)
    {
        int i = 0;
        try
        {
            Connection con=DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("update register set name=?, password=?, gender=?, phone_no=? where email=?");
            ps.setString(1, reg.getName());
            ps.setString(2, reg.getPassword());
            ps.setString(3, reg.getGender());
            ps.setString(4, reg.getPhoneno());
            ps.setString(5, reg.getEmail());
            
            i=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
    
    public static int deleteEmpDetails(String email)
    {
        int i = 0;
        try
        {
            Connection con=DbConnection.getConnection();
            
            PreparedStatement ps=con.prepareStatement("delete from register where email=?");
            ps.setString(1, email);
            
            i=ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return i;
    }
}
