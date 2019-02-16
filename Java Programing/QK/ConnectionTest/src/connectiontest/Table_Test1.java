/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connectiontest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suvonkar Kundu
 */
public class Table_Test1 extends JFrame {



   
   
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static ResultSetMetaData resultSetMetaData = null;

    static DefaultTableModel getTableModel(String sql) {
        
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel(){
        
            public Class<?> getColumnClass(int column) {
                            if(column==0)
                                return Boolean.class;
                            else
                                return String.class;
        }
        };
        
        connection=new  makeconnection().getDatabaseConnection();
        //connection = Current_stu_connect.getDatabaseConnection();
        int columns = 0;        
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            resultSetMetaData = resultSet.getMetaData();
            columns = resultSetMetaData.getColumnCount();

            String columnName[] = new String[columns+1];
            for (int i = 0; i <= columns; i++) {
                if(i==0)
                    columnName[i]="select";
                else
                columnName[i] = resultSetMetaData.getColumnName(i);
                defaultTableModel.addColumn(columnName[i]);
            }
            //defaultTableModel.addColumn(columnName);
            Object row[]=new Object[columns+1];
            
            while(resultSet.next()){                
               for(int i=0;i<=columns;i++)
                   if(i==0)
                       row[i]= new Boolean(false);
               else
                    row[i]=resultSet.getString(i);
                defaultTableModel.addRow(row);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Table_Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defaultTableModel;
    }
}

