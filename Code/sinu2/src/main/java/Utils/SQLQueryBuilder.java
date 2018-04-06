package Utils;

import java.util.LinkedList;

/**
 * Created by Ioan on 3/27/2018.
 */
public class SQLQueryBuilder {

    public static String createSelectAll(String type) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type);
        return sb.toString();
    }

    public static String createSelect(String table, String field, String value) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(table);
        sb.append(" WHERE " + field + " = \"" + value + "\"");
        return sb.toString();
    }

//    public static String createUpdate(String table, LinkedList<String> fields, LinkedList<String> values) {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("UPDATE ");
//        sb.append(table);
//        sb.append(" SET ");
//        for (String field: fields) {
//            sb.append(field);
//            sb.append()
//        }
//
//        "students",
//                "name", name,
//                "address", address,
//                "CNP", CNP,
//                "email", email,
//                "group", group,
//                "id", ID);
//    }



}
