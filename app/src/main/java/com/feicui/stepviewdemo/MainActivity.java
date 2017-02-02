package com.feicui.stepviewdemo;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.feicui.stepview.HorizontalStepView;
import com.feicui.stepview.VerticalStepView;
import com.feicui.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VerticalStepView stepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stepView = (VerticalStepView) findViewById(R.id.step_view);
        showSetpView();
    }

    private void showSetpView() {
//---------------------------水平stepView-----------------------
//        List<StepBean> stepsBeanList = new ArrayList<>();
//        StepBean stepBean0 = new StepBean("接单", 1);
//        StepBean stepBean1 = new StepBean("打包", 1);
//        StepBean stepBean2 = new StepBean("出发", 0);
//        StepBean stepBean3 = new StepBean("送单", -1);
//        StepBean stepBean4 = new StepBean("完成", -1);
//        StepBean stepBean5 = new StepBean("支付", -1);
//        stepsBeanList.add(stepBean0);
//        stepsBeanList.add(stepBean1);
//        stepsBeanList.add(stepBean2);
//        stepsBeanList.add(stepBean3);
//        stepsBeanList.add(stepBean4);
//        stepsBeanList.add(stepBean5);
//
//        stepView.setStepViewTexts(stepsBeanList)
//                .setTextSize(16)//set textSize
//                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))//设置StepsViewIndicator完成线的颜色
//                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this, android.R.color.holo_green_light))//设置StepsViewIndicator未完成线的颜色
//                .setStepViewComplectedTextColor(ContextCompat.getColor(this, android.R.color.holo_blue_bright))//设置StepsView text完成线的颜色
//                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, android.R.color.holo_orange_light))//设置StepsView text未完成线的颜色
//                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))//设置StepsViewIndicator CompleteIcon
//                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
//                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention));//设置StepsViewIndicator AttentionIcon


//----------------------------垂直stepView-----------------------
        List<String> list0 = new ArrayList<>();
        list0.add("您已提交定单，等待系统确认");
        list0.add("您的商品需要从外地调拨，我们会尽快处理，请耐心等待");
        list0.add("您的订单已经进入亚洲第一仓储中心1号库准备出库");
        list0.add("您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中");
        list0.add("您的订单已打印完毕");
        list0.add("您的订单已拣货完成");
        list0.add("扫描员已经扫描");
        list0.add("打包成功");
        list0.add("您的订单在京东【华东外单分拣中心】发货完成，准备送往京东【北京通州分拣中心】");
        list0.add("您的订单在京东【北京通州分拣中心】分拣完成");
        list0.add("您的订单在京东【北京通州分拣中心】发货完成，准备送往京东【北京中关村大厦站】");
        list0.add("您的订单在京东【北京中关村大厦站】验货完成，正在分配配送员");
        list0.add("配送员【包牙齿】已出发，联系电话【130-0000-0000】，感谢您的耐心等待，参加评价还能赢取好多礼物哦");
        list0.add("感谢你在京东购物，欢迎你下次光临！");


        stepView.setStepsViewIndicatorComplectingPosition(list0.size() - 2)//设置完成的步数
                .reverseDraw(false)//default is true
                .setTextSize(14)
                .setStepViewTexts(list0)//总步骤
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(this, android.R.color.white))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.attention));//设置StepsViewIndicator AttentionIcon

    }
}
