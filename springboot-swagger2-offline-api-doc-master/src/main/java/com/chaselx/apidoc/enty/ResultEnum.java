package com.chaselx.apidoc.enty;

public enum ResultEnum {
    UNKONW_ERROR("-1", "Unknown error, please contact system admin"),
    FORMAL("100000", ""),//正常，没有错误
    LOAD_ERROR("100001", "数据加载失败，请联系管理员。"),
    USER_NO_EXGIT("100002", "用户不存在"),
    USER_PWD_ERROR("100003", "用户或密码错误(如果有百应商城账号，请使用百应账号登录)"),
    SECURITY_CODE_ERROR("100004", "安全码有误"),
    CHECK_CODE_ERROR("100005", "验证码有误"),
    EXISTING("100006", "已存在"),

    SECURITY_CODE_SEND_FAILED("100007", "安全码发送失败"),
    OLD_PWD_INCORRECT("100008", "原密码不正确"),
    PWD_UPDATE_FAILED("100009", "密码修改失败"),
    PWD_RESET_FAILED("100010", "密码重置失败"),

    PHONE_SECORITY_NOT_MATCH("100011", "手机号与安全码不匹配"),
    REGIT_EXPIRED_CONTACT("100012", "注册链接已失效，请联系管理员重新发送"),
    USER_DISABLED("100013", "用户已被禁用"),
    USER_NOT_ACTIVE("100014", "该用户未激活"),
    USER_BEEN_ACTIVATED("100015", "该用户已激活"),
    COMPANY_REGIST("100016", "公司名称已认证，请联系公司管理员邀请注册"),
    REGIST_FAILED("100017", "注册失败"),
    ACTIVATION_FAILURE("100018", "激活失败"),
    SWITCH_FAILED("100019", "切换失败"),
    UNASSIGNED_PERMISSIONS("100020", "未分配权限"),

    PHONE_EXISTS("100021", "该手机号已存在"),
    USER_NOT_EXIST("100022", "用户不存在"),
    PHONE_NOT_MATCH("100023", "手机号码不匹配"),
    PWD_FORMAT_INCORRECT("100024", "密码格式不正确"),
    OPERAT_FAILED("100025", "操作失败"),
    PRINT_LIMIT_INSUFFICIENT("100026", "打印额度不足"),
    DEL_SUCCESS("100027", "删除成功"),

    LOGIN_FAILED("100028", "登陆失败"),
    PWD_NOT_EMPTY("100029", "密码不能为空"),

//    //一毛闪修
    ACCOUNT_ABNORMAL("100030", "账户异常，请联系管理员"),
    ACCOUNT_PWD_WRONG("100031", "账户密码有误，请重新输入"),
    COMPNAY_CONTRACT_NOT_DEL("100032", "该公司下存在合同，不允许删除"),
    CONTRACT_EFFECT_NOT_DEL("100033", "合同处于生效状态，不允许删除"),
    CONTRACT_REPEAT("100034", "合同号重复，不允许添加重复合同"),
    AUTHOR_CODE_ERROR("100035", "授权码错误，请发送授权码"),
    AUTHOR_CODE_EXPIRED("100036", "授权码已过期，请重新发送"),
    RE_SEND_AUTHOR_CODE("100037", "授权码发送失败，请重新发送"),


    LOGIN_TIMEOUT_AGAIN("200001", "登录超时，请重新登录"),
    DATA_MAPPING_ERROR("200002", "数据映射出错"),
    PARAMETER_ERROR("200003", "参数错误"),
    NO_ACCESS("200004", "没有权限访问"),
    DATA_EMPTY("200005", "数据为空"),
    ADD_FAILED("200006", "添加失败"),
    UPDATE_fAILED("200007", "更新失败"),
    DEL_FAILED("200008", "删除失败"),
    ADD_SUCCESS("200009", "添加成功"),
    PLEASE_LOGIN("200010", "请登录"),
    UPDATE_SUCCESS("200011", "更新成功"),
    COMPANY_CERTIFICATION("200012", "公司认证中"),


    ACTIVITY_NOT_OPEN_WEIT("200013", "活动未开启，请耐心等待"),
    PARAMETER_INCORRECT("200014", "传入参数不正确"),
    CUSTOM_FIELD_EXISTS("200015", "该自定义字段已存在"),
    CERTIFY_COMPANY("200016", "请认证公司"),
    DEL_FAILED_ASSETS_ENABLED("200017", "删除失败,选择的资产中存在在用/维修/盘点状态的资产"),
    ADD_FAILED_EXIGT_COMPANY("200018", "新增失败，该公司已被录入系统中"),
    INFORMATION_NOT_EXIST("200019", "信息不存在"),
    UPDATE_FAILED_NOT_EXIST("200020", "信息不存在"),

    /*  3 */
    SAFE_STOCK("300001", "超过安全库存上限"),
    SAFE_ABOVE("300002", "超过安全库存下限"),
    COMPNAY_ID_NOT_SAME("300003", "公司ID不一致,请联系客服"),
    /* Module 4 */
    MODULE_NAME_EXISTS("400001", "模块名已经存在"),
    DEL_SUBMODULE("400002", "无法删除，请先删除子模块"),


    /* Role 5 */
    SAVE_FAILED("500002", "保存失败"),
    ROLE_NAME_EXISTS("500003", "角色名已经存在"),
    NOT_DEL_ASSIGNED_MODULE("500004", "无法删除已分配模块的角色"),
    NOT_DEL_ASSIGNED_ROLE("500005", "无法删除已分配用户的角色"),
    SAVE_FAILED_LEAST_ROLE("500006", "保存失败，至少要有一名用户有初始角色权限"),
    NOT_DEL_BEGIN_ROLE("500007", "无法删除初始角色"),


    /* User 6 */
    USERNAME_EXISTS("600003", "用户名已经存在"),
    DEL_FAILED_ONE_BEGIN_ROLE("600004", "删除失败，至少要有一名用户有初始角色权限"),
    DEL_FAILED_USERED("600005", "正在使用，不能删除"),
    DEL_FAILED_EXISTS_NODE("600006", "此节点下存在未删除的子节点，不能删除"),
    DEL_FAILED_EXISTS_ASSETS("600007", "部分分类下有资产,无法进行删除"),
    ADD_FAILED_NODE_REPEAT("600008", "此节点重复，不能添加"),
    REPEAT_ASSET("600009", "资产重复"),


    ASSET_SN_REPEAT_UPDATE("600010", "您输入的资产SN重复，请修改！"),
    ASSET_CODE_REPEAT_UPDATE("600011", "您输入的资产编码重复，请修改！"),
    COMPANY_CERTIFIED("600012", "公司已被认证"),
    ROOT_NODE_NOT_DEL("600013", "该节点为根节点，不可删除！"),
    UPLOAD_BUSINESS_LICENSE_CAR("600014", "请上传营业执照电子版或名片"),
    COMPANY_ID_NOT_EXIST("600015", "公司ID不存在"),
    FILL_COMPANY_NAME("600016", "请填写公司名称"),
    FILL_CORRECT_COMPANY_NAME("600017", "请填写正确的公司名称"),
    NOT_ALLOW_UPDATE_ADMIN_STATUS("600018", "不允许更改超级管理员的状态"),
    DEL_FAILED_USER_EXIST_ASSET("600019", "此用户名下有资产，不能删除"),
    DEL_FAILED_USER_EXIST("600020", "存在用户，不能删除"),


    NOT_DEL_SUPER_ADMIN("600021", "不能删除超级管理员"),
    TRANSFER_ADMIN_ROLE("600022", "转让超级管理员权限前必须给当前超级管理员分配角色"),
    SELECT_ROLE("600023", "请选择一个角色"),
    COMPANY_CERTIFICAT_FAILED("600024", "公司认证失败"),
    GET_NOT_LOGIN_INFORMATION("600025", "获取不到当前登陆人信息"),
    COMPANY_UNREGISTERED("600026", "你当前企业未注册资产管理系统"),
    LOGIN_WECHAT("600027", "请使用企业微信登陆"),
    NOT_BIND_ACCOUNT("600028", "你未绑定任何账户，请联系当前企业管理员"),


//
    /* User 7 */
    COMPANY_NOT_EXIST("700001", "公司不存在"),
    MAIL_ADDR_UPDATE_FAILED("700002", "邮寄地址更新失败"),

//
    /* Upload 8 */
    UPLOAD_IMAGE_INCORRECT_FORMAT("800001", "上传图片格式不正确"),
    PIG_GT_LIMIT("800002", "图片已超出最大限制"),
    SELECT_UPLOAD("800003", "请选择要上传的文件"),
    UPLOAD_TEMPLATE_INCONSISTENT("800004", "上传模板不符"),
    NO_VAILD_DATA("800005", "没有有效的数据"),
    PART_UPLOAD_OK("800006", "部分上传成功"),
    LIST_NAME_REPEAT("800007", "列名重复"),
    CUSTOM_attri_no_exist("800008", "自定义属性不存在"),
    UPLOAD_FAILED("800009", "上传失败"),
    UPLOAD_GT_LIMIT("800010", "上传数据量超过上限"),

//
    /* Asset */
    NO_ASSETS("110001", "没有资产"),
    SELECT_PRUCHASE_TIME("110002", "请选择购入时间"),
    PRUCHASE_TIME_FORMAT_ERROR("110003", "购入时间格式不正确"),
    ADMIN_ADD_ASSETS_TRY_AGAIN("110004", "其他管理员正在新增资产，请稍后再试。"),
    QR_CODE_INVALID("110005", "二维码无效或已关联资产。"),
    SELECT_RIGHT_ASSET_CLASS("110006", "请选择正确的资产类别。"),
    DEL_FAILED_YI_CONCAT("110007", "不能删除或修改关联到一毛闪修合同中的资产信息。"),

//
    /* 退库 */
    SELECT_STORAGE_PLACE("120001", "请选择存放地"),
    STORAGE_AREAR_NOT_EXIST("120002", "存放地不存在"),
    RETURN_DATE_NO_EMPTY("120003", "退库时间不能为空"),

//
    /* 部门、人员、资产类别、使用地 */
//    ht("130001", ""),
    PERSON_CODE_EXISTS("130002", "人员编号存在"),
    DEPARTMENT_CODE_EXISTS("130003", "部门编号已存在"),
    SAMECOM_ASSET_NAME_EXISTS("130004", "同一公司下,资产分类名称不可重复,添加失败"),
    ASSET_CODE_NO_EMPTY("130005", "资产编码不能为空"),
    ASSET_TYPE_MONTH_INTGER("130006", "资产类别使用月份只能输入正整数"),
    DEPARTMENT_NAME_EXISTS("130007", "部门名称已存在"),
    SAMECOM_ASSECT_CODE_EXISTS("130008", "同一公司下,资产分类编码不可重复,添加失败"),
    SAMECOM_ASSECT_COMPANY_CODE_EXISTS("130009", "公司名称已存在"),
    DEPARTMENT_COMPANY_CODE_EXISTS("130010", "公司编号已存在"),
    DEPARTMENT_COMPANY_NAME_EMPTY("130011", "部门名称不能为空"),
    DEPARTMENT_PERSON_NAME_EMPTY("130012", "人员名称不能为空"),
    COMPANY_CODE_EMPTY("130113", "公司编号不能为空"),
    DEPARTMENT_CODE_EMPTY("130114", "部门编号不能为空"),
    PERSON_CODE_EMPTY("130115", "人员编号不能为空"),
    FATHER_CODE_EMPTY("130116", "父节点不能为空"),


    /**领用**/
    CONSUMING_DATE_NO_EMPTY("131000", "领用时间不能为空"),


    /**资产**/
    ASSET_NAME_NO_EMPTY("130013", "资产名称不能为空"),
    CATEGORY_ID_NO_EMPTY("130014", "资产类别不能为空"),
    INBOUND_DATE_NO_EMPTY("130015", "入库时间不能为空"),
    SOURCE_NO_EMPTY("130016", "来源不能为空"),
    BRANDS_NO_EMPTY("130017", "品牌不能为空"),
    BUY_TIME_NO_EMPTY("130018", "购入时间不能为空"),
    CATEGORY_ID_NOT_EXISTS("130019", "资产类别不存在"),
    SOURCE_NOT_EXIST("130020", "来源不存在"),
    DEPARTMENT_NOT_EXISTS("130021", "部门名称不存在"),
    DEPARTMENT_PERSON_NOT_EXISTS("130022", "报修人员名称不存在"),
    MAINTAIN_DATE_NO_EMPTY("130023", "报修时间不能为空"),
    MAINTAIN_CAUSE_NO_EMPTY("130024", "报修原因不能为空"),
    MAINTAIN_STATE_NO_EMPTY("130025", "报修状态不能为空"),
    MAINTAIN_STATE_NOT_EXISTS("130026", "报修状态不存在"),
    PERSON_NOT_EXISTS("130027", "报修状态不存在"),
    STORAGE_PLACE_EMPTY("130128", "使用地不能为空"),
    STORAGE_NOT_EXISTS("130129", "使用地不存在"),
    ASSET_NOT_EXISTS("130130", "资产不存在"),
    DEPARTMENT_ID_NOT_EXISTS("130031", "部门不存在"),
    PERSON_NAME_EXISTS("130032", "人员名称存在"),

    /**转移**/
    TRANSFER_DATE_NO_EMPTY("131000", "转移时间不能为空"),
//
    /* 盘点 */
    ASSET_NUM_ERROR("140001", "盘点资产数量为零，请重新选择范围。"),
//            ht("140002", ""),
//
    /* 标签打印收费 */
    ORDER_INCORREDT("880001", "支付订单有误，请联系管理员。"),
    ORDER_PAID("880002", "该订单已支付。"),

    /* 物料 */
    SAMECOM_METARIAL_TYPE_NAME_EXISTS("770001", "同一公司下,物料分类名称不可重复,操作失败"),
    SAMECOM_METARIAL_TYPE_CODE_EXISTS("770002", "同一公司下,物料分类编码不可重复,操作失败"),
    SAMECOM_METARIAL_NAME("770003", "同一公司下,物料名称不可重复,操作失败"),
    SAMECOM_METARIAL_CODE("770004", "同一公司下,物料编码不可重复,操作失败"),
    DEL_FAILED_STOCK_NO_ZERO("770005", "库存不为零,删除失败"),
    SAMECOM_WAREHOUSE_NAME_EXISTS("770006", "同一公司下,仓库名称不可重复,操作失败"),
    SAMECOM_WAREHOUSE_CODE_EXISTS("770007", "同一公司下,仓库编码不可重复,操作失败"),
    DEL_FAILED_PART_TYPE_EXISTS("700008", "部分分类下存在物料,无法进行删除"),
    INCORRECT_UP_CLASS("700009", "上级分类选择有误"),



//
    /* Rule */
    LENGTH_OVERRUN("990001", "长度超限"),
    INVITATION_CODE_FAILED("990002", "邀请码新增额度失败"),
    NO_QUERY_COMPANY_IFNO("990003", "未查询到邀请公司信息");

//    ht("990004", ""),
//    ht("990005", ""),
//    ht("990006", ""),
    



    private String code;
    private String msg;


    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
