package com.learning.designmode.state;

public class DayState implements State {

    private static DayState dayState = new DayState();

    private DayState() {}

    public static DayState getInstance() {
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 6 || hour > 18) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("白天使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃，白天");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("呼叫中心，白天");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
