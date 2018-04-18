package edu.android.apitest;

public class BasicData {
    private int resultCode ;        //결과 코드
    private String resultMsg ;      //결과 메시지
    private int numOfRows;          //한페이지 결과수
    private int pageNo;             //페이지 번호
    private int totalCount;         //전체 결과 수
    private Item[] items;
    class Item {
        private String stationName; //측정소 명
        private String mangName;    //측정망
        private String dataTime;    //측정일
        private double so2Value;    //아황산가스 농도      단위 ppm
        private double coValue;     //일산화탄소 농도      단위 ppm
        private double o3Value;     //오존 농도            단위 ppm
        private double no2Value;    //이산화 질소 농도     단위 ppm
        private int pm10Value;      //미세먼지 농도        단위 ㎍/㎥
        private int pm10Value24;    //미세먼지 24시간 예측 농도 단위 : ㎍/㎥
        private int pm25Value;      //미세먼지 농도 (PM2.5)    단위 : ㎍/㎥
        private int pm25Value24;    //미세먼지 PM25 24 시간 예측 이동 농도 단위 : ㎍/㎥
        private int khaiValue;      //통합 대기환경 수치
        private int khaiGrade;      //통합 대기환경 지수
        private int so2Grade;       //아황산 가스 지수
        private int coGrade;        //일산화 탄소 지수
        private int o3Grade;        //오존지수
        private int no2Grade;       //이산화 질소 지수
        private int pm10Grade;      //미세먼지 PM10 24시간 등급
        private int pm25Grade;      //미세먼지 PM2.5 24시간 등급
        private int pm10Grade1h;    //미세먼지 PM10 1시간 등급
        private int pm25Grade1h;    //미세먼지 PM2.5 1시간 등급
    }
}
