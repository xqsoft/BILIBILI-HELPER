package top.misec.login;

/**
 * @author Junzhou Liu
 * @create 2020/10/21 19:57
 */
public class ServerVerify {

    private static String FTKEY = SCU73608Td89b1858568545d630f083286ca27afa5e069ff235dd8;


    private final static ServerVerify SERVER_VERIFY = new ServerVerify();

    public static void verifyInit(String ftKey) {
        ServerVerify.FTKEY = ftKey;
    }

    public static String getFtkey() {
        return FTKEY;
    }

    public static ServerVerify getInstance() {
        return SERVER_VERIFY;
    }
}
