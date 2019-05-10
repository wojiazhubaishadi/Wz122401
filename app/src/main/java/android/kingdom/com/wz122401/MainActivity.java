package android.kingdom.com.wz122401;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * test
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.et);
        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = et.getText().toString();
                if(isPhoneOrMobile(str)){
                    Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"faile",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    /**
     * 电话号码验证
     * @author ：shijing
     * 2016年12月5日下午4:34:21
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isPhone(final String str) {
        Pattern p1 = null;
        Matcher m = null;
        boolean b = false;
        p1 = Pattern.compile("^(\\+\\d{2}-)?0\\d{2,3}-\\d{7,8}$");
        m = p1.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 手机号验证
     * @author ：shijing
     * 2016年12月5日下午4:34:46
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isMobile(final String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][0-9]{10}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 手机号或者电话号
     * @author ：shijing
     * 2016年12月5日下午4:34:46
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isPhoneOrMobile(final String str) {
        return isPhone(str)||isMobile(str);
    }
    class Advertisement {}
    class AdvInfoParam{}
    class Event{
    }
    class EventInfoParam{}
    class Automated{}
    class AutomatedParam{}
    class Check{}
    class CheckParam{}
    class Patrol{}
    class PatrolParam{}
    class Restricted {}
    class RestrictedParam {}
    class BaseRespone{}
    class statisticalParam{}



    /**
     * 信息查询
     * @param param 查询条件
     * @return 广告列表
     */
    public List<Advertisement> queryAdvInfo(AdvInfoParam param){
        return null;
    }
    /**
     * 案件查询
     * @param param 查询条件
     * @return 案件列表
     */
    public List<Event> queryEventInfo(EventInfoParam param){
        return null;
    }
    /**
     * 勘察查询
     * @param param 查询条件
     * @return 勘察列表
     */
    public List<Automated> queryAutomated(AutomatedParam param){
        return null;
    }
    /**
     * 验收查询
     * @param param 查询条件
     * @return 验收列表
     */
    public List<Check> queryCheck(CheckParam param){
        return null;
    }
    /**
     * 巡查查询
     * @param param 查询条件
     * @return 巡查列表
     */
    public List<Patrol> queryPatrol(PatrolParam param){
        return null;
    }
    /**
     * 统计结果查询
     * @param param 查询条件
     * @return 广告列表
     */
    public List<Advertisement> queryStatistical(statisticalParam param){
        return null;
    }
    /**
     * 广告区域查询
     * @param param 查询条件
     * @return 广告区域列表
     */
    public List<Restricted> queryRestricted(RestrictedParam param){
        return null;
    }
    /**
     * 添加区域
     * @param obj 区域
     * @return 结果
     */
    public BaseRespone addRestricted(Restricted obj){
        return null;
    }

    /**
     * 添加广告信息
     * @param obj 广告信息
     * @return 结果
     */
    public BaseRespone addAdvInfo(Advertisement obj){
        return null;
    }
    /**
     * 添加案件
     * @param obj 案件
     * @return 结果
     */
    public BaseRespone addEventInfo(Event obj){
        return null;
    }
    /**
     * 添加勘察信息
     * @param obj 勘查信息
     * @return 结果
     */
    public BaseRespone addAutomated(Automated obj){
        return null;
    }
    /**
     * 添加验收信息
     * @param obj 验收信息
     * @return 结果
     */
    public BaseRespone addCheck(Check obj){
        return null;
    }
    /**
     * 添加巡查信息
     * @param obj 查询条件
     * @return 结果
     */
    public BaseRespone addPatrol(Patrol obj){
        return null;
    }

    /**
     * 修改区域
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updateRestricted(int id, int flag){
        return null;
    }

    /**
     * 修改广告信息
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updateAdvInfo(int id, int flag){
        return null;
    }
    /**
     * 修改案件
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updateEventInfo(int id, int flag){
        return null;
    }
    /**
     * 修改勘察信息
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updateAutomated(int id, int flag){
        return null;
    }
    /**
     * 修改验收信息
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updateyCheck(int id, int flag){
        return null;
    }
    /**
     * 修改巡查信息
     * @param id id
     * @param flag 标记
     * @return 结果
     */
    public BaseRespone updatePatrol(int id, int flag){
        return null;
    }

    /**
     * 删除区域
     * @param id id
     * @return 结果
     */
    public BaseRespone deleteRestricted(int id){
        return null;
    }

    /**
     * 删除广告信息
     * @param id id
     * @return 结果
     */
    public BaseRespone deleteAdvInfo(int id){
        return null;
    }
    /**
     * 删除案件
     * @param id id
     * @return 结果
     */
    public BaseRespone deleteEventInfo(int id){
        return null;
    }
    /**
     * 删除勘察信息
     * @param id id
     * @return 结果
     */
    public BaseRespone deleteAutomated(int id){
        return null;
    }
    /**
     * 删除验收信息
     * @param id id
     * @return 结果
     */
    public BaseRespone deleteCheck(int id){
        return null;
    }
    /**
     * 删除巡查信息
     * @param id id
     * @return 结果
     */
    public BaseRespone deletePatrol(int id){
        return null;
    }
}
