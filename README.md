# :pushpin: 중고 캠핑 용품 대여 중개 플랫폼 
- 캠핌을 떠나기 위해 캠핑장비를 구매했지만 떠날 시간이 없는 개인과 캠핑을 떠나고 싶지만 고가의 캠핑장비 구매를 망설이는 개인을 중개하여 대여 거래가 이루어지도록 도와주는 플랫폼
</br>

## 1. 제작 기간 & 참여 인원
-   2023년 07월 26일 ~ 2023년 08월 18일
-   팀 프로젝트(6인)
</br>

## 2. 개발도구 및 환경

-   Java 11
-   Spring Boot 2.7.14
-   Oracle 11g
-   MyBatis 2.3.1
-   Apache Tomcat 9.0.78
-   SpringToolSuite 4
-   Gradle

</br>

## 3. 프로젝트 주요 기능
- 로그인(회원가입, ID/PW 찾기, NAVER/KAKAO 로그인)
- 상품등록
- 상품 대여하기
- 마이페이지(대여 물품 확인, 대여 승인 및 거절, 쪽지하기, 정산금액 확인, 개인 정보 변경)
</br>

## 4. 나의 역할
- 로그인 관련 기능 구현
  - 로그인, 회원가입, ID/PW 찾기 `Controller : july/lease/controller/MemberController.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/controller/MemberController.java)
  - 문자인증 API `Controller : july/lease/controller/SmsController.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/controller/SmsController.java)
  - 로그인 인터셉터 `Intercepter : july/lease/intercepter/LoginIntercepter.java` : [코드확인](https://github.com/seungchan5/Lease_project/blob/main/src/main/java/july/lease/intercept/LoginInterceptor.java)

 </br>


## 5. ERD 설계
![erd](https://github.com/seungchan5/Lease_project/assets/126455161/0fdc2ca6-686c-46a4-ab71-8d9fbdcf51f1)
