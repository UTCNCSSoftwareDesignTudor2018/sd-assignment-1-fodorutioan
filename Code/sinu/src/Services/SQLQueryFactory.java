package Services;

/**
 * Created by Ioan on 3/27/2018.
 */
public class SQLQueryFactory {

    public static String createSelectAll(String type) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type);
        return sb.toString();
    }

    public static String createSelect(String type, String field) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type);
        sb.append(" WHERE " + field + " =?");
        return sb.toString();
    }



}
