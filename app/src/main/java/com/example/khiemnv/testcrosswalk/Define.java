package com.example.khiemnv.testcrosswalk;

/**
 * Created by quannt on 10/12/2016.
 * <p>
 * Define constants and environment variables
 */

public class Define {
    static final int REQUEST_CODE_SEND_PASSWORD = 0x0A;

    public static final String RAND_EMAIL_POSIX = "@lisa-app.com";
    public static final String RAND_NAME_PREFIX = "未設定lis";
    public static final int RAND_ID_COUNT = 16;
    public static final int RAND_PASS_COUNT = 8;
    public static final int RAND_NAME_COUNT = 8;
    public static final int RAND_EMAIL_COUNT = 8;
    public static final int FIX_BIRTHDAY = 1;
    public static final int FIX_BIRTH_MONTH = 1;
    public static final int FIX_BIRTH_YEAR = 1996;
    public static final int REQUEST_OK = 1;
    public static final int REQUEST_FAILED = -1;
    public static final int DURATION_FAVORITE = 70;
    public static final int DURATION_DISCOUNT = 70;
    public static final int LIKED = 1;
    public static final int PERFORMER_NEW = 1;
    public static final int BLOG_EVENT = 1;
    public static final int HAVE_BLOG_CAMPAIGN = 1;
    public static final int CAMPAIGN_IN_PROGRESS = 1;
    public static final int VIDEO_MODE_VALUE_DIRECT = 0;
    public static final int VIDEO_MODE_VALUE_PEEP = 1;
    public static final int SUBMIT_OK = 1;
    public static final String ERROR_FORMAT_STRING = "&amp;";
    public static final String REPLACE_STRING = "&";
    public static final int TEL_AUTHEN_OK = 1;


    public static final String CONST_UTF_8 = "utf-8";

    public static final int FREE_POINT_POSITION = 2;
    public static final String[] MENU_ITEM_TAGS = {"Profile", "Point", "FreePoint", "Message", "NotificationSetting", "FavoritePerformer", "BlockedPerformer", "GuideUsage", "GuideFee", "Term", "PrivatePolicy", "Faq", "Logout"};

    public static final String[] BLOOD_GROUP = {"ひみつ", "A型", "B型", "O型", "AB型"};
    public static final String[] MEMBER_AREA = {"ひみつ", "北海道", "東北地方", "関東地方",
            "甲信越地方", "東海地方", "北陸地方", "近畿地方", "中国地方",
            "四国地方", "九州地方", "沖縄", "海外", "宇宙"};

    public static final String[] PERFORMER_AREA = {"指定なし", "ひみつ", "北海道", "東北", "中部", "関東", "近畿",
            "中国", "四国", "九州", "沖縄", "海外", "", "甲信越", "北陸", "東海", "青森",
            "岩手", "宮城", "秋田", "山形", "福島", "茨城", "栃木", "群馬", "埼玉", "千葉",
            "東京", "神奈川", "新潟", "富山", "石川", "福井", "山梨", "長野", "岐阜", "静岡",
            "愛知", "三重", "滋賀", "京都", "大阪", "兵庫", "奈良", "和歌山", "鳥取", "島根",
            "岡山", "広島", "山口", "徳島", "香川", "愛媛", "高知", "福岡", "佐賀", "長崎", "熊本", "大分", "宮崎", "鹿児島"};

    public static final String[] NOTIFICATION_TIME = {"00:00", "01:00", "02:00", "03:00", "04:00",
            "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
            "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};

//    public static final String[] BLOG_CATEGORIES = {"New", "Well", "Face", "DS", "Follow", "Nice",
//            "Movie","Swimwear","Yukata","Halloween","Xmas","Valentine","Pet","Pajamas","FreeStyle",
//            "Academy", "Monomane"};
//    public static final String[] BLOG_CATEGORIES_TITLE = {"新着", "人気", "顔出し", "DSチャット", "お気に入り", "マイいいね",
//            "動画","水着","浴衣","ハロウィン","クリスマス","バレンタイン","ペット","パジャマ","フリースタイル",
//            "学園コスプレ", "ものまね"};

    // knv added
    public static final String[] PRODUCTS_FOR_MESSAGING = {
            "lisa108jpy"
    };

    public static final String[] PRODUCTS_FOR_VIDEO_CHAT = {
            "lisa540jpy", "lisa1080jpy", "lisa3240jpy"
    };

    public static final String[] BLOG_CATEGORIES = {"New", "Well", "Movie", "Face", "Follow", "Nice"};
    public static final String[] BLOG_CATEGORIES_TITLE = {"新着", "人気", "動画", "顔出し", "お気に入り", "マイいいね"};
    public static final String TAG_EXCEPTION = "IDK-Exception";
    public static final String IMAGE_TEMP_PREFIX = "image_message";
    public static final String IMAGE_JPG_POSTFIX = ".jpg";
    public static final String FULL_WIDTH_SPACE = "　";  // u+3000;
    public static final String CONST_NOT_POINT = "notpoint";
    public static final String CONST_OPEN = "open";
    public static final String CONST_SP = "SP";
    public static final String CONST_LISA_ANDROID = "LisaAndroid";

    public static String AVATARS_ASSETS_FOLDER = "avatars";

    public static final class ParamKeys {
        public static final String MEMBER_INFO_CHANGE = "member_info_change";
    }

    /**
     * API path
     */
    public static class API {
        public static final String API_INC_CONFIG = "incConfig.json";
        public static final String API_INC_PAYMENT_CONFIG = "incPaymentConfig.json";
        public static final String API_MEMBER_REGISTER = "incMemberRegist.json";
        public static final String API_MEMBER_INFO_CONFIRM = "incMemberInfoConfirm.json";
        public static final String API_FAVORITE_DELETE = "incMemberFavoriteDel.json";
        public static final String API_UNFAVORITE_DELETE = "incMemberUnFavoriteDel.json";
        public static final String API_UNFAVORITE_ADD = "incMemberUnFavoriteAdd.json";
        public static final String API_MEMBER_SEND_PASSWORD = "incMemberSendPassword.json";

        public static final String API_MEMBER_MAIL_LIST = "incMemberMailList.json";
        public static final String API_MEMBER_MAIL_LINE = "incMemberMailLine.json";
        public static final String API_MEMBER_MAIL_DELETE = "incMemberMailDelete.json";
        public static final String API_MEMBER_MAIL_PAY_POST = "incMemberMailPayPost.json";

        public static final String API_MEMBER_INFO = "incMemberInfo.json";
        public static final String API_PERFORMER_ALL_ACTIVE_LIST = "incPerformerAllActiveList.json";
        public static final String API_PERFORMER_PROFILES = "incPerformerProfiles.json";
//        public static final String API_PERFORMER_ALL_ACTIVE_LIST = "incPerformerAllActiveList.161213.json";
//        public static final String API_PERFORMER_PROFILES = "incPerformerProfiles.161213.json";
        public static final String API_FAVORITE_ADD = "incMemberFavoriteAdd.json";
        public static final String API_MEMBER_CHANGE_INFO = "incMemberInfoChange.json";
        public static final String API_MEMBER_CHANGE_AVATAR = "incMemberInfoChange.json";
        public static final String API_BLOG_LIST = "incPerformerBlogData.json";
        public static final String API_LIKE_BLOG = "incPerformerBlogNice.json";

        public static final String API_PUSH_NOTIFICATION_REGIST = "incMemberNoticeLisaRegist.json";
        public static final String API_PUSH_NOTIFICATION_GET = "incMemberNoticeLisa.json";
        public static final String API_PUSH_NOTIFICATION_CHANGE_FOR_EMAIL = "incMemberInfoChange.json";
        public static final String API_PUSH_NOTIFICATION_CHANGE_FOR_PUSH = "incMemberNoticeLisaChange.json";
        public static final String API_SMS_POST = "incMemberSmsPost.json";
        public static final String API_SMS_CHECK = "incMemberSmsCheck.json";
        public static final String API_CAMPAIGN_LIST = "incMemberCampaignList.json";
        public static final String API_WEB_TOKEN = "getToken.php";
    }

    /**
     * App web urls
     */
    public static class WebUrl {
        public static final String URL_PURCHASE = "member/point/purchase/";
        public static final String API_ADD_POINT_FOR_ANDROID = "member/point/payment/addPointForAndroid.php";
        public static final String USAGE_GUIDE = "member/guide/beginner/";
        public static final String FEE = "member/guide/charge/";
        public static final String TERM = "member/guide/terms/";
        public static final String POLICY = "member/guide/privacy/";
        public static final String CALL_VIDEO = "performer/videochat/";
        public static final String FAQ = "member/support/thread/";
        public static final String URL_INQUIRY_HISTORY = "member/support/thread/";
        // static (knv added)
        public static final String S_TERMS = "file:///android_asset/s_web_terms.html";
    }

    /**
     * All fields
     */
    public static class Fields {
        public static final String FIELD_VERSION = "version";
        public static final String FIELD_WEB_VIEW_BASE_URL = "webviewBaseUrl";
        public static final String FIELD_WEB_SOCKET_URL = "webSocketUrl";
        public static final String FIELD_OWNER_NAME = "ownerName";
        public static final String FIELD_ID = "id";
        public static final String FIELD_PASS = "pass";
        public static final String FIELD_CHANGE_PASS = "changePass";
        public static final String FIELD_EMAIL = "mail";
        public static final String FIELD_NAME = "name";
        public static final String FIELD_BIRTH_YEAR = "birthYear";
        public static final String FIELD_BIRTH_MONTH = "birthMonth";
        public static final String FIELD_BIRTH_DAY = "birthDay";
        public static final String FIELD_STATUS = "status";
        public static final String FIELD_RESPONSE = "response";
        public static final String FIELD_MEMBER = "member";
        public static final String FIELD_BANNER_CODE = "bannerCode";
        public static final String FIELD_OPTION15 = "option15";
        public static final String FIELD_OPTION28 = "option28";
        public static final String FIELD_CODE = "code";
        public static final String FIELD_POINT = "point";
        public static final String FIELD_NOT_OPEN_COUNT = "notOpenCount";
        public static final String FIELD_JOIN_DATE = "joinDate";
        public static final String FIELD_BIRTH_DATE = "birth";
        public static final String FIELD_FAVORITE = "favorite";
        public static final String FIELD_BUY_TIMES = "buyTimes";
        public static final String FIELD_FREE_MAIL = "freeMail";
        public static final String FIELD_NOT_OPEN_SUPPORT_COUNT = "notOpenSupportCount";
        public static final String FIELD_BIRTH_AGE = "birthAge";
        public static final String FIELD_AGE = "age";
        public static final String FIELD_BLOOD = "blood";
        public static final String FIELD_TELEAUTH = "teleauth";
        public static final String FIELD_TELEAUTH_OK = "telauthOk";
        public static final String FIELD_UN_FAVORITE_CODES = "unFavoriteCodes";
        public static final String FIELD_UN_FAVORITE_LIST = "unFavorite";
        public static final String FIELD_SUBMIT = "submit";
        public static final String FIELD_ERROR_MESSAGE = "errorMessage";
        public static final String FIELD_ERROR_MESSEGE = "errorMessege";
        public static final String FIELD_NOTIFICATION = "notice";
        public static final String FIELD_NEW = "new";

        public static final String FIELD_PERFORMER = "performer";
        public static final String FIELD_PERFORMER_CODE = "performerCode";
        public static final String FIELD_MAIL_CODE = "mailCode";
        public static final String PERFORMER_NAME = "performerName";
        public static final String FIELD_PERFORMER_ORIGINAL_NAME = "performerOrignalName";
        public static final String FIELD_PERFORMER_IMAGE = "performerImage";
        public static final String FIELD_PERFORMER_STATUS = "performerStatus";
        public static final String FIELD_PERFORMER_STATUS_STRING = "performerStatusString";
        public static final String FIELD_PERFORMER_POS = "performerPos";
        public static final String FIELD_PERFORMER_AGE = "performerAge";
        public static final String FIELD_MEMBER_CODE = "memberCode";
        public static final String FIELD_MEMBER_NAME = "memberName";
        public static final String FIELD_SUBJECT = "subject";
        public static final String FIELD_BODY = "body";
        public static final String FIELD_OPEN = "open";
        public static final String FIELD_RETURN = "return";
        public static final String FIELD_SEND_MAIL = "sendMail";
        public static final String FIELD_SEND_DATE = "sendDate";
        public static final String FIELD_PRESENT_POINT = "presentPoint";
        public static final String FIELD_ATTACH_IMAGE = "attachImage";
        public static final String FIELD_LIST_EMAIL = "list";
        public static final String FIELD_ROW_COUNT = "rows";
        public static final String FIELD_MAIL = "mail";
        public static final String FIELD_LIMIT = "limit";
        public static final String FIELD_CATEGORY = "category";
        public static final String FIELD_PAGE_NUMBER = "pageNumber";
        public static final String FIELD_SORT = "sort";
        public static final String FIELD_ORDER = "order";
        public static final String FIELD_AREA = "area";
        public static final String ASC = "asc";
        public static final String FIELD_PERFORMER_IMAGE_URL = "performerImageUrl";
        public static final String FIELD_PAGE = "pageNumber";
        public static final String FIELD_POST_ID = "postId";
        public static final String FIELD_MESSAGE = "message";
        public static final String FIELD_TERMINAL = "terminal";
        public static final String FIELD_TOKEN = "token";
        public static final String FIELD_SECRET = "secret";
        public static final String FIELD_PN_MAIL = "pushMail";
        public static final String FIELD_PN_LOGIN = "pushLogin";
        public static final String FIELD_PN_BLOG = "pushBlog";
        public static final String FIELD_PN_MAGA = "pushMaga";
        public static final String FIELD_PN_REJECT_FROM = "rejectFr";
        public static final String FIELD_PN_REJECT_TO = "rejectTo";
        public static final String FIELD_TELNO = "telno";
        public static final String FIELD_BIG = "big";
        public static final String FIELD_SMALL = "small";
        public static final String FIELD_ATTACH_IMAGE_URL = "attachImageUrl";
        public static final String FIELD_PAYMENT = "payment";
        public static final String FIELD_IMAGE = "image";
        public static final String FIELD_MODE = "mode";
        public static final String FIELD_PN_LOGIN_MAIL = "loginMail";
        public static final String FIELD_PN_MAIL_MAGA = "mailMaga";
        public static final String FIELD_ITEM_ID = "itemId";
        public static final String FIELD_YEN = "yen";
        public static final String FIELD_MINUTE = "minute";
        public static final String FIELD_JSON = "json";
        public static final String FIELD_SIGNATURE = "signature";
        public static final String FIELD_PERFORMER_PUBLIC = "performerPublic";
    }

    /**
     * Application custom actions
     */
    public static class IntentActions {
        public static final int ACTION_PRIORITY = 100;
        public static final String ACTION_CHAT = BuildConfig.APPLICATION_ID + ".CHAT";
        public static final String ACTION_BLOCK = BuildConfig.APPLICATION_ID + ".BLOCK";
        public static final String ACTION_FAVORITE = BuildConfig.APPLICATION_ID + ".FAVORITE";
        public static final String ACTION_OPEN_HOME = BuildConfig.APPLICATION_ID + ".OPEN_HOME";
        public static final String ACTION_PERFORMER_DETAIL = BuildConfig.APPLICATION_ID + ".PERFORMER_DETAIL";
        public static final String ACTION_BLOG_DETAIL = BuildConfig.APPLICATION_ID + ".BLOG_DETAIL";
        public static final String ACTION_FREE_POINT = BuildConfig.APPLICATION_ID + ".FREE_POINT";
    }

    /**
     * KEY INTENT EXTRAS
     */
    public static class IntentExtras {
        public static final String LIST_PERFORMERS = "list_performers";
        public static final String POSITION = "position";
        public static final String PERFORMER_CODE = "performer_code";
        public static final String PERFORMER_NAME = "performer_name";
        public static final String CODE = "code";
        public static final String URL = "url";
        public static final String PERFORMER_IMAGE = "performer_image";
        public static final String PERFORMER = "performer";
        public static final String POST_ID = "post_id";
        public static final String VIDEO_MODE = "video_mode";
        public static final String PERFORMER_AGE = "performer_age";
    }

    public static class PerformerStatus {
        public static final int OFF_LINE = 0;
        public static final int CALL_WAITING = 1;
        public static final int CALLING = 2;
        public static final int TWO_SHOT = 3;
        public static final int MESSAGE_WAITING = 4;
        public static final int UNKNOWN = 5;
    }

    public enum OnlineStatus {
        OFFLINE("メッセージ待ち"),
        CALL_WAITING("ビデオ通話待ち"),
        CALLING("ビデオ通話中"),
        TWO_SHOT("2SHOT中"),
        UNKNOW(""),
        MESSAGE_WAITING("メッセージ待ち"),
        WAITING("待ち合わせ中");
        private String name;

        OnlineStatus(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static OnlineStatus getStatusFromCode(int code) {
            switch (code) {
                case 0:
                    return OFFLINE;
                case 1:
                    return CALL_WAITING;
                case 2:
                    return CALLING;
                case 3:
                    return TWO_SHOT;
                case 4:
                    return WAITING;
                case 5:
                    return MESSAGE_WAITING;
                default:
                    return UNKNOW;

            }
        }

        public static int getBackgroundDrawableFromCode(int code) {
            return code;
        }

        public static int getBackgroundDrawableCornerFromCode(int code) {
            return code;
        }

        public static int getBackgroundTransFromCode(int code) {
            return code;
        }

        public static int getColorRessourceFromCode(int code) {
            return code;
        }
    }

    public static String[] SMS_TRANSMISSION_ERROR = {"既にポイント追加済", "期限内に再登録",
            "既に他アカウントで電話番号利用済", "会員コードor電話番号がデタラメ"};

    public static String[] SMS_TOKEN_ERROR = {"既にポイント追加済", "登録情報が存在しない", "会員コードorトークンがデタラメ"};
    public static final int SMS_SUBMIT_SUCCESS = 0;
    public static final String SMS_SENDER = "Info";

    public static class DateFormat {
        public static final String YYYYMMDD = "yyyy-mm-dd";
    }

    public static final String FIELD_ID = "id";
    public static final String FIELD_PASS = "pass";
    public static final String FIELD_EMAIL = "mail";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_BIRTH_YEAR = "birthYear";
    public static final String FIELD_BIRTH_MONTH = "birthMonth";
    public static final String FIELD_BIRTH_DAY = "birthDay";
    public static final String FIELD_STATUS = "status";
    public static final String FIELD_RESPONSE = "response";
    public static final String FIELD_MEMBER = "member";
    public static final String FIELD_BANNER_CODE = "bannerCode";
    public static final String FIELD_OPTION15 = "option15";
    public static final String FIELD_OPTION28 = "option28";
    public static final String API_MEMBER_REGISTER = "incMemberRegist.json";
    public static final String API_MEMBER_INFO_CONFIRM = "incMemberInfoConfirm.json";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_POINT = "point";
    public static final String FIELD_NOT_OPEN_COUNT = "notOpenCount";
    public static final String FIELD_JOIN_DATE = "joinDate";
    public static final String FIELD_BIRTH_DATE = "birth";
    public static final String FIELD_FAVORITE = "favorite";
    public static final String FIELD_BUY_TIMES = "buyTimes";
    public static final String FIELD_FREE_MAIL = "freeMail";
    public static final String FIELD_NOT_OPEN_SUPPORT_COUNT = "notOpenSupportCount";
    public static final String FIELD_BIRTH_AGE = "birthAge";
    public static final String FIELD_AGE = "age";
    public static final String FIELD_BLOOD = "blood";
    public static final String FIELD_AREA = "area";
    public static final String FIELD_TELEAUTH = "teleauth";
    public static final String FIELD_TELEAUTH_OK = "telauthOk";
    public static final String FIELD_UN_FAVORITE_CODES = "unFavoriteCodes";
    public static final String FIELD_UN_FAVORITE_LIST = "unFavorite";
    /*
        add field for incMemberInfoChange.json
     */
    public static final String FIELD_CHANGE_INFO = "changeInfo";
    public static final String FIELD_CHANGE_PASS = "changePass";
    /*
        end
     */
    public static final String API_MEMBER_INFO = "incMemberInfo.json";
    public static final String API_MEMBER_INFO_CHANGE = "incMemberInfoChange.json";

    public static final class SETTINGS {
        public static final int DEFAULT_LIMIT = 20;
        public static final int PN_SETTING_ON = 1;
        public static final String DEFAULT_SORT_FIELD = "send_date";
        public static final String DEFAULT_SORT_ORDER = "desc";
        public static final int DEFAULT_AVAILABLE_FREE_MAIL = 3;
        public static final int WEB_ZOOM_PERCENT = 73;  // 73% ZOOM
        public static final int MESSAGE_POINT_PAYMENT_COST = 50;
    }
}
