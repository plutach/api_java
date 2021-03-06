package com.example.test.common;

/* 
 * 상수모음
 */
public final class Constants {

    private Constants() {
            // restrict instantiation
    }
    
    public static final String COM_CODE_LVL00001 = "LVL00001";
    public static final String COM_CODE_LVL00002 = "LVL00002";
    public static final String COM_CODE_LVL00003 = "LVL00003";
    
    /* *******************************************************
     * 디바이스 상태
     */
    		
    /**
     * 디바이스 상태 : 동작중
     */
    public static final String COM_CODE_STA00010 = "STA00010";
    /**
     * 디바이스 상태 : 정상
     */
    public static final String COM_CODE_STA00020 = "STA00020";
    /**
     * 디바이스 상태 : 고립 (사용안함)
     */
    public static final String COM_CODE_STA00030 = "STA00030";
    /**
     * 디바이스 상태 : 오류
     */
    public static final String COM_CODE_STA00040 = "STA00040";
    /**
     * 디바이스 상태 : 재난발생
     */
    public static final String COM_CODE_STA00050 = "STA00050";
    /**
     * 디바이스 상태 : 화재수신기 이벤트 발생
     */
    public static final String COM_CODE_STA00051 = "STA00051";
    /**
     * 디바이스 상태 : 진입금지
     */
    public static final String COM_CODE_STA00060 = "STA00060";
    
    
    /* *******************************************************
     * 오류 조회 유형
     */    
    
    /**
     * 스테이션통신오류 
     */
    public static final String COM_SEARCHERROR_TYPE01 = "ComErr";
    /**
     * 배터리잔량부족
     */
    public static final String COM_SEARCHERROR_TYPE06 = "BatteryLow";

    
}
