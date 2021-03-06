package com.cxp.shop_api.result;

public class ResultStatus {

    //user 2xx
    public final static int USER_NAME_DISABLED = 201;           //用户名不可用  重复了
    public final static int USER_Add_ERROR = 202;               //用户注册失败
    public final static int USER_LOGIN_ERROR = 203;             //用户登录失败
    public final static int USER_PASSWORD_CHANGE_ERROR = 204;   //修改密码失败
    public final static int USER_ID_ERROR = 205;                //账号ID不存在
    public final static int USER_ID_LOGIN_OVERDUE = 206;        //用户过期或未登录
    public final static int USER_MONEY_INSUFFICIENT = 207;      //买家购物余额不足
    public final static int USER_MONEY_CHANGE_ERROE = 208;      //用户余额改变失败
    public final static int USER_PHOTO_UPLOAD_ERROE = 209;      //用户头像上传失败
    public final static int USER_PHOTO_CHANGE_ERROE = 210;      //用户头像改变失败

    //店铺 3xx
    public final static int STORE_NOT_REGISTER = 301;           //未开通 卖家功能
    public final static int STORE_NAME_DISABLED = 302;          //店铺名不可用  重复了
    public final static int STORE_REGISTER_ERROR = 303;         //用户开通卖家功能 失败
    public final static int STORE_ID_ERROR = 304;               //店铺ID不存在
    public final static int STORE_EQUAL_USER_ERROR = 305;       //用户买自己店铺的商品


    //商品 4xx
    public final static int COMMODITY_NOT_FOUND = 401;          //找不到sql符合条件的某一个商品
    public final static int COMMODITY_STOCK_INSUFFICIENT = 402; //商品库存不足买家购买
    public final static int COMMODITY_INSERT_ERROR = 403;       //商品添加失败
    public final static int COMMODITY_UPDATE_ERROR = 404;       //商品修改失败

    //订单5xx
    public final static int ORDER_List_ERROR = 501;             //订单添加失败
    public final static int ORDER_Add_ERROR = 502;              //订单添加失败
    public final static int ORDER_NOT_FIND = 503;               //订单找不到
    public final static int ORDER_ID_USER_ID_MISMATCHING = 504; //订单id 和 买家id不匹配
    public final static int ORDER_SUBMIT_ERROR = 505;           //订单支付错误


    //购物车  6xx
    public final static int SHOPCAR_Add_ERROR = 601;      //购物车添加失败

    //房产局 7xx
    public final static int FAVORITE_ADD_ERROR = 701;      //收藏夹添加失败
    public final static int FAVORITE_DEL_ERROR = 702;      //收藏夹添加失败

}
