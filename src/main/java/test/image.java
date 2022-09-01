package test;

import java.util.HashMap;
import org.json.JSONObject;
import com.baidu.aip.imageclassify.AipImageClassify;

public class image {
	//设置APPID/AK/SK
    public static final String APP_ID = "25058188";
    public static final String API_KEY = "GTrc7z4pGXWbY8sRlmTKsGm8";
    public static final String SECRET_KEY = "ZRNTUmV8klGNMnytAuA4GjmQiCnQDIUy";

    public static void main(String[] args) {
        //初始化
        AipImageClassify aic = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        //图片路径作为参数，此处使用相对路径，相对于项目根目录而言，即cat.jpg放在项目根目录下
        String path = "向日葵.jpg";
        //返回JSON格式的数据
        JSONObject res = aic.advancedGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
    }

}

