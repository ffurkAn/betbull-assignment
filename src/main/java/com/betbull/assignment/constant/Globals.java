package com.betbull.assignment.constant;

/**
 * @author atanriverdi
 */
public class Globals {

    public static final String CONTEXT_ROOT = "/api/*";

    // PROJECT
    public static final String PROJECT_CONTROLLER = "/api/project/";
    public static final String PROJECT_SAVE = "v1/savePlayer";
    public static final String PROJECT_STATE_UPDATE = "v1/updateProjectState";
    public static final String PROJECT_UPDATE = "v1/updateProject";
    public static final String TEST_MKS = "v1/mks";
    public static final String PROJECT_LIMIT_QUERY = "v1/projectLimitQuery";
    // UPDATABLE FIELDS
    public static final String UPDATABLE_PROJECT_FIELDS = "UPDATABLE_PROJECT_FIELDS";
    public static final String UPDATABLE_MEMBER_FIELDS = "UPDATABLE_MEMBER_FIELDS";
    //UPDATABLE PROJECT FIELDS
    public static final String PROJECT_NAME = "projectName";
    public static final String PROJECT_DEFINITION = "projectDefinition";
    public static final String FUNDABLE_AMOUNT = "fundableAmount";
    public static final String PRIVILEGE = "privilege";
    public static final String START_DATE = "startDate";
    public static final String END_DATE = "endDate";
    public static final String OVER_FUNDING = "overFunding";
    public static final String FUND_COLLECT_TYPE = "fundCollectType";
    public static final String FUND_NOMINAL_AMOUNT = "fundNominalAmount";
    public static final String ADD_FUND_RATE = "additionalFundRate";
    public static final String QUALIFIED_FUND_RATE = "qualifiedFundRate";
    public static final String UPDATE_FIELD_PROJECT_STATE = "projectState";
    //UPDATABLE MEMBER FIELDS
    public static final String MEMBER_NAME = "name";
    public static final String MEMBER_SURNAME = "surname";
    public static final String MEMBER_TITLE = "title";
    public static final String MEMBER_TEL = "tel";
    public static final String MEMBER_MOBILE = "mobile";
    public static final String MEMBER_MAIL = "mail";
    public static final String MEMBER_ANNUAL_INCOME = "annualIncome";
    public static final String MEMBER_QUALIFIED_STATE = "qualifiedState";

    //EYATIRIMCI OID
    public static final String EYATIRIMCI_ID = "EYAT";
    public static final String EYATIRIMCI = "EYATIRIMCI";

    // MEMBER
    public static final String MEMBER_CONTROLLER = "/api/member";
    public static final String MEMBER_SAVE = "/v1/saveMember";
    public static final String MEMBER_UPDATE = "/v1/updateMember";
    public static final String MEMBER_DELETE = "/v1/deleteMember";
    public static final String MEMBER_LIMIT_QUERY = "/v1/memberLimitQuery";
    public static final String MEMBER_BATCH = "/v1/memberBatch";
    public static final String MEMBER_BATCH2 = "/v1/memberBatch2";

    public static final String MEMBER_STATE_PASSIVE = "P";
    public static final String MEMBER_STATE = "memberState";

    public static final String TEST_CONTROLLER = "/api/test";

    // EntrepreneurLimit
    public static final String ENTREPRENEUR_LIMIT_CONTROLLER = "/api/entrepreneurLimit";
    public static final String ENTREPRENEUR_LIMIT_QUERY = "/v1/entrepreneurLimitQuery";

    // PARAMETER
    public static final String PARAMETER_CONTROLLER = "/api/parameter";
    public static final String PARAMETER_GET_ALL = "/v1/listAll";
    public static final String UTF_8 = "UTF-8";
    public static final String ANNUAL_INCOME_RATIO = "ANNUAL_INCOME_RATIO";
    public static final String MAX_MEMBER_LIMIT_WITH_ANNUAL_INCOME = "MAX_MEMBER_LIMIT_WITH_ANNUAL_INCOME";
    public static final String MAX_MEMBER_LIMIT = "MAX_MEMBER_LIMIT";
    public static final String MAX_ISSUER_LIMIT = "MAX_ISSUER_LIMIT";
    public static final String MAX_PROJECT_COUNT = "MAX_PROJECT_COUNT";
    public static final String PROJECT_CONTROL_DURATION = "PROJECT_CONTROL_DURATION";
    public static final String FUND_COLLECTION_TYPES = "FUND_COLLECTION_TYPES";


    //TIME FORMATS
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";


    //REG_EX :D
    public static final String REG_EX_DATE_FORMAT = "(19|20)[0-9][0-9]-(0[1-9]|1[0-2])-(0[1-9]|([12][0-9]|3[01])) ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
    public static final String REG_EX_ID_FORMAT = "[0-9]{8,11}";
    public static final String REG_EX_NAME_FORMAT = "^[a-zA-Z*\\s,.'\\-\\pL]{1,600}";
    public static final String REG_EX_SURNAME_FORMAT = "^[a-zA-Z*\\s,.'\\-\\pL]{1,600}";
    public static final String REG_EX_TITLE_FORMAT = "^[a-zA-Z0-9*\\s,.'\\-\\pL]{1,600}";
    public static final String REG_EX_ENTREPRENEUR_TYPE_FORMAT = "(L|P)";
    public static final String REG_EX_TEL_FORMAT = "([+]\\d{1,2})(\\d{10})";
    public static final String REG_EX_EMAIL_FORMAT = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
    public static final String REG_EX_BIG_DECIMAL_FORMAT = "^([1-9][0-9]{0,19})";
    public static final String REG_EX_RATE_FORMAT = "^[1-9]?[0-9]{1}$|^100$";
    public static final String REG_EX_RATE_FORMAT_FRACTIONAL = "^100(\\.[0]{1,2})?|([0-9]|[1-9][0-9])(\\.[0-9]{1,2})?$";
    public static final String REG_EX_PRJ_NAME_FORMAT = "([a-zA-Z0-9ıüğşöçĞÜŞİÖÇ ,.'-]{1,600})";
    public static final String REG_EX_PRJ_DEF_FORMAT = "([a-zA-Z0-9ıüğşöçĞÜŞİÖÇ ,.'-]{1,2000})";
    public static final String REG_EX_FUND_COL_FORMAT = "[A-Z]{4}";
    public static final String REG_EX_PRIVILEGE_FORMAT = "([a-zA-Z0-9ıüğşöçĞÜŞİÖÇ ,.'-]{1,600})";
    public static final String TCKN_SCL_YKN_VKN = "(TCKN|SCL|YKN|VKN)";
    public static final String REG_EX_PROJECT_ID = "[a-zA-Z0-9]{14,20}";
    public static final String REG_EX_PROJECT_STATE = "(PA|PS|PF|PC)";
    public static final String REG_EX_LIMIT_CURRENCY_FORMAT = "^([1-9][0-9]{1,19}|[1-9])$";
    public static final String REG_EX_Y_OR_N = "(Y|N)";
    public static final String REG_EX_ENTREPRENEUR_ID_TYPE = "(TCKN|VKN)";
    public static final String REG_EX_ENTREPRENEUR_ID_FORMAT = "[0-9]{10,11}";
    public static final String REG_EX_INC_BY_AMOUNT = "(0.[0-9][0-9]?|([1-9][0-9]{1,19}|[1-9])(.[0-9][0-9]?)?)";
    public static final String REG_EX_MESSAGE_TYPE = "[a-zA-Z]{0,50}";


    public static final String REG_EX_MEMBER_ID_TYPE_FORMAT = "(TCKN|SCL|YKN|VKN)";
    public static final String REG_EX_MEMBER_ID_FORMAT = "[0-9]{8,11}";
    public static final String REG_EX_MEMBER_NAME_FORMAT = "([a-zA-ZıüğşöçĞÜŞİÖÇ ,.'-]{1,600})";
    public static final String REG_EX_MEMBER_SURNAME_FORMAT = "([a-zA-ZıüğşöçĞÜŞİÖÇ ,.'-]{1,600})";
    public static final String REG_EX_MEMBER_TITLE_FORMAT = "^[a-zA-Z0-9\\s,.'\\-\\pL]{1,600}";
    public static final String REG_EX_MEMBER_TEL_FORMAT = "([+]\\d{1,2})(\\d{10})";
    public static final String REG_EX_MEMBER_MOBILE_FORMAT = "([+]\\d{1,2})(\\d{10})";
    public static final String REG_EX_MEMBER_MAIL_FORMAT = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
    public static final String REG_EX_MEMBER_ANNUAL_INCOME_FORMAT = "[0-9]{0,20}";
    public static final String REG_EX_SENDER_MESSAGE_REFERENCE = "[a-zA-Z0-9]{1,20}";
    public static final String REG_EX_PLATFORM_ID = "[a-zA-Z_]{1,10}";
    public static final String REG_EX_AVAILABLE_LIMIT = "[0-9]{0,26}";
    public static final String REG_EX_RESP_CODE = "[A-Z]{0,2}[0-9]{3,5}";
    public static final String REG_EX_RESP_DESC = "[\\s\\S]*";


    public static final String NAME = "NAME";
    public static final String MESSAGE_TYPE = "messageType";
    public static final String PREP_DATE_TIME = "prepDateTime";
    public static final String SENDER_MESSAGE_REFERENCE = "senderMessageReference";
    public static final String SENDER_PLATFORM_ID = "senderPlatformId";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String SUCCESS = "Başarılı";
    public static final String SUCCESS_CODE = "00000";

    public static final String MAJOR_PROJECT_AMOUNT = "MAJOR_PROJECT_AMOUNT";

    // LIMIT
    public static final String LIMIT_CONTROLLER = "/api/limit";
    public static final String LIMIT_DECREASE = "/v1/decreaseLimit";
    public static final String LIMIT_DECREASE_QUERY = "/v1/decreaseLimitQuery";
    public static final String LIMIT_INCREASE = "v1/increaseLimit";
    public static final String LIMIT_INCREASE_BY_AMOUNT = "v1/increaseLimitByAmount";


    // porile anotasyonu içindeki değerler constant omak zorunda old için enum yapılmadı
    public static final String ENV_DEV = "dev";
    public static final String ENV_ALPHA = "alpha";
    public static final String ENV_BETA = "beta";
    public static final String ENV_PROD = "prod";
    public static final String ENV_LOCAL= "local";

    public static final String KFS_PREFIX = "KFS";
    public static final String KFS_PREFIX_R_KFS = "RKFS";
    public static final String NA = "NA";
    public static final String UNLIMITED = "UNLIMITED";
    public static final String AUTHORIZATION = "Authorization";
    public static final String MEMBER_TYPE = "memberType";
    public static final String LICENCE = "licence";
    public static final String SENDER_CODE = "senderCode";
    public static final String TID_KEY = "tid";
    public static final String SRC_MAIN_RESOURCES_SWAGGER_JSON = "./src/main/resources/swagger.json";
    public static final String DEV_TOKEN = "DEV_TOKEN";
    public static final String DEV_CLIENT_IP = "DEV_CLIENT_IP";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";

    //PageRequestPageCounts
    public static final int MEMBER_PLAIN_PAGE_COUNT = 10;
    public static final String ORA_UNIQUE_CONSTRAINT = "ORA-00001";
    public static final String API_EDEVLET_LOGIN = "/api/edevlet/getLoginUrl";
    public static final String BAD_REQUEST = "Bad Request";
    public static final String UNAUTHORIZED = "Unauthorized";
    public static final String FORBIDDEN = "Forbidden";
    public static final String NOT_FOUND = "Not Found";
    public static final String UNSUPPORTED_MEDIA_TYPE = "Unsupported Media Type";
    public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
    public static final String SERVICE_UNAVAILABLE = "Service Unavailable";
    public static final String FOUND = "FOUND";
    public static final String DP_EDEVLET_HEADER_APPLICATION_KEY = "Application";
    public static final String DP_EDEVLET_HEADER_APPLICATION_VALUE = "KFS";
    public static final String EDEVLET = "/edevlet";
    public static final String API_EDEVLET_CHECK_MEMBER_STATE = "/api/edevlet/checkMemberState";
}
