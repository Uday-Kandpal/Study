package database;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import study.Functions;

public class Manager {

    public final String LOW_PRIORITY = "LOW_PRIORITY";
    public final String HIGH_PRIORITY = "HIGH_PRIORITY";
    public final String IGNORE = "IGNORE";
    public final String IF_NOT_EXISTS = "IF_NOT_EXISTS";
    Connection con;
    Statement st;
    ResultSet rs;

    boolean startConnection(String password) {
        boolean op = true;
        try {
            Class.forName("java.sql.DriverManager");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", password);
            this.st = this.con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            op = false;
        }
        return op;
    }

    boolean createDatabase(String Name) {
        boolean isConnected = true;
        String query = "create if not exists database " + Name + ";";
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isConnected = false;
        }
        return isConnected;
    }

    boolean createTable(String dataBase, String name, List data, List dataType) {
        boolean isCreated = true;
        Object[] o = data.toArray();
        Object[] op = dataType.toArray();
        int l = o.length;
        String query0 = "use " + dataBase;
        String query = "create if not exists table" + name + "(";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(o[i] + " " + op[(i - 1)] + ",");
        }
        query = query.concat(o[i] + " " + op[i] + ");");
        try {
            this.st.execute(query);
            this.st.execute(query);
        } catch (SQLException e) {
            isCreated = false;
        }
        return isCreated;
    }

    boolean addTableEntry(String name, String columnLabel, String Param) {
        boolean isAltered = true;
        String query = "alter table " + name + " add " + columnLabel + " " + Param + ";";
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isAltered = false;
        }
        return isAltered;
    }

    boolean modifyTableEntry(String name, String columnLabel, String newParam) {
        boolean isAltered = true;
        String query = "alter table " + name + " modify " + columnLabel + " " + newParam + ";";
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isAltered = false;
        }
        return isAltered;
    }

    boolean deleteTableEntry(String name, String columnLabel) {
        boolean isAltered = true;
        String query = "alter table " + name + " drop " + columnLabel + ";";
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isAltered = false;
        }
        return isAltered;
    }

    boolean insertValue(String tableName, List data) {
        boolean isInserted = true;

        Object[] o = data.toArray();
        int l = o.length;
        String query = "insert into " + tableName + " values(";
        int i;
        for (i = 0; i < l - 1; i++) {
            query = query.concat(o[i] + " " + ", ");
        }
        query = query.concat(o[i] + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isInserted = false;
        }
        return isInserted;
    }

    boolean insertValue(String tableName, List data, String condition) {
        boolean isInserted = true;

        Object[] o = data.toArray();
        int l = o.length;
        String query = "insert into " + tableName + " values(";
        int i;
        for (i = 0; i < l - 1; i++) {
            query = query.concat(o[i] + " " + ", ");
        }
        query = query.concat(o[i] + "where " + condition + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isInserted = false;
        }
        return isInserted;
    }

    boolean insertValue(String tableName, String priority, List data, String condition) {
        boolean isInserted = true;

        Object[] o = data.toArray();
        int l = o.length;
        String query = "insert " + priority + " into" + tableName + " values(";
        int i;
        for (i = 0; i < l - 1; i++) {
            query = query.concat(o[i] + " " + ", ");
        }
        query = query.concat(o[i] + "where " + condition + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isInserted = false;
        }
        return isInserted;
    }

    boolean updateValue(String tableName, List dataEntryName, List data) {
        boolean isUpdated = true;

        Object[] o = data.toArray();
        Object[] op = dataEntryName.toArray();
        int l = o.length;
        String query = "update  " + tableName + " set ";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(op[i] + " =" + o[i] + " " + ", ");
        }
        query = query.concat(op[i] + "=" + o[i] + "where " + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isUpdated = false;
        }
        return isUpdated;
    }

    boolean updateValue(String tableName, List dataEntryName, List data, String condition) {
        boolean isUpdated = true;

        Object[] o = data.toArray();
        Object[] op = dataEntryName.toArray();
        int l = o.length;
        String query = "update  " + tableName + " set ";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(op[i] + " =" + o[i] + " " + ", ");
        }
        query = query.concat(op[i] + "=" + o[i] + "where " + condition + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isUpdated = false;
        }
        return isUpdated;
    }

    boolean updateValue(String tableName, List dataEntryName, List data, String condition, String orderByEntry) {
        boolean isUpdated = true;

        Object[] o = data.toArray();
        Object[] op = dataEntryName.toArray();
        int l = o.length;
        String query = "update  " + tableName + " set ";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(op[i] + " =" + o[i] + " " + ", ");
        }
        query = query.concat(op[i] + "=" + o[i] + "where " + condition + " order by " + orderByEntry + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isUpdated = false;
        }
        return isUpdated;
    }

    boolean updateValue(String tableName, String priority, List dataEntryName, List data, String condition, String orderByEntry) {
        boolean isUpdated = true;

        Object[] o = data.toArray();
        Object[] op = dataEntryName.toArray();
        int l = o.length;
        String query = "update  " + priority + " " + tableName + " set ";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(op[i] + " =" + o[i] + " " + ", ");
        }
        query = query.concat(op[i] + "=" + o[i] + "where " + condition + " order by " + orderByEntry + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isUpdated = false;
        }
        return isUpdated;
    }

    boolean updateValue(String tableName, String priority, List dataEntryName, List data, String condition, String orderByEntry, int rowCount) {
        boolean isUpdated = true;

        Object[] o = data.toArray();
        Object[] op = dataEntryName.toArray();
        int l = o.length;
        String query = "update  " + priority + " " + tableName + " set ";
        int i;
        for (i = 0; i < l; i++) {
            query = query.concat(op[i] + " =" + o[i] + " " + ", ");
        }
        query = query.concat(op[i] + "=" + o[i] + "where " + condition + " order by " + orderByEntry + " Limit " + rowCount + " );");
        try {
            this.st.execute(query);
        } catch (SQLException e) {
            isUpdated = false;
        }
        return isUpdated;
    }

    String[] batchToArray(File fp) {
        String data = Functions.File_Output(fp.getAbsolutePath());
        data = data.replace(";", ";@#XXXXX");
        String[] Array = data.split("@#XXXXX");
        return Array;
    }
}
