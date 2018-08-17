package info.xiancloud.dao.core.pool;

import info.xiancloud.core.conf.XianConfig;
import info.xiancloud.core.util.LOG;

/**
 * Datasource configuration reader
 *
 * @author happyyangyuan
 */
public class DatasourceConfigReader {

    public static String getWriteUrl() {
        String writeUrl = XianConfig.get("db_url");
        LOG.info("db_write = " + writeUrl);
        return writeUrl;
    }

    public static String getWritePwd() {
        return XianConfig.get("db_pwd");
    }

    public static String getWriteUser() {
        return XianConfig.get("db_user");
    }

    public static int getWritePoolSize() {
        return XianConfig.getIntValue("db_pool_size");
    }

    public static String getReadUrl() {
        String readUrl = XianConfig.get("readonly_db_url");
        LOG.info("db_read = " + readUrl);
        return readUrl;
    }

    public static String getReadUser() {
        return XianConfig.get("readonly_db_user");
    }

    public static String getReadPwd() {
        return XianConfig.get("readonly_db_pwd");
    }

    public static int getReadPoolSize() {
        return XianConfig.getIntValue("readonly_db_pool_size");
    }

    /**
     * Read configuration from xian config to get the global transaction timeout in milliseconds.
     * The configuration key is "db_transaction_timeout"
     *
     * @return global transaction timeout in milliseconds.
     */
    public static long getTransactionTimeout() {
        return XianConfig.getLongValue("db_transaction_timeout", 1000 * 60 * 5);
    }

    public static void main(String... args) {
        LOG.info(getReadPwd());
        LOG.info(getWriteUrl());
        LOG.error(getTransactionTimeout());
    }

}
