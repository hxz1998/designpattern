package com.learning.designmode.state;

public class NightState implements State {

    private static NightState nightState = new NightState();

    private NightState() {}

    public static NightState getInstance() {
        return nightState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour > 6 && hour < 18) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("紧急，晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("报警，按下警铃！");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("晚上通话，留言");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
