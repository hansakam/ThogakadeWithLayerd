/**
 * @author :Hansaka Malshan
 * created 2/9/2023---11:57 PM
 */
package lk.ijse.thogakade.dao;

import lk.ijse.thogakade.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUtil {
    private static PreparedStatement GetSql(String sql, Object...args) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        for (int i=0 ;i< args.length;i++){
            pstm.setObject(i+1,args[i]);
        }
        return pstm;

    }
    public static boolean executeUpdate(String sql, Object...args) throws SQLException, ClassNotFoundException {
       return GetSql(sql,args).executeUpdate()>0;
    }
    public static ResultSet executeQuery(String sql, Object...args) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm = GetSql(sql, args);
        return pstm.executeQuery();
    }
}
