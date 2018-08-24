package com.seen.mvp.mymvplib.bean;

/**
 * Created by limeng on 2016/10/19.
 */

public class DetailTaskResultEntity {
    private String taskId;
    private String taskType;
    private String taskState;
    private String replyState;
    private long repairTime;
    private String repairPerson;
    private String repairCondition;
    private int oldRead;
    private String oldBarCode;
    private String newNumber;
    private String newBarCode;
    private int newRead;
    private String newManufactory;
    private String valve;
    private String newModel;
    private String cap;
    private String cardSwitcher;
    private String newCaliber;
    private String failureReason;
    private String subsequentMeasure;
    private String cardId;
    private String newMeterBox;
    private String newMeterBoxCap;
    private String maintainedReason;
    private boolean lockedValve;
    private String rejectedReason;
    private boolean unableSwitchCard;
    private String remark;
    private String extend;
    private String operatePerson;//操作人

    private String meterReaderTel;//抄表员电话
    private String meterReaderName;//抄表员名字
    private String ownerTel; //业主电话

    //2017年3月1日添加
   /* private int lastDisassembleRead; // '上次拆表读数',  number*/
    private String reinstallBarCode; //'复装条码',string
    private int reinstallRead;//'复装读数',number
    private int confirmRead;//'确认读数（默认上次拆表读数）',number
    private int newStartCode;//'新表底码',number


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public String getReplyState() {
        return replyState;
    }

    public void setReplyState(String replyState) {
        this.replyState = replyState;
    }

    public long getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(long repairTime) {
        this.repairTime = repairTime;
    }

    public String getRepairPerson() {
        return repairPerson;
    }

    public void setRepairPerson(String repairPerson) {
        this.repairPerson = repairPerson;
    }

    public String getRepairCondition() {
        return repairCondition;
    }

    public void setRepairCondition(String repairCondition) {
        this.repairCondition = repairCondition;
    }

    public int getOldRead() {
        return oldRead;
    }

    public void setOldRead(int oldRead) {
        this.oldRead = oldRead;
    }

    public String getOldBarCode() {
        return oldBarCode;
    }

    public void setOldBarCode(String oldBarCode) {
        this.oldBarCode = oldBarCode;
    }

    public String getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(String newNumber) {
        this.newNumber = newNumber;
    }

    public String getNewBarCode() {
        return newBarCode;
    }

    public void setNewBarCode(String newBarCode) {
        this.newBarCode = newBarCode;
    }

    public int getNewRead() {
        return newRead;
    }

    public void setNewRead(int newRead) {
        this.newRead = newRead;
    }

    public String getNewManufactory() {
        return newManufactory;
    }

    public void setNewManufactory(String newManufactory) {
        this.newManufactory = newManufactory;
    }

    public String getValve() {
        return valve;
    }

    public void setValve(String valve) {
        this.valve = valve;
    }

    public String getNewModel() {
        return newModel;
    }

    public void setNewModel(String newModel) {
        this.newModel = newModel;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCardSwitcher() {
        return cardSwitcher;
    }

    public void setCardSwitcher(String cardSwitcher) {
        this.cardSwitcher = cardSwitcher;
    }

    public String getNewCaliber() {
        return newCaliber;
    }

    public void setNewCaliber(String newCaliber) {
        this.newCaliber = newCaliber;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getSubsequentMeasure() {
        return subsequentMeasure;
    }

    public void setSubsequentMeasure(String subsequentMeasure) {
        this.subsequentMeasure = subsequentMeasure;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getNewMeterBox() {
        return newMeterBox;
    }

    public void setNewMeterBox(String newMeterBox) {
        this.newMeterBox = newMeterBox;
    }

    public String getNewMeterBoxCap() {
        return newMeterBoxCap;
    }

    public void setNewMeterBoxCap(String newMeterBoxCap) {
        this.newMeterBoxCap = newMeterBoxCap;
    }

    public String getMaintainedReason() {
        return maintainedReason;
    }

    public void setMaintainedReason(String maintainedReason) {
        this.maintainedReason = maintainedReason;
    }

    public boolean isLockedValve() {
        return lockedValve;
    }

    public void setLockedValve(boolean lockedValve) {
        this.lockedValve = lockedValve;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    public boolean isUnableSwitchCard() {
        return unableSwitchCard;
    }

    public void setUnableSwitchCard(boolean unableSwitchCard) {
        this.unableSwitchCard = unableSwitchCard;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getOperatePerson() {
        return operatePerson;
    }

    public void setOperatePerson(String operatePerson) {
        this.operatePerson = operatePerson;
    }

    public String getMeterReaderTel() {
        return meterReaderTel;
    }

    public void setMeterReaderTel(String meterReaderTel) {
        this.meterReaderTel = meterReaderTel;
    }

    public String getMeterReaderName() {
        return meterReaderName;
    }

    public void setMeterReaderName(String meterReaderName) {
        this.meterReaderName = meterReaderName;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }

    public String getReinstallBarCode() {
        return reinstallBarCode;
    }

    public void setReinstallBarCode(String reinstallBarCode) {
        this.reinstallBarCode = reinstallBarCode;
    }

    public int getReinstallRead() {
        return reinstallRead;
    }

    public void setReinstallRead(int reinstallRead) {
        this.reinstallRead = reinstallRead;
    }

    public int getConfirmRead() {
        return confirmRead;
    }

    public void setConfirmRead(int confirmRead) {
        this.confirmRead = confirmRead;
    }

    public int getNewStartCode() {
        return newStartCode;
    }

    public void setNewStartCode(int newStartCode) {
        this.newStartCode = newStartCode;
    }
}
