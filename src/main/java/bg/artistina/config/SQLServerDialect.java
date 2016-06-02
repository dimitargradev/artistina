package bg.artistina.config;

import java.sql.Types;

import org.hibernate.HibernateException;

public class SQLServerDialect extends org.hibernate.dialect.SQLServer2012Dialect {

    public SQLServerDialect() {
        super();
        registerColumnType(Types.VARCHAR, "nvarchar($l)");
        registerColumnType(Types.CLOB, "nvarchar(max)");
    }

    public String getTypeName(int code, int length, int precision, int scale) throws HibernateException {
        if (code != 2005) {
            return super.getTypeName(code, length, precision, scale);
        } else {
            return "ntext";
        }
    }

}
